package com.richmond.edu.webservices;

import org.apache.axis.AxisFault;

import com.hannonhill.www.ws.ns.AssetOperationService.Asset;
import com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandler;
import com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandlerServiceLocator;
import com.hannonhill.www.ws.ns.AssetOperationService.Authentication;
import com.hannonhill.www.ws.ns.AssetOperationService.CreateResult;
import com.hannonhill.www.ws.ns.AssetOperationService.Page;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredData;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNodes;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataType;

/**
*
* @author University of Richmond Web Programmers
*/
public class CourseWriter
{
    public static String createCourse(String userName, String password, CourseBean course, boolean isProduction) throws Exception
    {
        Page page = new Page();
        if(isProduction)
        {
            page.setContentTypeId("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"); //enter cascade contenttype id - PROD
            page.setParentFolderId("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"); //enter cascade parentfolder id - PROD
            page.setSiteId("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"); //enter cascade site id - PROD
        }
        else
        {
            page.setContentTypeId("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"); //enter cascade contenttype id - QA
            page.setParentFolderId("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"); //enter cascade parentfolder id - QA
            page.setSiteId("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"); //enter cascade site id - QA
        }
        page.setName(course.crs_subj+course.crs_nmbr);
        
        // Make a structured data for the page:
        StructuredData pageStructuredData = new StructuredData();
        
        pageStructuredData.setDefinitionPath("/Page with Course Schedule Block");
        
        // Create a structured data node array
        StructuredDataNode[] courseNodeArray = new StructuredDataNode[1];
        
        // Make a new node for the course:
        StructuredDataNode courseNode = new StructuredDataNode();
        courseNode.setType(StructuredDataType.group);
        courseNode.setIdentifier("course");
        
        // Make the structured data node array for the course nodes:
        StructuredDataNode[] courseDataNodeArray = new StructuredDataNode[9];

        courseDataNodeArray[0]  = makeTextNode("crs_dept",   course.crs_dept);
        courseDataNodeArray[1]  = makeTextNode("crs_subj",   course.crs_subj);
        courseDataNodeArray[2]  = makeTextNode("crs_nmbr",   course.crs_nmbr);
        courseDataNodeArray[3]  = makeTextNode("crs_title",  course.crs_title);
        courseDataNodeArray[4]  = makeTextNode("crs_desc",   course.crs_desc);
        courseDataNodeArray[5]  = makeTextNode("crs_notes",  course.crs_notes);
        courseDataNodeArray[6]  = makeTextNode("crs_prereq", course.crs_prereq);
        courseDataNodeArray[7]  = makeTextNode("crs_hours",  course.crs_hours);

        // Make the crs_years:
        String[] crs_catyrStringArray = course.crs_catyr.split(",");
        // Make a new node for the course year:
        StructuredDataNode courseYearNode = new StructuredDataNode();
        courseYearNode.setType(StructuredDataType.group);
        courseYearNode.setIdentifier("crs_years");
        
        StructuredDataNode[] courseCatYrDataNodeArray = new StructuredDataNode[crs_catyrStringArray.length];
        for(int i=0; i<crs_catyrStringArray.length; ++i)
        {
            courseCatYrDataNodeArray[i] = makeTextNode("crs_catyr", crs_catyrStringArray[i]);
        }
        StructuredDataNodes courseCatYrNodes = new StructuredDataNodes();
        courseCatYrNodes.setStructuredDataNode(courseCatYrDataNodeArray);
        courseYearNode.setStructuredDataNodes(courseCatYrNodes);
        
        // Put the course year node into the array:
        courseDataNodeArray[8] = courseYearNode;

        
        // Make a StructuredDataNodes container for the course data node array:
        StructuredDataNodes courseDataNodes = new StructuredDataNodes();
        courseDataNodes.setStructuredDataNode(courseDataNodeArray);

        // Put the course data nodes into the course node:
        courseNode.setStructuredDataNodes(courseDataNodes);

        // Put the course node into the main node:
        courseNodeArray[0] = courseNode;

        // Make a new StructuredDataNodes container for the node array: (only one node at top level)
        StructuredDataNodes courseNodes = new StructuredDataNodes();
        courseNodes.setStructuredDataNode(courseNodeArray);

        // And set it into our outer structured data:
        pageStructuredData.setStructuredDataNodes(courseNodes);

        // And set the structured data into the page:
        page.setStructuredData(pageStructuredData);

        // Create a new asset:
        Asset asset = new Asset();

        // And put the page in it:
        asset.setPage(page);

        // Create Authentication:
        Authentication authentication = new Authentication();
        authentication.setUsername(userName);
        authentication.setPassword(password);
        //Get the AssetOperationHandlerService:
        AssetOperationHandlerServiceLocator serviceLocator = new AssetOperationHandlerServiceLocator();
        if(isProduction)
        {
            serviceLocator.setAssetOperationServiceEndpointAddress("https://cas.domainname.edu:8443/ws/services/AssetOperationService");
        }
        else
        {
            serviceLocator.setAssetOperationServiceEndpointAddress("http://vmcas.domainname.edu:8080/ws/services/AssetOperationService");
        }
        AssetOperationHandler handler = serviceLocator.getAssetOperationService();

        // Create the damn thing finally:
        try
        {
            CreateResult createResult = handler.create(authentication, asset);
            if(createResult.getSuccess().equals("true"))
            {
                return "";  // Empty string is success
            }
            else
            {
                return createResult.getMessage();
            }
        }
        catch(AxisFault af)
        {
            return af.getFaultReason();
        }
    }
    public static StructuredDataNode makeTextNode(String identifier, String text)
    {
        StructuredDataNode node = new StructuredDataNode();
        node.setType(StructuredDataType.text);
        node.setIdentifier(identifier);
        node.setText(text);
        return node;
    }
    public static void main(String[] args)
    {
        CourseBean course = new CourseBean();
        course.setCrs_dept("Accounting");
        course.setCrs_subj("ACCT");
        course.setCrs_nmbr("301U");
        course.setCrs_title("How to be an awesome accountant");
        course.setCrs_desc("Accounting course blah blah");
        course.setCrs_notes("Notes notes notes");
        course.setCrs_hours("hours");
        course.setCrs_prereq("You must be great to take this course");
        course.setCrs_catyr("2008-2009,2009-2010,2010-2011");
        try
        {
            createCourse("username", "password", course, false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
