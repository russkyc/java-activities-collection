package camo.oopproject.models;

public class Subject {

    private String subjectCode;
    private String subjectDescription;
    private int units;

    public Subject(){
        setSubjectCode("");
        setSubjectDescription("");
        setUnits(0);
    }

    public Subject(String newSubjectCode, String newSubjectDescription, int newUnits){
        setSubjectCode(newSubjectCode);
        setSubjectDescription(newSubjectDescription);
        setUnits(newUnits);
    }

    public void setSubjectCode(String newSubjectCode) { this.subjectCode = newSubjectCode; }
    public void setSubjectDescription(String newSubjectDescription) { this.subjectDescription = newSubjectDescription; }
    public void setUnits(int newUnits) { this.units = newUnits; }

    public String getSubjectCode() { return subjectCode; }
    public String getSubjectDescription() { return subjectDescription; }
    public int getUnits() { return units; }
}
