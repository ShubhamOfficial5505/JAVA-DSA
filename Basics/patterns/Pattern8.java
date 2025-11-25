package patterns;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scn.nextInt();
		
		int nsp = n/2;
		int nst = 1;
		
		// rows
		int row = 1;
		while(row <= n) {
			// spaces work
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			
			// stars work 
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			
			// preparation
			System.out.print("\n");
			if(row <= (n/2)) {
				nsp -= 1;
				nst += 2;
			} else {
				nsp += 1;
				nst -= 2;
			}
			row++; // should be after the conditional statement since we need to check for every row before incrementing it for the next
		}
		
		scn.close();
	}
}