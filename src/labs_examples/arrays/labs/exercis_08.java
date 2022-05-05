package labs_examples.arrays.labs;
import java.util.*;
public class exercis_08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Input the number of days from the user.
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt( );

        // Declare and create an array, maybe should check if days is positive
        int[ ] temps = new int[days];

        // Input and store the temperatures in the array
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Day " + i + "'s high temp: ");
            temps[i] = console.nextInt( );
        }

        // Calculate and print the average
        int sum = 0;
        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }
        // need a cast to avoid integer division
        double average = (double) sum / temps.length;
        System.out.println("Average temp = " + average);

        // Count the number of values that were above average
        int count = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        System.out.println(count + " days were above average");
    }
}