package labs_examples.labs;

import sun.lwawt.macosx.CSystemTray;

public class whileloop {
    public static void main(String[] args){
        //declare a counter variable to use in our while loop (dont forget to incremetn it as you loop!)

        int counter = 0;
        int counter2 = 0;
        int counter3 = 0;

        while(counter < 10){
            System.out.println("counter = " + counter);
            counter++;
        }

        System.out.println("------------------------");
        //please use a while loop to print out every 3rd number between 0 and 100 below
        while(counter2 < 101) {
            System.out.println("counter = " + counter2);
            counter2 = counter2 + 3;
        }
        //please use a do-while loop to print out every 5th number bel0w
        System.out.println("-------------------");
        do
        {
            System.out.println("counter3 = " + counter3);
            counter3 = counter3 + 5;
        }
        while(counter3 < 100);
    }
}
