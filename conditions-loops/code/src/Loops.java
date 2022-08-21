import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        /*
            syntax for loops:

            for(initialisation; condition; increment/dec) {
            // body
            }
         */

        // Q: Print nos from 1 to 5
//        for (int num = 1; num <= 5; num++){
//            System.out.println(num);
//        }

        // print nos from 1 to n
//        int n = in.nextInt();
//        for (int i = 1; i <= n ; i++) {
//            System.out.println(i);
//        }

        // While loops:
        /*
            Syntax:

            while(condition) {
            //body
            }
         */

//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num++;
//        }

        // do while

        /*
            do {
                // body // Run atleast once and after that it depend on the while condition
            } while (condition);
         */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

    }
}
