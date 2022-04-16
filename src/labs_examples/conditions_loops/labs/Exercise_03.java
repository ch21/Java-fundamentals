package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */
import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;
public class Exercise_03 {


    public static void main(String[] args) {
        Scanner months = new Scanner(System.in);

        System.out.println("Choose a number 1-12: Each number represents a month 1 being january: ");

        int pOutput = months.nextInt();
        switch (pOutput) {

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 7:
                System.out.println("June");
                break;
            case 8:
                System.out.println("July");
                break;
            case 9:
                System.out.println("August");
                break;
            case 10:
                System.out.println("September");
                break;
            case 11:
                System.out.println("October");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Choose a number between 1 and 12: thank you :) ");
        }



    }
}
