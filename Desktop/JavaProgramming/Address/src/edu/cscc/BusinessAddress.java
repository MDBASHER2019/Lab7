package edu.cscc;

/**
 * Name: Md Basher
 * Date: 10/7/2019
 * ProectName: Lab 6: Inheritance – Address, PersonAddress, BusinessAddress Classes
 */

/**
 * Source Notes For creating BusinessAddrss calss as below:
 * Create BusinessAddress class
 1)	Select package edu.cscc and create a new Java class called BusinessAddress
 2)	Make the class extend the Address class
 3)	Add two private String fields businessName and address2
 4)	Generate constructor and all getters and setters
 5)	Add a printLabel() method

 The printLabel method should print (using System.out.println())

 First line – the businessName field
 Second line – the address2 field if it is not null or empty
 Third line – the StreetAddress field if it is not null or empty
 Fourth line – city field followed by a comma and space, the state field followed by two spaces, and the zip field
 */
public class BusinessAddress extends Address {

    /**
     * Make the class extend the Address class
     * Add two private String fields businessName and address2
     */
    private String businessName;
    private String address2;

    // Generate constructor and all getters and setters respectively...

    public BusinessAddress(String streetAddress, String city, String state, String zip, String businessName, String address2) {
        super(streetAddress, city, state, zip);
        this.businessName = businessName;
        this.address2 = address2;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    // Adding a printLabel() method...

    @Override
    public void printLabel(){
        System.out.println(getBusinessName()); // First line – the businessName field
        if (getAddress2() != null && getAddress2() !=""){   // Conditional expression to eliminate the unnecessary space...
            System.out.println(getAddress2()); //  Second line – the address2 field if it is not null or empty
        }
        if (getStreetAddress() != null && getStreetAddress() != ""){ // Conditional expression to eliminate the unnecessary space...
            System.out.println(getStreetAddress()); // Third line – the StreetAddress field if it is not null or empty
        }
        System.out.println(getCity() + ", " + getState()  +"  " + getZip()); // Fourth line – city field followed by a comma and space,
    }                                                                        // the state field followed by two spaces, and the zip field

}
