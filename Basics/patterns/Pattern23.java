package patterns;

import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scn.nextInt();

        int nsp = 0;
        int nst = n;

        // rows
        int nr = (2 * n) - 1;
        int row = 1;
        while(row <= nr) {
            // spaces work
            int csp = 1;
            while(csp <= nsp) {
                System.out.print(" ");
                csp++;
            }

            int cst = 1;
            while(cst <= nst) {
                System.out.print("*");
                cst++;
            }

            // preparation
            System.out.print("\n");
            if(row <= (nr / 2)) {
                nsp += 2;
                nst -= 1;
            } else {
                nsp -= 2;
                nst += 1;
            }
            row++;
        }

        scn.close();
    }
}