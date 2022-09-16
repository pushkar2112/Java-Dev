public class Main {
    public static void main(String[] args) {

        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Pushkar";

        // Q: store 5 roll nos.


        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll nos.
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array, ros is getting defined in the stack
        ros = new int[5]; // initialisation, actually here object is being created in the heap memory
//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

//        String str = null; // null is the default value of reference variables
//        int num = null; // Error : cannot assign to primitives



    }
}