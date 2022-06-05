package labs_examples.conditions_loops.labs;
import java.util.ArrayList;

public class Exercise_12 {


        public static void main(String[] args) {

            // please demonstrate how to declare an ArrayList below
            ArrayList<String> coolCars = new ArrayList<String>();
            // please demonstrate how to add values to an array ArrayList
            coolCars.add("Lamborghini");
            coolCars.add("Tesla");
            coolCars.add("Bmw");

            System.out.println("Arraylist: " + coolCars);
            // please demonstrate how to remove values from an ArrayList
            coolCars.remove(0);
            System.out.println("Arraylist: " + coolCars);
            // please demonstrate how to retrieve values from an ArrayList
            coolCars.add("Lambo");
            System.out.println("Arraylist: " + coolCars);
            // please demonstrate at least two other useful methods available
            coolCars.remove(0);
            System.out.println("Arraylist: " + coolCars);
            coolCars.clear();
            System.out.println("Arraylist: " + coolCars);
            // to us when we use ArrayLists
            // idk what they mean by this one
        }
    }


