package edu.cscc;
import java.util.Scanner;
import static java.lang.System.*;

// Name: MD BASHER
// Date: 09/12/2019
// ProjectName: BodyMassIndex Calculator...

public class Main {
    private static Scanner input = new Scanner(in);

    public static void main(String[] args) {
        // Variables are declared...
        double lbs = 0, inches = 0, meters = 0, kgs = 0, bmi = 0;
        String classification;

        // Prompt to enter the weight in lbs...

        System.out.print("Enter weight (lbs): ");
        lbs = input.nextDouble();

        // Prompt to enter the height in inches...
        System.out.print("Enter height (inches): ");
        inches = input.nextDouble();

        // Assign the calculated value below for finding the corresponding result...
        kgs = convertToKilograms(lbs);
        meters = convertToMeters(inches);
        bmi = calcBMI(kgs, meters);

        //bmi = calcBMI(lbs, inches);
        classification = bmiClassification(bmi);
        // Conditional Expressing to Identify the correct BMI classifications...

        /* if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi < 25) {
            classification = "Normal";
        } else if (bmi < 30) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }

        */

        // Output the result with the corresponding BMI values and BMI classifications as required...
        System.out.println("Calculate MBI" + "\n" + "Your BMI is " + bmi + "\n" + "Your BMI classification is " + classification);
    }

    // The method to convert lbs to kilograms...
    // Formula is given as kilograms = lbs / 2.2046
    public static double convertToKilograms(double lbs) {
        double kgs;
        kgs = lbs / 2.2046;
        return kgs;
    }

    // The method to convert inches to meters...
    // Formula is given as meters = inches / 39.37

    public static double convertToMeters(double inches) {
        double meters;
        meters = inches / 39.37;
        return meters;
    }


    // The method to calculate bmi...
    // bmi formula is given as bmi = kilograms/ (meters)^2

    //public static double calcBMI(double lbs, double inches) {
      //  double bmi;
        //double kilograms = convertToKilograms(lbs);
        //double meters = convertToMeters(inches);
        //bmi = kilograms/ Math.pow(meters, 2);
        //return bmi;
   // }

     public static double calcBMI( double kgs, double meters){
      return kgs/ Math.pow(meters, 2.0);

     }

 public static String bmiClassification( double bmi) {
     String bmiString = null;
     if (bmi < 18.5) {
         bmiString = "Underweight";
     } else if (bmi < 25) {
         bmiString = "Normal";
     } else if (bmi < 30) {
         bmiString = "Overweight";
     } else
         bmiString = "Obese";
        return bmiString;
 }
}

