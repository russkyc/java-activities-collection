package camo.testapp;

public class Student extends Person{

    private String studentId;
    private String course;

    Student(){
        this.setFirstName("");
        this.setLastName("");
        this.setAddress("");
        this.setStudentId("");
        this.setCourse("");
    }

    Student(String fn, String ln, String a, String id, String course){
        this.setFirstName(fn);
        this.setLastName(ln);
        this.setAddress(a);
        this.setStudentId(id);
        this.setCourse(course);
    }

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
