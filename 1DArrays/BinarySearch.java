public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 10, 12, 15, 20, 27, 31, 36, 42, 55, 58, 60, 65, 70, 80 };

        int item = 55;
        int idx = binarySearch(arr, item); // Time complexity - O(log n)

        System.out.println(item + " found at index " + idx);
    }

    // Pre-requisite -> Sorted Array
    public static int binarySearch(int[] arr, int item) {
        // Define the search area
        int low = 0;
        int high = arr.length - 1;

        int mid; // Index for comparision

        while(low <= high) {
            mid = high + ((low - high) / 2);
            if(arr[mid] < item) {
                low = mid + 1;
            } else if(arr[mid] > item) {
                high = mid -1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}