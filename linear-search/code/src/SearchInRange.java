public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch(arr, 98, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
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
