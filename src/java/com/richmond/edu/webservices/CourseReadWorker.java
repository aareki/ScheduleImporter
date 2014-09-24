package com.richmond.edu.webservices;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.prefs.CsvPreference;

/**
 *
 * @author University of Richmond Web Programmers
 */
public class CourseReadWorker extends SwingWorker<ArrayList<CourseBean>, String>
{
    private ArrayList<CourseBean>   courses = new ArrayList<CourseBean>();
    private final File              file;
    private final JTextArea         logTextArea;

    public CourseReadWorker(File file, JTextArea logTextArea)
    {
        this.file = file;
        this.logTextArea = logTextArea;
    }

    public ArrayList<CourseBean> getCourses()
    {
        return courses;
    }

    @Override
    protected ArrayList<CourseBean> doInBackground() throws Exception
    {
        // Do stuff here...
        final CellProcessor[] processors = new CellProcessor[]
        {
            null,       // crs_dept
            null,       // crs_subj
            null,       // crs_nmbr
            null,       // crs_title
            null,       // crs_desc
            null,       // crs_notes
            null,       // crs_prereq
            null,       // crs_hours
            null,       // crs_catyr
            null,       // date_created
            null       // date_modified
        };
        courses.clear();
        try
        {
            CsvBeanReader inFile = new CsvBeanReader(new FileReader(file), CsvPreference.EXCEL_PREFERENCE);
            try
            {
              final String[] header = inFile.getCSVHeader(true);
              CourseBean course;
              while((course = inFile.read(CourseBean.class, header, processors)) != null)
              {
                  courses.add(course);
                  publish(course.getCrs_subj() + "-" + course.getCrs_nmbr() + "\n");
                  publish(course.toXML());  // + "\n");
//                  Thread.sleep(200l);
                  if(isCancelled())
                  {
                      break;
                  }
              }
            }
            catch(Exception e)
            {
                publish("Error: " + e.toString());
            }
            finally
            {
              inFile.close();
            }
        }
        catch(Exception e)
        {
            // FIX ME!!! Print some error log here...
            publish("Error: " + e.toString());
            //  return false;   // FIX ME!!! MAKE SURE WE CLEAR ENABLED PROCEED BUTTON
            return courses;
        }
        // Success:
        publish("Success: Read " + courses.size() + " courses\n");
        // FIX ME!! Check to see if everything is OK

        // Blah blah final results
        return courses;
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
