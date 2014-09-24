ScheduleImporter
================

## Ingesting Banner output Schedule Classes into Cascade Server (In Java - Web Services)

This is a presentation I gave in Atlanta Cascade Server User's Conference on September 16, 2014. 
It is an example of developing a simple Cascade SOAP Web Services in Java based on HH Web Services Java Sample Project 
examples at https://github.com/hannonhill/Webservices-Java-Sample-Project
For detail setup and configuration you can go to the above like (https://github.com/hannonhill/Webservices-Java-Sample-Project) 
and configure your machine based on the detail steps. 

This Cascade SOAP web services is developed by University of Richmond Web Programmers that ingest the University 
Course and Schedule data into cascade server. 

## This section assumes that you have configure your computer and copy of the source tree. 
To get started, you need to:
1. Configure your environment based on steps at https://github.com/hannonhill/Webservices-Java-Sample-Project
2. Copy this sample web services from the source tree
3. Copy the sample csv file to your local machine

## To run this schedule data ingestion into cascade server in Eclipse
1. Make sure to configure your environment and format your csv file based on the xml output in cascade 
2. Change the credentials to those of a user that has access to cascade server in class 
3. Enter the name of the site where it says "\<SITE-NAME\>"
4. Right click the CourseAndScheduleImporter.java class > Run as... > Java Application

## Presentation overview
Currently we fully manage and maintain the University of Richmond Course Catalog and most Schedules in Cascade Server as a single source delivery system that channels into multiple outputs. I would like to share how we develop and maintain the schedule importer written in Java. We use this tool for importing the schedule into Cascade Server. Also, I would like to share some of the Cascade lessons learned, and our best practices. 

In this presentation I will cover: 

    How we handle and manage the technical design, testing and coding for the University of Richmond Catalog and Scheduling business process start to end by:
        Creating data definition in Cascade Server (courses, and schedule)
        Preparing the banner class schedules data for ingestion into Cascade Server (this requires the least amount of massaging in preparation for ingestions)
        Handling regular (class schedules which repeat week to week) and irregular class schedules (classes not held on a regular schedule)
        How to ingest external data using web services
        General rules and workflows we follow in our business process and lessons learned
        Merging class schedule data with other content type like course catalog
        Generating different output (print xml for InDesign, html, xml, etc) 


In this presentation if time permits, I will share how we handle versioning between semesters for a particular schedule class and continual maintenance of course and schedule classes.
