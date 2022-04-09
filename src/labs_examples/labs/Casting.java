package labs_examples.labs;


public class Casting {
    public static void main(String[] args){


        // please demonstrate converting an int to a double below  - example - why don't we need to cast the int to a double?
int a = 10;
double b = (double) a;
System.out.println(b);
        // please demonstrate casting a double to an int below
double c = 22.2;
int d = (int)  c;
System.out.println(d);
        // please demonstrate casting a double to a float below
double e = 777.777;
float  f = (float) e;
System.out.println(f);// still the same because float and double still the same; until it gets to a certain size
        // please demonstrate casting a double with decimal values to an short
double h = 777.777;
short I = (short) h;
System.out.println(I);
        // now print out the short value - what happened to the decimals?
    }
}
