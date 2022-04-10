package labs_examples.labs;

import sun.lwawt.macosx.CSystemTray;

public class Primitive_data {
    public static void main(String[] args) {

        // please demonstrate the use of all 5 arithmetic operators below (+, -, *, /, %)
        int addition = 2+2;
        System.out.println("2+2: " + addition);
        int subtraction = 8-4;
        System.out.println("8-4: " + subtraction);
        int multiplication = 3 * 4;
        System.out.println("3 * 4: " + multiplication);
        int division = 10/5;
        System.out.println("10/5: " + division);
        int modules = 5%3;
        System.out.println("5%3: " + modules);




        // please dmonstrate the use of off 5 relational operators below - we'll cover "if-statements" shortly so I'll give you a hint here
        int a = 10;
        int b = 11;

        boolean trueVal = true;
        boolean falsVal = false;


        if (a < b){
            System.out.println("1# a is less than b");
        }
        // now your turn :)
        if (a <= b) {
            System.out.println("2# a is less than or equal to b");
        }

        if (a > b){
            System.out.println("3# a is greater than b");
        }
        else  {
            System.out.println("3# a is not greater than b");
        }

        if (a >=b){
            System.out.println("4# a is greater or equal to than b");
        }
        else   {
            System.out.println("4# a is not greater than or equal  to  b");
        }

        if (a ==b) {
            System.out.println("5# a is equal to b");
        }
        if (!(a == b)){
            System.out.println("6# I made it true");
        }
        // please demonstrate the use of all 4 logical operators below (AND, short-circuit AND, OR, short-circuit OR, XOR (exclusive or), and NOT )
        if (a < 20 & b < 20){
            System.out.println(" both a & b are less than 20");
        }
        // now your turn :)
        int valA = 1;
        int valB = 2;
        System.out.println("4 logical operators below \n" +
                "     int valA = 25;   int valB = 40; ");
        System.out.println("valA & valB= " + (valA & valB));
        System.out.println("valA | valB= " + (valA | valB));
        System.out.println("valA ^ valB= " + (valA ^ valB));
        //System.out.println("valA & valB= " + (valA & valB));
       // System.out.println("valA & valB= " +  ~valA);
        int valAb = 1;
        int valBc = 2;

        System.out.println("4 logical operators below");
        System.out.println("valA");
        System.out.println("int    = " + valAb);
        System.out.println("binary = " + String.format("%8s", Integer.toBinaryString(valAb)).replace(' ', '0'));

        System.out.println("valB");
        System.out.println("int    = " + valBc);
        System.out.println("binary = " + String.format("%8s", Integer.toBinaryString(valBc)).replace(' ', '0'));

        System.out.println("valA & valB");
        int andOperation = (valAb & valBc);
        System.out.println("int    = " + andOperation);
        System.out.println("binary = " + String.format("%8s", Integer.toBinaryString(andOperation)).replace(' ', '0'));


        System.out.println("Relational Operators \n"
        + "..........................................");
        int aRelational = 7;
        int bRelational = 11;


        System.out.println("A is " + aRelational + " and b is " +b);
        // == operator
        System.out.println(aRelational == bRelational);
        // ! operator
        System.out.println(aRelational !=bRelational);
        // > operator
        System.out.println(aRelational > bRelational);  // false

        // < operator
        System.out.println(aRelational < bRelational);  // true

        // >= operator
        System.out.println(aRelational >= bRelational);  // false

        // <= operator
        System.out.println(aRelational <= bRelational);  // true
    }
}
