/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author russ
 */
public class Student extends Person {
    private String studentId;
    private String course;
    
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getAddress(){
        return this.address;
    }
    public String getCourse(){
        return this.course;
    }
    public String getStudentId(){
        return this.studentId;
    }
    
    public void setFirstName(String fn){
        this.firstName = fn;
    }
    public void setLastName(String ln){
        this.lastName = ln;
    }
    public void setAddress(String ad){
        this.address = ad;
    }
    public void setCourse(String ce){
        this.course = ce;
    }
    public void setStudentId(String id){
        this.studentId = id;
    }
}
