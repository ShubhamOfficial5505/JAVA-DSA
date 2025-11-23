import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		int num = scn.nextInt();
		
		int reverseNum = 0;
		
		while(num != 0) {
			int lastDigit = num % 10;
			reverseNum = (reverseNum * 10) + lastDigit;
			
			num /= 10;
		}
		
		System.out.println("The reverse of the number is " + reverseNum);
	}
}
