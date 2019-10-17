package edu.cscc;

/**
 * Name: Md Basher
 * Date: 10/7/2019
 * ProectName: Lab 6: Inheritance – Address, PersonAddress, BusinessAddress Classes
 */

/**
 * Create PersonAddress class
 1)	Select package edu.cscc and create a new Java class called PersonAddress
 2)	Make the class extend the Address class
 3)	Add a private String field personName
 4)	Generate constructor and all getters and setters
 5)	Add a printLabel() method

 The printLabel method should print (using System.out.println())
 First line – the personName field
 Second line – the StreetAddress field
 Third line – city field followed by a comma and space, the state field followed by two spaces, and the zip field *
 */

public class PersonAddress extends Address {
    /***
     * Make the class extend the Address class
     * Add a private String field personName
     */

    private String personName;

    //Generating constructor and all getters and setters respectively...

    public PersonAddress(String streetAddress, String city, String state, String zip, String personName) {
        super(streetAddress, city, state, zip);
        this.personName = personName;
    }

    // Generating getter method for PersonName class...

    public String getPersonName() {
        return personName;
    }

    // Setter Method For PersonName class...

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    // Adding a printLabel() method...

    public void printLabel(){
        /***
         * The printLabel() method should print (using System.out.println())
         * First line – the personName field
         * Second line – the StreetAddress field
         * Third line – city field followed by a comma and space, the state field followed by two spaces, and the zip field         *
         */

        System.out.println(getPersonName()+  "\n" + getStreetAddress() + "\n" +
                getCity() + ", " + getState()  +"  " + getZip());
    }

}
