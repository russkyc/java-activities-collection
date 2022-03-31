package camo.firstterm.oopproject.models;

public class Student extends Person {

    private String studentNumber;
    private Course course;

    public Student(){
        setStudentNumber("");
        setCourse(new Course());
    }

    public Student(String newStudentNumber, Course newCourse){
        setStudentNumber(newStudentNumber);
        setCourse(newCourse);
    }

    public Student(String newFirstName, String newLastName, String newAddress, String newStudentNumber){
        setFirstName(newFirstName);
        setLastName(newLastName);
        setAddress(newAddress);
        setStudentNumber(newStudentNumber);
    }

    public Student(String newFirstName, String newLastName, String newAddress, String newStudentNumber, Course newCourse){
        setFirstName(newFirstName);
        setLastName(newLastName);
        setAddress(newAddress);
        setStudentNumber(newStudentNumber);
        setCourse(newCourse);
    }

    public String getStudentNumber(){
        return this.studentNumber;
    }
    public Course getCourse(){ return this.course; }

    public void setStudentNumber(String newStudentNumber){
        this.studentNumber = newStudentNumber;
    }
    public void setCourse(Course newCourse){ this.course = newCourse; }
}
