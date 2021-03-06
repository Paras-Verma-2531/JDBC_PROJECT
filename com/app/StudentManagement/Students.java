package com.app.StudentManagement;

public class Students {
    private String name,email_id,course_name,branch,phn_no,dateOfBirth;
    private int id,year,semester;
    public Students(String name, String course_name, String branch, String dateOfBirth, int year, int semester,String email_id,String phn_no)
    {
        this.name=name;
        this.course_name=course_name;
        this.branch=branch;
        this.dateOfBirth=dateOfBirth;
        this.year=year;
        this.semester=semester;
        this.email_id=email_id;
        this.phn_no=phn_no;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail_id() {
        return email_id;
    }

    public int getSemester() {
        return semester;
    }

    public int getYear() {
        return year;
    }

    public String getBranch() {
        return branch;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhn_no() {
        return phn_no;
    }

}
