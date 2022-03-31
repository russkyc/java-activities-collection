/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camo.firstterm.oopprojecttemp;

/**
 *
 * @author Harly
 */
public class Subject {

    private String subjectCode;
    private String subjectDescription;
    private int units;
    
    public Subject() {
        this.subjectCode = "";
        this.subjectDescription = "";
        this.units = 0;
    }
    
    public Subject(String sc, String sd, int u) {
        this.subjectCode = sc;
        this.subjectDescription = sd;
        this.units = u;
    }
    
    public void setSubjectCode(String sc) {
        this.subjectCode = sc;
    }
    
    public void setSubjectDescription(String sd) {
        this.subjectDescription = sd;
    }
    
    public void setUnits(int u) {
        this.units = u;
    }
    
    public String getSubjectCode() {
        return this.subjectCode;
    }
    
    public String getSubjectDescription() {
        return this.subjectDescription;
    }
    
    public int getUnits() {
        return this.units;
    }
    
}
