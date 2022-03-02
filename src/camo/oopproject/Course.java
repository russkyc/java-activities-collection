package camo.oopproject;

import java.util.List;
import java.util.ArrayList;

public class Course {

    private String courseCode;
    private String courseDescription;
    private List<Subject> subjects = new ArrayList<Subject>();

    Course(){
        setCourseCode("");
        setCourseDescription("");
    }

    Course(String courseCode, String courseDescription){
        setCourseCode(courseCode);
        setCourseDescription(courseDescription);
    }

    Course(String courseCode, String courseDescription, Subject subject){
        setCourseCode(courseCode);
        setCourseDescription(courseDescription);
        setSubjects(subject);
    }

    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    public void setCourseDescription(String courseDescription) { this.courseDescription = courseDescription; }
    public void setSubjects(Subject subject){ subjects.add(subject); }

    public String getCourseCode() { return courseCode; }
    public String getCourseDescription() { return courseDescription; }
    public List<Subject> getSubjects() { return subjects; }
}
