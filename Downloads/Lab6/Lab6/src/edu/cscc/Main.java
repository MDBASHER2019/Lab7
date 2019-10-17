package edu.cscc;

public class Main {

    public static void main(String[] args) {
	    Address[] addressList = new Address[6];

	    // TODO Add 3 person addresses to list

        // TODO Add 3 business address to list

	    for (Address address : addressList) {
	        address.printLabel();
            System.out.println("====================");
        }
    }
}
