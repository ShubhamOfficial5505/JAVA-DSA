package functions;

import java.util.Scanner;

public class DecimalToAnybase {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		int decimalNum = scn.nextInt();
		
		System.out.print("Enter destination base: ");
		int dBase = scn.nextInt();
		
		int destinationNum = getDestinationNum(decimalNum, dBase);
		
		System.out.println(destinationNum);
		
		scn.close();
	}
	
	public static int getDestinationNum(int decimalNum, int dBase) {
		int destinationNum = 0;
		int multiplier = 1;
		
		while(decimalNum != 0) {
			int rem = decimalNum % dBase;
			destinationNum += rem * multiplier;
			
			decimalNum /= dBase;
			multiplier *= 10;
		}
		
		return destinationNum;
	}
}