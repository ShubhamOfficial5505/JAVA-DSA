package patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
        System.out.print("Enter n: ");
        int n = scn.nextInt();

        int nsp1 = 0; 
        int nsp2 = n - 2;

        // rows
        int row = 1;
        while(row <= n) {
            // work
            for(int csp1 = 1; csp1 <= nsp1; csp1++) 
                System.out.print(" ");

            System.out.print("*");

            for(int csp2 = 1; csp2 <= nsp2; csp2++) 
                System.out.print(" ");

            if(row != ((n / 2) + 1))
                System.out.print("*");

            // preparation
            System.out.print("\n");
            if(row <= (n / 2)) {
                nsp1 += 1;
                nsp2 -= 2;
            } else {
                nsp1 -= 1;
                nsp2 += 2;
            }
            row++;
        }

        scn.close();
    }
}