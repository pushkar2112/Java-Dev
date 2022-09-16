import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;

        System.out.println(arr[3]);

        // input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

        // for each loop
//        for (int j : arr) { // for every element in array print element
//            System.out.print(j + " "); // here j represents element of the array
//        }

//        System.out.println(arr[5]); // Index out of bounds error


        // Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        // modify
        str[1] = "Pushkar";

        System.out.println(Arrays.toString(str));


    }
}
