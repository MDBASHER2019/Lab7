package edu.cscc;

/**
 * Name: Md Basher
 * Date: 10/7/2019
 * ProectName: Lab 6: Inheritance – Address, PersonAddress, BusinessAddress Classes
 */
public abstract class Address {



    private String streetAddress;
    private String city;
    private String state;
    private String zip;

    //Generating constructor for Address class...

    public Address(String streetAddress, String city, String state, String zip) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Generating getters  & setters methods for the Address class...
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString() {
        return streetAddress + "\n" +
                city + ", " + state + "  " + zip + "\n";
    }

    // Adding an abstract method...

    public abstract void printLabel();


}


