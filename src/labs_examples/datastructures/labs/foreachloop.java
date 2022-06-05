package labs_examples.datastructures.labs;

import java.util.ArrayList;
import java.util.List;

public class foreachloop {

        public static void main(String[] args) {

            // please declare an array or arraylist below
            List<Integer> listOfNumbers = new ArrayList<>();
            // please populate that array or arraylist
            listOfNumbers.add(1);
            listOfNumbers.add(2);
            listOfNumbers.add(3);
            listOfNumbers.add(4);
            listOfNumbers.add(5);
            System.out.println(listOfNumbers);
            // please use a For Each Loop to print each element
            for(int number : listOfNumbers){
                System.out.println(number);
            }
            // in the array or arraylist you declared and populated above
        }
}
