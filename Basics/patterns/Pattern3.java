package patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scn.nextInt();

        int nst = n; // number of stars

        // rows
        int row = 1;
        while(row <= n) {
            // work
            int cst = 1; // count of stars
            while(cst <= nst) {
                System.out.print("*");
                cst++;
            }

            // preparation
            System.out.print("\n");
            row++;
            nst--;
        }

        scn.close();
    }
}
