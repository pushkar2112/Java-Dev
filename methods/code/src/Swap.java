public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Pushkar Verma";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "John Doe"; // creating a new object

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // this change will only be valid in this function scope only.
        // because the original value remains unchanged

    }
}
