package patterns;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scn.nextInt();
		
		int nsp = n - 1;
		int nst = 1;
		
		// rows
		int row = 1;
		while(row <= n) {
			// spaces work
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			// stars work
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			// preparation
			System.out.print("\n");
			nsp--;
			nst++;
			row++;
		}
		
		scn.close();
	}

}
