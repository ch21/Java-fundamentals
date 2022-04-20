package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */
import java.util.Scanner;
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner wordEntered = new Scanner(System.in);//had a hard time doing it in a while loop..
        String word = null;
        System.out.println("Enter a word: ");

        word = wordEntered.nextLine();

        word = word.toLowerCase();

        System.out.println("the vowels are: ");
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {

                System.out.println(" " + word.charAt(i));
            }
        }



    }


    }




