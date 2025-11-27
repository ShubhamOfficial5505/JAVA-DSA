package patterns;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scn.nextInt();
		
		int val;
		int noOfItr = 1;
		
		// rows
		int row = 1;
		int nr = (2 * n) - 1;
		while(row <= nr) {
			if(row <= ((nr / 2) + 1)) val = row;
			else val = (nr - row) + 1; // rows (increasing) and values (decreasing) -> value = f(total rows - present row)
			
			// work
			int count = 1;
			while(count <= noOfItr) {
				if((count % 2) == 0) System.out.print("*");
				else System.out.print(val);
				count++;
			}
			
			// preparation
			System.out.print("\n");
			if(row <= (nr / 2)) {
				noOfItr += 2;
			} else {
				noOfItr -= 2;
			}
			row++; // should be after the conditional statement else row 1 gets skipped
		}

		scn.close();
	}
}