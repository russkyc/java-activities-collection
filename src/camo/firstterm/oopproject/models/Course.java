package camo.firstterm.oopproject.models;

import java.util.List;
import java.util.ArrayList;

public class Course {

    private String courseCode;
    private String courseDescription;
    private ArrayList<Subject> subjects;

    public Course(){
        setCourseCode("");
        setCourseDescription("");
    }

    public Course(String courseCode, String courseDescription){
        setCourseCode(courseCode);
        setCourseDescription(courseDescription);
    }

    public Course(String courseCode, String courseDescription, ArrayList<Subject> newsubjects){
        setCourseCode(courseCode);
        setCourseDescription(courseDescription);
        setSubjects(newsubjects);
    }

    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    public void setCourseDescription(String courseDescription) { this.courseDescription = courseDescription; }
    public void setSubjects(ArrayList<Subject> newSubjects){ this.subjects = newSubjects; }

    public String getCourseCode() { return courseCode; }
    public String getCourseDescription() { return courseDescription; }
    public List<Subject> getSubjects() { return subjects; }
}
