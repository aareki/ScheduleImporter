package com.richmond.edu.webservices;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author University of Richmond Web Programmers
 */
public class CourseAndScheduleImporter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.setProperty("javax.net.ssl.trustStore","lib/keystore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword","richmond"); 
        System.setProperty("javax.net.ssl.keyStore","lib/keystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword","richmond"); 
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
              public void run()
              {
                JFrame mainFrame = new JFrame("CourseAndScheduleImporter");
                mainFrame.setSize(840, 700);
                CSIPanel csiPanel = new CSIPanel();
                mainFrame.add(csiPanel);
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainFrame.setVisible(true);
              }
            });
    }
}
