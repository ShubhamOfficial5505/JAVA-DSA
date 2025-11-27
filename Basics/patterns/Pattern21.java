package patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scn.nextInt();

        int nsp = n - 1;
        int nstAndEm = 0;

        // rows
        int row = 1;
        while(row <= n) {
            // spaces work
            int csp = 1;
            while(csp <= nsp) {
                System.out.print(" ");
                csp++;
            }

            // stars and ! work
            int cstAndEm = 1;
            while (cstAndEm <= nstAndEm) {
                System.out.print("*!");
                cstAndEm++;
            }
            System.out.print("*");

            // preparation
            System.out.print("\n");
            nsp -= 1;
            nstAndEm += 1;
            row += 1;
        }

        scn.close();
    }
}