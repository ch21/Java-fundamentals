package labs_examples.arrays.labs;

import sun.lwawt.macosx.CSystemTray;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    Scanner newEntreyFromUser = new Scanner(System.in);

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("enter a number from 1-10: ");
        int userNumEntered = newEntreyFromUser.nextInt();
        System.out.println("the element at index: "+userNumEntered+" is: "+array[userNumEntered]);

        //for(int el = 0; el < array.length; el++ ) {



            //if the number entered matches the number in array than print
//            if (userNumEntered == array[el]) {
//                System.out.println(userNumEntered);
           // }
//            else {
//                System.out.println("that number doesn exist enter aanother number: ");

            }
            // write code here

        }
