package patterns;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scn.nextInt();
		
		int nsp = n - 1;
		int valWork = 1;
		int val;
		
		// rows
		int row = 1;
		while(row <= n) {
			val = 1;
			
			// \t = 4 to 8 spaces (typically) depending on vertical alignment
			
			// spaces work
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			
			// value work
			for(int count = 1; count <= valWork; count++) {
				System.out.print(val + "\t");
				// preparation (column)
				if(count <= (valWork / 2)) {
					val++;
				} else {
					val--;
				}
			}
			
			// preparation
			System.out.print("\n");
			nsp -= 1;
			valWork += 2;
			row += 1;
		}
		
		scn.close();
	}
}