/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camo.oopprojecttemp;

import java.util.ArrayList;

/**
 *
 * @author Harly
 */
public class AppRunner {
    public static void main(String[] args) {
        Subject sub1 = new Subject("COPRO1", "COMPUTER PROGRAMMING 1", 4);
        Subject sub2 = new Subject("COPRO2", "COMPUTER PROGRAMMING 2", 4);
        
        ArrayList<Subject> subjectList = new ArrayList<Subject>();
        subjectList.add(sub1);
        subjectList.add(sub2);
        
        Course c1 = new Course("BSIT", "BACHELOR OF SCIENCE IN INFORMATION TECHNOLOGY", subjectList);
        
        Student s1 = new Student("BSIT1001", c1);
        s1.setFirstName("JUAN");
        s1.setLastName("DELA CRUZ");
        s1.setAddress("ALBAY");
        
        System.out.println("Student Number: " + s1.getStudentNumber());
        System.out.println("First Name: " + s1.getFirstName());
        System.out.println("Last Name: " + s1.getLastName());
        System.out.println("Address: " + s1.getAddress());
        System.out.println();
        System.out.println("Course: " + s1.getCourse().getCourseCode());
        System.out.println("Course: " + s1.getCourse().getCourseDescription());
        
        System.out.println("Subjects: " + s1.getCourse().getSubjects().get(0).getSubjectDescription());
        System.out.println("Subjects: " + s1.getCourse().getSubjects().get(1).getSubjectDescription());
    }
}
