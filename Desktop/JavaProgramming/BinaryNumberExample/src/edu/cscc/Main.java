package edu.cscc;
import java.util.Scanner;
// Name: MD BASHER
// Date: 09/19/2019
// ProjectName: Calculating Binary Number...
public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Variable declaration...
        int value = 0;
        // Prompt to collect the data...
        System.out.print("Enter a number: ");
        value = input.nextInt();

        displayBinary(value);

    }

    //To calculate the binary values...

    public static void displayBinary(int value) {

        if (value > 0) {
            System.out.println("The division of the number " + value + "is: " + value/2 + " and the remainder is: " + value%2 );
            displayBinary(value / 2);
            System.out.print( value % 2);
            //System.out.print("The binary value of " + value + " is: ");
        }
    }
}

