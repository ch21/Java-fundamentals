package labs_examples.labs;

public class loops {
    public static void main (String[] args){

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
        }
    }
}
