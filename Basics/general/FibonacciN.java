package general;

import java.util.Scanner;

public class FibonacciN {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        int sum;

        int counter = 1; // Iterator
        while(counter <= (n + 1)) {
            System.out.println(a);
            
            sum = a + b;
            a = b;
            b = sum;

            counter++;
        }

        scn.close();
    }
}