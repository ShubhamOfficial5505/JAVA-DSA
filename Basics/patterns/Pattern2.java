package patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scn.nextInt();
        
        // rows
        int row = 1;
        while(row <= n) {
            // work
            int cst = 1; // count of stars
            int nst = row; // number of stars
            while(cst <= nst) {
                System.out.print("*");
                cst++;
            }

            // preparation
            System.out.print("\n");
            row++;
        }

        scn.close();
    }
}
