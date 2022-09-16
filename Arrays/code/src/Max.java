import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        System.out.println(max(arr));
    }

    // imagine arr is not empty
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr, int start, int end) {
        int max = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
