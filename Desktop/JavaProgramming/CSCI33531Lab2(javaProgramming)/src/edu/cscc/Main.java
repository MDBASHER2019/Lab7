package edu.cscc;
import java.util.Scanner;

// Name        : MD BASHER
// Date        : 09/09/2019
// ProjectName : How to Calculate Hurricane Wind Scale...

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Variable Declaration...
        long speed;
        String classification = null;
        // Prompt to enter the speed of the wind...

        System.out.print("Enter wind speed (mph): ");
        speed = input.nextLong();


        // Reference Notes...
            /* Not in scale	0 – 38 mph
            Tropical storm	39 – 73 mph
            Category One Hurricane	74 – 95 mph
            Category Two Hurricane	96 – 110 mph
            Category Three Hurricane	111 – 129 mph
            Category Four Hurricane	130 – 156 mph
            Category Five Hurricane	157 mph or more
            */

        // Chain of the Ifs' Statements to validate the input data
        // And identify the Hurricane Category respectively...

        if (speed < 0){
            classification ="Invalid input, please enter a valid speed.";
        }else if (speed <= 38){
            classification = "Not in  Scale";
        } else if (speed <= 73) {
            classification = "Tropical storm";
        } else if (speed <= 95){
            classification = "Category One Hurricane";
        } else if (speed <= 110){
            classification = "Category Two Hurricane";
        } else if(speed <= 129){
            classification = "Category Three Hurricane";
        } else if (speed <= 156){
            classification = "Category Four Hurricane";
        } else  {
            classification = "Category Five Hurricane";
        }

        // Output the result of the Classifications of the Hurricanes...

        System.out.println("Classification: " + classification);
    }
}

