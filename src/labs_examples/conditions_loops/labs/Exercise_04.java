package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */
import java.util.Scanner;
public class Exercise_04 {

    public static void main(String[] args) {
//        Scanner evenNum = new Scanner(System.in);
//        System.out.println("Enter a number from 1-100");
//        int evenNumbers = evenNum.nextInt();

        for(int even = 0; even <= 100; even = even + 2  ){
            System.out.println("the number is: " + even);
        }
    }



}
