public class LowerAndUpperBound {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 3, 3, 3, 9, 11 };

        System.out.println(lowerBound(arr, 2)); // 1
        System.out.println(upperBound(arr, 2)); // 4

        System.out.println(lowerBound(arr, 9)); // 8
        System.out.println(upperBound(arr, 9)); // 8

        System.out.println(lowerBound(arr, 5)); // -1
        System.out.println(upperBound(arr, 5)); // -1
    }

    public static int lowerBound(int[] arr, int val) {
        int idx = -1;

        // Search Space
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while(low <= high) {
            mid = high + ((low - high) / 2);
            if(arr[mid] < val) {
                low = mid + 1;
            } else if(arr[mid] > val) {
                high = mid - 1;
            } else {
                idx = mid;
                high = mid - 1;
            }
        }

        return idx;
    }

    public static int upperBound(int[] arr, int val) {
        int idx = -1;

        // Search Space
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while(low <= high) {
            mid = high + ((low - high) / 2);
            if(arr[mid] < val) {
                low = mid + 1;
            } else if(arr[mid] > val) {
                high = mid - 1;
            } else {
                idx = mid;
                low = mid + 1;
            }
        }

        return idx;
    }
}