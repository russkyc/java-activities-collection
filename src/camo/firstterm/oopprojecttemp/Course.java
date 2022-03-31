/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camo.firstterm.oopprojecttemp;

import java.util.ArrayList;

/**
 *
 * @author Harly
 */
public class Course {

    private String courseCode;
    private String courseDescription;
    private ArrayList<Subject> subjects;
    
    public Course() {
        this.courseCode = "";
        this.courseDescription = "";
        this.subjects = null;
    }
    
    public Course(String cc, String cd, ArrayList<Subject> s) {
        this.courseCode = cc;
        this.courseDescription = cd;
        this.subjects = s;
    }
    
    public void setCourseCode(String cc) {
        this.courseCode = cc;
    }
    
    public void setCourseDescription(String cd) {
        this.courseDescription = cd;
    }
    
    public void setSubjects(ArrayList<Subject> s) {
        this.subjects = s;
    }
    
    public String getCourseCode() {
        return this.courseCode;
    }
    
    public String getCourseDescription() {
        return this.courseDescription;
    }
    
    public ArrayList<Subject> getSubjects() {
        return this.subjects;
    }
    
}
