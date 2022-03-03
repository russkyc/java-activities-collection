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
public class Person {
    
    private String firstName;
    private String lastName;
    private String address;
    
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }
    
    public Person(String fn, String ln, String a) {
        this.firstName = fn;
        this.lastName = ln;
        this.address = a;
    }
    
    public void setFirstName(String fn) {
        this.firstName = fn;
    }
    
    public void setLastName(String ln) {
        this.lastName = ln;
    }
    
    public void setAddress(String a) {
        this.address = a;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public String getAddress() {
        return this.address;
    }
    
}
