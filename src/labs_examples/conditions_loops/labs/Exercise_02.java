package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */
import  java.util.Scanner;
public class Exercise_02 {

    public static void main(String[] args) {


        // 1) create scanner (don't forget to import Scanner!)
        Scanner input = new Scanner(System.in);
        // 2) prompt user
        System.out.println("Enter a number 1 : 8 ( Each number representing " +
                        "a day of the week (1) being monday (7) being sunday. (8) other: ");
        // 3) assign input to variable as int
        int weekNum = input.nextInt();
        // 4) write completed code here

        if(weekNum == 1){
            System.out.println("Today is monday");//just curios is there better way to do it with a for loop.
        }
        else if (weekNum == 2){
            System.out.println("today is tuesday");
        }
        else if (weekNum == 3){
            System.out.println("today is wednesday");
        }
        else if (weekNum == 4){
            System.out.println("today is thursday");
        }else if (weekNum == 5){
            System.out.println("today is friday");
        }else if (weekNum == 6){
            System.out.println("today is Saturday");
        }else if (weekNum == 7){
            System.out.println("today is Sunday");
        }
        else {
           System.out.println( "Sorry your number didnt match any day of the week.");
        }

    }
}
