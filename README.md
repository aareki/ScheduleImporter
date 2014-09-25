ScheduleImporter
================

## Ingesting Banner output Schedule Classes into Cascade Server (In Java - Web Services)
1. This is a presentation I gave in Atlanta Cascade Server User's Conference on September 16, 2014. 
2. This is a an example of Ingesting a Banner output Schedule Classes into Cascade Server (Cascade SOAP Web Services - in JAVA)
3. This Cascade SOAP Web Services program is developed based on Hannon Hill Web Services Java Sample Project. This example can be access at https://github.com/hannonhill/Webservices-Java-Sample-Project
4. For detail setup and configuration you can go to the above like (https://github.com/hannonhill/Webservices-Java-Sample-Project) and configure your machine based on the detail steps. 

## This section assumes that you have configure your computer (based on README.md at https://github.com/hannonhill/Webservices-Java-Sample-Project) and To get started, you need
1. Make sure to configure your environment based HH Web Services Java Sample Project (install Eclipse, Maven, and Git)
2. Copy/download this ScheduleImporter from the source tree
3. Create and setup all necessary cascade assets (Data Definition, Contenttype, site, parent folders). 
4. Sample Data Definition can be found at /PresentationMaterial/scheduleClassDataDefinition.xml 
5. Format your csv file based on the xml output in cascade. Sample CSV file can be found at /PresentationMaterial/shceduleDataSample.csv
6. In Eclipse open ScheduleWriter.java and change the credentials and service locator for your cascade instance 
5. Right click the CourseAndScheduleImporter.java class > Run as... > Java Application



## editing ScheduleWriter.java

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
        
        
        
        .......
        
        
        
        AssetOperationHandlerServiceLocator serviceLocator = new AssetOperationHandlerServiceLocator();
        if(isProduction)
        {
            serviceLocator.setAssetOperationServiceEndpointAddress("http://cas.domainname.edu:8080/ws/services/AssetOperationService");
        }
        else
        {
            serviceLocator.setAssetOperationServiceEndpointAddress("http://vmcas.domainname.edu:8080/ws/services/AssetOperationService");
        }
        AssetOperationHandler handler = serviceLocator.getAssetOperationService();