public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 19, -1, 16, -3, -11, 28};
        int target = -143;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            // check for element at every index if it is equal to target
            if (element == target) {
                return true;
            }
        }
        // this line will execute if nothing else above is executed
        // which means element is not present
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        // run a for loop
        for (int element : arr) {
            // check for element at every index if it is equal to target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if nothing else above is executed
        // which means element is not present
        return Integer.MAX_VALUE;
    }

    // search in the array: return the index if item found
    // else if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is equal to target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if nothing else above is executed
        // which means element is not present
        return -1;
    }
}