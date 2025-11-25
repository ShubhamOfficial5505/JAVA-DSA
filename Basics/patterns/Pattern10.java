package patterns;

import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scn.nextInt();
		
		int nsp = n - 1;
		int valWork = 1;
		int val = 1;
		
		// rows
		int row = 1;
		while(row <= n) {
			// spaces work
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			
			// value work
			for(int count = 1; count <= valWork; count++) {
				System.out.print(val);
			}
			
			// spaces RHS of "value work" is the same as no spaces at all (Aren't visible)
			
			// preparation
			System.out.print("\n");
			nsp -= 1;
			valWork += 2;
			row += 1;
		}
		
		scn.close();
	}
}