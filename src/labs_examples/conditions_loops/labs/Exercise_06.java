package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
     public static void main(String[] args) {
         int number = 1;
         int numTwo = 0;
        while (number<100){
            System.out.println("the number is: " + number);
            numTwo =  numTwo + 1;
            number++;
            System.out.println(number);

        }
    }
}
