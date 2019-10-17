package edu.cscc;
import java.util.Arrays;

import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// Array Practicing...
        int[] counts;
        double[] values;
        //int size = 5;
        counts = new int[5];

        counts [0]= 1;
        counts [1]=2;
        counts [2]= counts [1] * 3;
        counts [3]= counts [2] + 4;
        counts [4] ++;
        //values = new double[size];
        /**
        System.out.println("The zeroth element is " + counts[0] + "\n" + "The 1st element is " + counts[1] +"\n" +
                "The 2nd element is " + counts[2] +"\n"
                + "The 3rd element is " + counts[3] +"\n"
                + "The 4th element is " + counts[4]
        );

         */

        //Testing While loop

    /**
        int i = 0; while (i < counts.length) {
            System.out.println(counts[i]);
            i++;
        }

    */

        /**
        for (int i = 0; i < 4; i++) {
            System.out.println(counts[i]);
         }

         */

        //System.out.println(Arrays.toString(counts));


        // Traversal Examples...


        /**
        for (int i = 0; i < counts.length; i++) {
            counts[i] = (int) Math.pow(counts[i], 2.0);
            System.out.println(counts[i]);
        }

         */


        //Search Example...

        double [] a = {1,2, 3, 4};

            // TODO need to fix this method
        /**
        public static int search(double[] counts, double target) {
            //int target = 5;
            for (int i = 0; i <counts.length; i++) {
                if (a[i] == target) {
                    return i;
                }
            }
            return -1;
        }

         */
        //TODO need to fix this method...

        /**
        public static double sum(double[] a) {
            double total = 0.0;
            for (int i = 0; i < a.length; i++) {
                total += a[i];
                return total;
            }

        }*/


        randomArray(5);

    }

        int [] b  = {3, 4, 5, 6, 7};

    public static int[] randomArray(int num) {
        Random random = new Random();


        int[] b = new int[5];

        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(100);
        }
        return b;
    }
}
