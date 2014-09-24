package com.richmond.edu.webservices;

/**
 *
 * @author University of Richmond Web Programmers
 */
public class CourseBean 
{
    public String crs_dept;
    public String crs_subj;
    public String crs_nmbr;
    public String crs_title;
    public String crs_desc;
    public String crs_notes;
    public String crs_prereq;
    public String crs_hours;
//    public String sch_div;
    public String crs_catyr;
    public String date_created;
    public String date_modified;
//    public String st_flag;
//    public String sem_nmbr;

    public String getCrs_catyr()
    {
        return crs_catyr;
    }

    public void setCrs_catyr(String crs_catyr)
    {
        this.crs_catyr = crs_catyr;
    }

    public String getCrs_dept()
    {
        return crs_dept;
    }

    public void setCrs_dept(String crs_dept)
    {
        this.crs_dept = crs_dept;
    }

    public String getCrs_desc()
    {
        return crs_desc;
    }

    public void setCrs_desc(String crs_desc)
    {
        this.crs_desc = crs_desc;
    }

    public String getCrs_hours()
    {
        return crs_hours;
    }

    public void setCrs_hours(String crs_hours)
    {
        this.crs_hours = crs_hours;
    }

    public String getCrs_nmbr()
    {
        return crs_nmbr;
    }

    public void setCrs_nmbr(String crs_nmbr)
    {
        this.crs_nmbr = crs_nmbr;
    }

    public String getCrs_notes()
    {
        return crs_notes;
    }

    public void setCrs_notes(String crs_notes)
    {
        this.crs_notes = crs_notes;
    }

    public String getCrs_prereq()
    {
        return crs_prereq;
    }

    public void setCrs_prereq(String crs_prereq)
    {
        this.crs_prereq = crs_prereq;
    }

    public String getCrs_subj()
    {
        return crs_subj;
    }

    public void setCrs_subj(String crs_subj)
    {
        this.crs_subj = crs_subj;
    }

    public String getCrs_title()
    {
        return crs_title;
    }

    public void setCrs_title(String crs_title)
    {
        this.crs_title = crs_title;
    }

    public String getDate_created()
    {
        return date_created;
    }

    public void setDate_created(String date_created)
    {
        this.date_created = date_created;
    }

    public String getDate_modified()
    {
        return date_modified;
    }

    public void setDate_modified(String date_modified)
    {
        this.date_modified = date_modified;
    }


    public String toXML()
    {
        String xmlString = "<course>\n";

        xmlString += "\t<crs_dept>"    + crs_dept   + "</crs_dept>\n";
        xmlString += "\t<crs_subj>"    + crs_subj   + "</crs_subj>\n";
        xmlString += "\t<crs_nmbr>"    + crs_nmbr   + "</crs_nmbr>\n";
        xmlString += "\t<crs_title>"   + crs_title  + "</crs_title>\n";
        xmlString += "\t<crs_desc>"    + crs_desc   + "</crs_desc>\n";
        xmlString += "\t<crs_notes>"   + crs_notes  + "</crs_notes>\n";
        xmlString += "\t<crs_prereq>"  + crs_prereq + "</crs_prereq>\n";
        xmlString += "\t<crs_hours>"   + crs_hours  + "</crs_hours>\n";
        
        xmlString += "\t<crs_years>\n";
        String[] crs_catyrStringArray = crs_catyr.split(",");
        for(String catYear:crs_catyrStringArray)
        {
            xmlString+="\t\t<crs_catyr>" + catYear + "</crs_catyr>\n";
        }
        xmlString += "\t</crs_years>\n";
        xmlString += "\t<date_created>"  + date_created + "</date_created>\n";
        xmlString += "\t<date_modified>"  + date_modified + "</date_modified>\n";
        xmlString += "</course>\n";

        return xmlString;
        
    }
}
