package com.richmond.edu.webservices;

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

public class ScheduleReadWorker extends SwingWorker<ArrayList<ScheduleBean>, String>
{
    private ArrayList<ScheduleBean> schedules = new ArrayList<ScheduleBean>();
    private final File              file;
    private final JTextArea         logTextArea;

    public ScheduleReadWorker(File file, JTextArea logTextArea)
    {
        this.file = file;
        this.logTextArea = logTextArea;
    }

    public ArrayList<ScheduleBean> getSchedules()
    {
        return schedules;
    }

    @Override
    protected ArrayList<ScheduleBean> doInBackground() throws Exception
    {
        // Do stuff here...
        final CellProcessor[] processors = new CellProcessor[]
        {
                null,       // crs_crn
                null,       // crs_dept
                null,       // crs_subj
                null,       // crs_nmbr
                null,       // crs_sect
                null,       // crs_title
                null,       // reg_title
                null,       // crs_day
                null,       // time_start
                null,       // time_end
                null,       // session_date_start
                null,       // session_date_end
                null,       // crs_hrs
                null,       // date_start
                null,       // date_end
                null,       // crs_fee
                null,       // sched_note
                null,       // crs_status
                null,       // inst1_first
                null,       // inst1_last
                null,       // inst1_netid
                null,       // inst2_first
                null,       // inst2_last
                null,       // inst2_netid
                null,       // crs_loc
                null,       // st_flag
                null,       // sem_nmbr
                null,        // st_crs_desc
                null,       // crs_gened
                null,       // crs_topic
                null,       // crs_term
                null,       // crs_campus
                null        // crs_pterm
        };
        schedules.clear();
        try
        {
            CsvBeanReader inFile = new CsvBeanReader(new FileReader(file), CsvPreference.EXCEL_PREFERENCE);
            try
            {
              final String[] header = inFile.getCSVHeader(true);
              ScheduleBean schedule;
              while((schedule = inFile.read(ScheduleBean.class, header, processors)) != null)
              {
                  schedules.add(schedule);
                  publish(schedule.getCrs_subj() + "-" + schedule.getCrs_nmbr() + "\n");
                  publish(schedule.toXML());  // + "\n");
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
            return schedules;
        }
        // Success:
        publish("Success: Read " + schedules.size() + " schedules\n");
        // FIX ME!! Check to see if everything is OK

        // Blah blah final results
        return schedules;
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
