package patterns;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scn.nextInt();
		
		int nst = 1;
		
		// rows
		int nr = (2 * n) - 1;
		int row = 1;
		while(row <= nr) {
			// work
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			// preparation
			System.out.print("\n");
			if(row <= (nr/2)) {
				nst++;
			} else {
				nst--;
			}
			row++;
		}
		
		scn.close();
	}
}