package patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scn.nextInt();

        // rows
        int row = 1;
        while(row <= n) {
            // work
            if(row == 1 || row == n) {
                for(int cst = 1; cst <= n; cst++) 
                    System.out.print("*");
            } else {
                System.out.print("*");

                for(int csp = 1; csp <= n - 2; csp++)
                    System.out.print(" ");

                System.out.print("*");
            }

            // preparation
            System.out.print("\n");
            row++;
        }

        scn.close();
    }
}