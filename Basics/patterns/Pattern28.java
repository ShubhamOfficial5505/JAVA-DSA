package patterns;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scn.nextInt();

        int nsp = n - 1;
        int nCol = 1;
        int val;

        // rows
        int row = 1;
        while(row <= n) {
            val = 1;

            // spaces work
            int csp = 1;
            while(csp <= nsp) {
                System.out.print("\t");
                csp++;
            } 

            // value work
            int cCol = 1;
            while(cCol <= nCol) {
                System.out.print(val + "\t");
                val++;
                cCol++;
            }

            // preparation
            System.out.print("\n");
            nsp -= 1;
            nCol += 2;
            row += 1;
        }

        scn.close();
    }
}