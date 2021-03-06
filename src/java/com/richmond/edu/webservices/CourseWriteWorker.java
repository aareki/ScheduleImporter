package com.richmond.edu.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.SwingWorker;

/**
*
* @author University of Richmond Web Programmers
*/

public class CourseWriteWorker extends SwingWorker<String, String>
{
    private String                  userName        = "";
    private String                  password        = "";
    private ArrayList<CourseBean>   courses;
    private final JTextArea         logTextArea;
    private final boolean           isProduction;

    public CourseWriteWorker(String userName, String password, ArrayList<CourseBean> courses, JTextArea logTextArea, boolean isProduction)
    {
        this.userName    = userName;
        this.password    = password;
        this.courses     = courses;
        this.logTextArea = logTextArea;
        this.isProduction = isProduction;
    }

    @Override
    protected String doInBackground() throws Exception
    {
        int successes = 0;
        int failures  = 0;
        for(CourseBean course:courses)
        {
            try
            {
                String courseWriteResult = CourseWriter.createCourse(userName, password, course, isProduction);
//                String courseWriteResult = "YUP";
                if(courseWriteResult.equals(""))
                {
                    ++successes;
                    // Success:
                    publish(course.crs_subj + course.crs_nmbr + ": [Success]" + "\n");
                }
                else
                {
                    ++failures;
                    publish(course.crs_subj + course.crs_nmbr + ": [Failure] " + courseWriteResult + "\n");
                }
            }
            catch(Exception e)
            {
                publish(course.crs_subj + course.crs_nmbr + ": [Exception] " + e.getMessage() + "\n");
            }
            if(isCancelled())
            {
                
                publish("Cancelled\n");
                return("[CANCELLED] " + successes + " successes and " + failures + " failures.\n");
            }
        }
        // Success:
        publish("Success: Read " + courses.size() + " courses\n");
        return("[COMPLETED] " + successes + " successes and " + failures + " failures.\n");
    }

    @Override
    protected void process(List<String> messages)
    {
        for(String message:messages)
        {
            logTextArea.append(message);
        }
        super.process(messages);
    }
}
