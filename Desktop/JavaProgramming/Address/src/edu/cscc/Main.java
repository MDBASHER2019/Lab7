package edu.cscc;


/**
 * Name: Md Basher
 * Date: 10/7/2019
 * ProectName: Lab 6: Inheritance – Address, PersonAddress, BusinessAddress Classes
 */
public class Main {

    /**
     * Declared DASH as a constant value...
     */
    private final static String DASH = "====================";

    public static void main(String[] args) {
       Address[] addressList = new Address[6];

        /**
         *Source Notes For Adding 3 PersonAddress...

         Add the following three PersonAddress objects to the list.

         PersonName	       StreetAddress	          City	              State	                Zip

         Saul Goodman	    1200 N. Fourth St.	      Worthington	       OH	                 43217
         Mike Ehrmentraut	 207 Main St.	          Reynoldsburg	       OH	                 43211
         Gustavo Fring	     2091 Elm St.	          Pickerington	       OH	                 43191

         */

        addressList[3] = new PersonAddress("1200 N. Fourth St.", "Worthington", "OH", "43217",
                "Saul Goodman");
        addressList[4] = new PersonAddress("207 Main St.", "Reynoldsburg", "OH", "43211",
                "Mike Ehrmentraut");
        addressList[5] = new  PersonAddress("2091 Elm St.","Pickerington", "OH", "43191",
                "Gustavo Fring");



        /**
         * Source Note For Adding the 3 Business Address...

         Add the following three BusinessAddress objects to the list.

         BusinessName	       Address2	          StreetAddress	         City	     State	            Zip

         Columbus State	       Eibling 302B	      550 East Spring St.	Columbus	  OH	            43215
         AEP	               P.O. Box 2075	         null	        Columbus	  OH	            43201
         Bill’s Coffee	       null	               2079 N. Main St.	    Columbus	  OH	            43227

         */

        addressList [0] = new BusinessAddress("550 East Spring St.", "Columbus", "OH", "43215",
                "Columbus State","Eibling 302B");
        addressList[1] = new BusinessAddress(null, "Columbus", "OH", "43201",
                "AEP","P.O. Box 2075");
        addressList[2] = new BusinessAddress("2079 N. Main St.", "Columbus", "OH", "43227",
                "Bill’s Coffee", null);

        for (Address address : addressList) {
            address.printLabel();
            System.out.println(DASH); // It can be written as System.out.println("====================");
        }
    }
}
