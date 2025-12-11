public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {20, 30, 50, 35, 40};

        int item = 35;
        int idx = linearSearch(arr, item); // Time complexity - O(n)

        System.out.println(item + " found at index " + idx);
    }

    public static int linearSearch(int[] arr, int item) {
        for(int idx = 0; idx < arr.length; idx++) {
            if(arr[idx] == item) {
                return idx;
            }
        }

        return -1;
    }
}