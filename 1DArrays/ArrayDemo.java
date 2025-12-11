public class ArrayDemo {
	public static void main(String[] args) {
		// Declaration
		int[] arr = null;
		System.out.println(arr);
		
		// Memory Allocation (Heap) and Assignment (Base Address)
		arr = new int[5];
		System.out.println(arr);
		
		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// Print using for loop
		for(int idx = 0; idx < arr.length; idx++) {
			System.out.println(arr[idx]);
		}
		
		// Print using enhanced for loop
		// Limitations -> 1) Forward only and 2) Read only
		for(int val: arr) {
			System.out.println(val);
		}
	}
}