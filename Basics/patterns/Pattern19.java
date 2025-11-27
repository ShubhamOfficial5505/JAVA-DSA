package patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scn.nextInt();

        int nsp = 0;
        int nst = (2 * n) - 1;

        // rows
        int row = 1;
        while(row <= n) {
            // spaces work
            int csp = 1;
            while(csp <= nsp) {
                System.out.print(" ");
                csp++;
            }

            // stars work
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }

            // preparation
            System.out.print("\n");
            nsp += 1;
            nst -= 2;
            row += 1;
        }

        scn.close();
    }
}