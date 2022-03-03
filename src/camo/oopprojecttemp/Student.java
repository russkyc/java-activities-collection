/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camo.oopprojecttemp;

/**
 *
 * @author Harly
 */
public class Student extends Person {
    
    private String studentNumber;
    private Course course;
    
    public Student() {
        this.studentNumber = "";
        this.course = null;
    }
    
    public Student(String sn, Course c) {
        this.studentNumber = sn;
        this.course = c;
    }
    
    public void setStudentNumber(String sn) {
        this.studentNumber = sn;
    }
    
    public void setCourse(Course c) {
        this.course = c;
    }
    
    public String getStudentNumber() {
        return this.studentNumber;
    }
    
    public Course getCourse() {
        return this.course;
    }
    
}
