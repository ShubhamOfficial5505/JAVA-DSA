package patterns;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scn.nextInt();
		
		int nst = n/2;
		int nsp = 1;
		
		// rows
		int row = 1;
		while(row <= n) {
			// stars work 1
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			
			// spaces work
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			
			// stars work 2
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			
			// preparation
			System.out.print("\n");
			if(row <= (n/2)) {
				nst -= 1;
				nsp += 2;
			} else {
				nst += 1;
				nsp -= 2;
			}
			row++;
		}
		
		scn.close();
	}
}