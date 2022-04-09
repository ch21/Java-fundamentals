package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 * <p>
 * Please follow the instructions in the comments below
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int var = str.length();
        System.out.println("this is the length of stre: " + var);
        String str2 = "there! ";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqual = false;

        if (str == str2) {
            isEqual = true;
            System.out.println("there are both equal");
        } else {
            System.out.println("there are not equal ");
        }
        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        System.out.println("str3 contains the words: " + str3);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String repString = str.replace('h','H');
        System.out.println(repString);

        String newStr = str3.substring(1,6);
        System.out.println(newStr);



    }


}