package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1; //represents an integer number
        System.out.println("int i is: " + i);
        System.out.println(".....");
        boolean isEmpty = false; // represents a true or false value
        System.out.println("boolean isEmpty is: " + isEmpty);

        System.out.println(".....");

        char letter = 32; //a char is typically used to store single characters such as "a" or "z".
        System.out.println("char letter A is: "+ letter);
        letter++;
        System.out.println("now the letter is: "+ letter);
        System.out.println(".....");

        byte byteVal = 26; // is for very samll numbers
        System.out.println("The byte is: " + byteVal);
        System.out.println(".....");

        short shortVal = 2022;
        System.out.println("The shore is: " + shortVal);
        System.out.println(".....");


        long longVal = 2022l;
        System.out.println("The longval is: " + longVal);
        System.out.println(".....");

        float floatVal = 34999089089089090899.00000f;
        System.out.println("the floatval is a float: " + floatVal);
        System.out.println(".....");

        double doubleVal = 123.456;
        System.out.println("the doubleval will print out: " + doubleVal);




        // write your code below

    }

}
