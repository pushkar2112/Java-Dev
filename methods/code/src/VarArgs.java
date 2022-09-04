import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 75, 67, 43, 23);
        multiple(2, 3, "Pushkar", "Rahul", "John");
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
// Variable length arguments
// when we don't know how many args we need to pass