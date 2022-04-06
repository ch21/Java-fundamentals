package labs_examples.fundamentals.examples;

/*
   This program converts gallons to liters.

   Call this program GalToLit.java.
*/

class GalToLit {
    public static void main(String args[]) {
        double gallons; // holds the number of gallons
        double gallons2;// holds the number of gallons2
        double liters;  // holds conversion to liters
        double liters2; //holds second conversion of liters

        gallons = 10; // start with 10 gallons
        gallons2 = 20;// it equals 20

        liters = gallons * 3.7854; // convert to liters
        liters2 = gallons2 * 3.7854;// second conversion


        System.out.println(gallons + " gallons is " + liters + " liters.");
        System.out.println(gallons2 + " second gallons is " + liters2 +":liters"  );
    }
}
