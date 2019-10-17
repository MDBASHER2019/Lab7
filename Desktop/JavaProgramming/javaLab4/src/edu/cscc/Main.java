package edu.cscc;
import java.util.Scanner;
import java.util.Arrays;

// Name: MD BASHER
// Date: 09/22/2019
// ProjectName: Smart Phone Prices...

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Variable Declarations...
        int[] prices = new int[10]; // // Array of smartphone prices

        // Prompt for the data...
        System.out.print("Enter all smartphone prices: ");


        // Using "For Loop" to enter all the required data...
        // Test data: 1100 1080 900 1200 900 700 550 800 400 250
        for (int i = 0; i < prices.length; i++) {
            prices[i] = input.nextInt();
        }

        // To  Sort the cell phones price here...

        Arrays.sort(prices);


        // Displaying the  output...
        System.out.println("Three Most Expensive Phones");
        for (int i = prices.length - 1; i > prices.length - 4; i--) { // Using "for loop" to find the 3 most highest cell phones prices...
            //if (i == 6) break;
            System.out.println(prices[i]);
        }

        // Displaying the output...
        System.out.println("Three Cheapest Phones");
        for (int i = 0; i < 3; i++) { // Using "for loop" to find the 3 most cheapest phones prices..
            //if (i==3) break;
            System.out.println(prices[i]);
        }
    }
}


















