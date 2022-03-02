package camo.oopproject;

public class Person {

    private String firstName;
    private String lastName;
    private String address;

    public Person(){
        setFirstName("");
        setLastName("");
        setAddress("");
    }

    public Person(String newFirstName, String newLastName, String newAddress){
        setFirstName(newFirstName);
        setLastName(newLastName);
        setAddress(newAddress);
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getAddress(){
        return this.address;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName){ this.lastName = newLastName; }
    public void setAddress(String newAddress){
        this.address = newAddress;
    }

}
