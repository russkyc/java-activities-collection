package camo.testapp;

public class Person {

    private String firstName;
    private String lastName;
    private String address;

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
