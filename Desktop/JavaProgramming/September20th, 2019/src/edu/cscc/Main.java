package edu.cscc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        countUp(3);
        System.out.println("Have a nice day!");
    }
    public  static  void countUp(int n){
        if (n==0){
            System.out.println("Blastoff!");

        }else
            countUp(n-1);
        System.out.println(n);


    }
}
