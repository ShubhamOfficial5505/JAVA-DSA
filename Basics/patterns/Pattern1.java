package patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scn.nextInt();

        int row = 1;
        while(row <= n) {
            // work
            int col = 1;
            while(col <= n) {
                System.out.print("*");
                col++;
            }

            // Preparation
            System.out.print("\n");
            row++;
        }

        scn.close();
    }
}
