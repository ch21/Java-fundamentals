package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 1: Even or Odd
 *
 *      Write a program that gets a number between 1 and 1,000,000
 *      from the user and determines whether it is odd
 *      or even using an if statement. Print the result.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        // create scanner
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);// Why use new?

        // prompt user
        System.out.print("Enter a number between 1 and 1,000,000,000 to determine whether it is odd or even: ");
        // assign input to variable as int
        //int number = scanner.nextInt();
        int number = scanner1.nextInt();//just created to understand the process
        // write completed code here
        if (number % 2 ==0 ){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
    }
}
