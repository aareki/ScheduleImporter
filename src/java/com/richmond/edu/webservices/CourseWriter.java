/*
 * Created on July 17, 2011 by Bradley Wagner
 * 
 * Please feel free to distribute this code in any way, with or without this notice.
 */
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
        /*
            <?xml version="1.0" encoding="UTF-8"?>
            <system-data-structure>
                <!-- 
                    =====//XML STRUCTURE FOR EXIST DB=========
                    <course>
                        <courseLevel>300</courseLevel>
                        <search>
                            <crs_dept>Accounting</crs_dept>
                            <subj_nbmr>ACTT300U</subj_nbmr> (this is combination of subject and course number)
                            <crs_subj>ACCT</crs_subj>
                            <crs_nmbr>300U</crs_nmbr>
                            <crs_title>Accounting for Non-Accountants</crs_title>
                            <crs_desc>Analytical and interpretative approach to ...</crs_desc>
                        </search>
                        <crs_notes/>
                        <crs_prereq/>
                        <crs_hours>3</crs_hours>          
                        <crs_years>
                            <crs_catyr>2010-2011</crs_catyr>
                            <crs_catyr>2006-2007</crs_catyr>
                        </crs_years>
                    </course>
                 -->
                <!--
                ====//BELOW IS A DATA DEFINITION STRUCTURE IN CASCADE==
                <group identifier="course" label="Course Information" required="true">
                    <text type="radiobutton" identifier="selectedTopics" label="Selected Topics" default="False">
                        <radio-item value="True"/>
                        <radio-item value="False"/>
                    </text>
                    <text identifier="crs_dept" label="Course Department" multiple="false" required="true"/>
                    <text identifier="crs_subj" label="Course Subject" type="dropdown" required="true">
                        <dropdown-item value="">Select</dropdown-item>
                        <dropdown-item value="ACCT"/>
                        <dropdown-item value="ADED"/>
                        ............................
                        <dropdown-item value="WGSS"/>
                    </text>
                    <text identifier="crs_nmbr" label="Course Number" multiple="false" required="true"/>
                    <text identifier="crs_title" label="Title" multiple="false" required="true"/>
                    <text identifier="crs_desc" label="Description" multiple="false" multi-line="true" required="false"/>
                    <text identifier="crs_notes" label="Notes" multiple="false" multi-line="false" required="false"/>
                    <text identifier="crs_prereq" label="Prerequisites" required="false"/>
                    <text identifier="crs_hours" label="Hours" required="false"/>
                    <group identifier="crs_years" label="Course Years" multiple="false">
                        <text type="dropdown" identifier="crs_catyr" label="Course Catalog Year" multiple="true">
                            <dropdown-item value=""/>
                            <dropdown-item value="2011-2012"/>
                            <dropdown-item value="2010-2011"/>
                            <dropdown-item value="2009-2010"/>
                            <dropdown-item value="2008-2009"/>
                            <dropdown-item value="2007-2008"/>
                            <dropdown-item value="2006-2007"/>
                            <dropdown-item value="2005-2006"/>
                            <dropdown-item value="2004-2005"/>
                            <dropdown-item value="2003-2004"/>
                        </text>
                    </group>
                </group>
                <!-- THIS AREA IS JUST ONLY FOR CASCADE USE OF CONTRIBUTOR COMMENT -->
                <group identifier="comments" label="Editor's Comments/Notes">
                    <text identifier="editor_notes" label="Special Notes" multiple="false" multi-line="false" required="false"/>
                    <text identifier="editor_comments" label="Comment" multiple="false" multi-line="true" required="false"/>
                    <text identifier="publishbefore" label="DON'T Publish After" type="datetime" required="false"/> 
                    <text identifier="publishafter" label="ONLY Publish After" type="datetime" required="false"/>  
                </group>
            </system-data-structure>
         */
        Page page = new Page();
        if(isProduction)
        {
            page.setContentTypeId("88aa7bfb8da618630014df53f80f2051");
            page.setParentFolderId("88a360208da618630014df53735e56b2");
            page.setSiteId("dd3484f38da6186300a45fc1085bceb3");
        }
        else
        {
            page.setContentTypeId("a820368c8da6085f00bdf25636bbb8ea");
            page.setParentFolderId("8f53d6948da6085f00bdf2564ee3a7ad");
            page.setSiteId("dd3484f38da6186300a45fc1085bceb3");
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
            serviceLocator.setAssetOperationServiceEndpointAddress("https://cas.richmond.edu:8443/ws/services/AssetOperationService");
//            serviceLocator.setAssetOperationServiceEndpointAddress("https://bannerweb.richmond.edu");  // Keystore test from external net to verify access to SSL keystore
        }
        else
        {
            serviceLocator.setAssetOperationServiceEndpointAddress("http://vmcas.richmond.edu:8080/ws/services/AssetOperationService");
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
            createCourse("chrisfaigle", "cfaigle2011", course, false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
