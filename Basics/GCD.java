import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int num1 = scn.nextInt(); // Divisor
		System.out.print("Enter 2nd number: ");
		int num2 = scn.nextInt(); // Dividend
		
		while((num2 % num1) != 0) {
			int remainder = num2 % num1;
			num2 = num1; // New Dividend = Old Divisor
			num1 = remainder; // New Divisor = Remainder
		}
		
		System.out.println("GCD is " + num1);
	}
}

// First Iteration -> num2 < num1 (Dividend < Divisor) -> One Extra Iteration