public class InsertionSort {
    public static void main(String[] args) {
        // An array of size 20 bytes is formed on the heap (100 to 119), assuming the base address is 100
        // The variable arr holds the base address
        // (88 -> 100 - 103), (11 -> 104 - 107), (44 -> 108 - 111), (99 -> 112 - 115), (33 -> 116 - 119)
        int[] arr = { 88, 11, 44, 99, 33 };

        System.out.println("Unsorted Array:");
        printArr(arr);

        insertionSort(arr);

        System.out.println();

        System.out.println("Sorted Array:");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int val: arr) {
            System.out.println(val);
        }
    }

    // Increasing
    public static void insertionSort(int[] arr) {
        // After every iteration the array would be sorted upto index = idx
        // We start with idx = 1 since a single element by itself is always sorted (idx = 0)
        for(int idx = 1; idx < arr.length; idx++) {
            int idx_cmpsn = idx - 1;
            int val = arr[idx];

            while(idx_cmpsn >= 0 && arr[idx_cmpsn] > val) {
                arr[idx_cmpsn + 1] = arr[idx_cmpsn];
                idx_cmpsn--; 
            }

            arr[idx_cmpsn + 1] = val;
        }
    }
}