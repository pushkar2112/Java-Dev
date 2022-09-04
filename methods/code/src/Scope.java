public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Pushkar";

        // block scope
        {
//            int a = 78; // already init outside the block, in the same method
            // cannot initialise again
            a = 78; // reassign the original ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "John";
            System.out.println(name);
            // values initialised in this block will remain in block
        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c);  // cannot use outside this block

        // function scope
//        System.out.println(num);
//        System.out.println(marks);

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 98;
//            int a = 8; // already initialised, cannot initialise again
        }
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

// Anything outside works inside
// Can be updated inside but not initialised again inside
// But anything inside won't work outside
