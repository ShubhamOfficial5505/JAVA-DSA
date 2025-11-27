package patterns;

import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scn.nextInt();

        int nsp = n - 1;
        int nCol = 1;
        int val = n;

        // rows
        int row = 1;
        while(row <= n) {
            // spaces work
            int csp = 1;
            while(csp <= nsp) {
                System.out.print(" ");
                csp++;
            }

            // value work
            int cCol = 1;
            while (cCol <= nCol) {
                System.out.print(val % n); // val % n = val (val < n) and val % n = 0 (val = n)
                
                // preparation (column)
                if(cCol <= (nCol / 2)) val++;
                else val--;
                cCol++;
            }

            // preparation
            System.out.print("\n");
            nsp -= 1;
            nCol += 2;
            val = n - row; // rows (increasing) and values (decreasing) -> value = f(total rows - present row)
            row += 1;
        }

        scn.close();
    }
}