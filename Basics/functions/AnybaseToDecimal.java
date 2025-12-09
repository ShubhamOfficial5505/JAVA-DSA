package functions;

import java.util.Scanner;

public class AnybaseToDecimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scn.nextInt();
		
		System.out.print("Enter base: ");
		int base = scn.nextInt();
		
		int decimalNum = getDecimalNum(num, base);
		
		System.out.println(decimalNum);
		
		scn.close();
	}
	
	public static int getDecimalNum(int num, int base) {
		int decimalNum = 0;
		int multiplier = 1;
		
		while(num != 0) {
			int rem = num % 10;
			decimalNum += rem * multiplier;
			
			num /= 10;
			multiplier *= base;
		}
		
		return decimalNum;
	}
}