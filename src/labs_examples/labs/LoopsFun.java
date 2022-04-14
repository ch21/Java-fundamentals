package labs_examples.labs;

import com.sun.jmx.snmp.SnmpUnknownSubSystemException;
import labs_examples.labs.two.forloops;

public class LoopsFun{

    public static void main (String[] args){


        //forloops.earlyExit();
        // please use a for loop below to print out every number between 0 & 100
        for(int num = 0; num <101; num++){
            System.out.println("Number = " + num);
        }

        //please use another for loop below to print out every odd number between 100 and 0 in descending order
        for(int number= 0; number<100;number = number + 3){
            System.out.println("odd numbers: " + number);
        }
        //pleasure demonstrate "nesting" two for loops below

        for(int a =0;a<=10;a++){
            for(int b=0;b<=5;b++){
                System.out.println("b is: " + b);
            }
            System.out.println("a is: " + a);
            System.out.println("-------------------------------------");
        }
        int val = 0;

        for (int i= 0;i<100;i++){
            val= val + 1;
            System.out.println("val = " +val);
        }

        System.out.println("---------------------------------");
        int hour = 5;
        switch (hour){
            case 1:
                System.out.println("it is one o'clock");
                break;

            case 2:
                System.out.println("It is two oclock ");
                break;
            case 3:
                System.out.println("It is three o'clock");
                break;
            case 4:
                System.out.println("it is four o'clock");
                break;
            case 5:
                System.out.println("It is five o'clock");
        }

        System.out.println("---------------------------------");
        int hours = 3;
        switch (hours) {
            case 1:
                System.out.println("it is one o'clock");


            case 2:
                System.out.println("It is two oclock ");

            case 3:
                System.out.println("It is three o'clock");

            case 4:
                System.out.println("it is four o'clock");

            case 5:
                System.out.println("It is five o'clock");
        }
    }


}



