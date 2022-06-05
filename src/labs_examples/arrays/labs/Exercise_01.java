package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        //int amount;
        Scanner ask_user_num = new Scanner(System.in);
        System.out.println("Enter a number that will represent the size of an array : ");
        int amount = ask_user_num.nextInt();
        //x y
        //[][][]

        System.out.println("Please enter your name: ");
       String secondAmount = ask_user_num.next();

       System.out.println("hello " + secondAmount);

        //int[] numArray= new int[amount];////
        int[] numArray = new int[amount];

        List<Integer> numList  = new ArrayList<>();
        List<Integer> numList1 = new LinkedList<>();
        //System.out.println("enter what you would like to put in the array");

        for (int el = 0; el < numArray.length; el++) {
            System.out.print("number was stored in array: " + el+"  ");
            numArray[el] = ask_user_num.nextInt();//quick question about this sanner can I reuse it to pull users input or will i have to creat new scanners for different inputs? thanks
        }
        int sumCalculated = 0;
        for(int i=0; i<numArray.length;i++){
            sumCalculated += numArray[i];
        }
        System.out.println("these are all the sumCalculated: " + sumCalculated);
    }

}