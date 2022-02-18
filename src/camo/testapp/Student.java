package camo.testapp;

public class Student extends Person{
    private String studentId;
    private String course;

    public String getStudentId(){
        return this.studentId;
    }
    public String getCourse(){
        return this.course;
    }

    public void setStudentId(String id){
        this.studentId = id;
    }
    public void setCourse(String course){
        this.course = course;
    }
}
