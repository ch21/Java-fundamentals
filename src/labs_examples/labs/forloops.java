package labs_examples.labs;

import sun.lwawt.macosx.CSystemTray;

public class forloops {

    public static void main(String[] args) {

        //please write and run at least 3 unique if statments below
        int i = 10;

        if (i < 20) {
            if (i < 19) {
                if (i > 19) {
                    System.out.println("lets see if this will work");
                }
                System.out.println("i is less than 20!");
            } else {
                System.out.println("hello Im here ");
            }
            System.out.println("this one should apear on here ");
        }

    }



        public static void earlyExit(){
            for (int a = 0; a < 10; a++) {
                if (a == 4){
                    //if "i" is equal to 4 - exit the method
                    return;
                }
                System.out.println("a = " + a);
            }
        }
    }
//}





