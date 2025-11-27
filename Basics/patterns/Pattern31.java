package patterns;

import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scn.nextInt();

        int val;

        // rows
        for(int row = 1; row <= n; row++) {
            val = n;

            // work
            for(int cCol = 1; cCol <= n; cCol++) {
                System.out.print(val);
                
                // preparation (column)
                val--;
            }

            // preparation
            System.out.println();
        }
        
        scn.close();
    }
}