public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 36, 25, 7, 12, 19 };

        System.out.println("Unsorted Array:");
        printArr(arr);

        System.out.println();
        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int val: arr) {
            System.out.println(val);
        }
    }

    // Increasing
    public static void bubbleSort(int[] arr) {
        // After every iteration one value (largest) would be allocated its correct position
        /* No of itertions required is n - 1 since if n - 1 values have been allocated correct positions
           then definitely the smallest value left would automatically be in its correct position */
        for(int itr = 1; itr <= arr.length - 1; itr++) {
            for(int idx = 0; idx < arr.length - itr; idx++) {
                if(arr[idx] > arr[idx + 1]) {
                    swap(arr, idx);
                }
            }
        }
    }

    public static void swap(int[] arr, int idx) {
        int temp = arr[idx + 1];
        arr[idx + 1] = arr[idx];
        arr[idx] = temp;
    }
}