public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 88, 11, 44, 99, 55 };

        System.out.println("Unsorted Array: ");
        printArr(arr);

        bubbleSort(arr);

        System.out.println();

        System.out.println("Sorted Array");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int val: arr) {
            System.out.println(val);
        }
    }

    // Increasing
    public static void bubbleSort(int[] arr) {
        // For every iteration index = idx would have the correct value (Min)
        // If we perform the operation upto index n - 1 then idx = n would automatically have the accurate value (Max)
        for(int idx = 0; idx < arr.length - 1; idx++) {
            int idx_min = idx;
            for(int idx_cmpsn = idx + 1; idx_cmpsn < arr.length; idx_cmpsn++) {
                if(arr[idx_cmpsn] <  arr[idx_min]) {
                    idx_min = idx_cmpsn;
                }
            }
            
            swap(arr, idx, idx_min);
        }
    }

    public static void swap(int[] arr, int idx, int idx_min) {
        if(idx == idx_min)
            return;

        int temp = arr[idx];
        arr[idx] = arr[idx_min];
        arr[idx_min] = temp;
    }
}