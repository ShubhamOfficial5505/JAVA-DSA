package general;

import java.util.Scanner;

// Assumption: After every input we press the Enter key (not entering multiple inputs on the same line separated by spaces).

/* All next-type() methods stop at delimiters (spaces, newline, tab) and leave a \n in the input buffer
   representing the Enter press. Even with a series of next-type() calls (multiple Enter presses), only one final \n from the
   last enter press remains. Because of that leftover \n, the succeeding nextLine() gets skipped as it directly
   consumes it (it reads everything until the first \n, but it's already present even before input is given).
   Unlike others nextLine() leaves nothing behind consuming the \n which dissolves its execution.
   Thus, after a series of next-type() calls, we use an extra "recoil" nextLine() to input a string containing other
   delimiters like spaces (A sentence). */
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Multiple next-type() calls in a series
        System.out.println("Enter three values: ");
        int num1 = sc.nextInt();
        double num2 = sc.nextDouble();
        String word = sc.next();  // Only takes one word
        
        // After these three calls, only one \n remains in buffer from the final Enter press
        System.out.print("Enter a full sentence: ");
        String sentence1 = sc.nextLine(); // Gets skipped! Consumes leftover \n (The cursor remains in the original position)
        
        System.out.println();
        System.out.println();

        System.out.println("Results after first series:");
        System.out.println("int: " + num1);
        System.out.println("double: " + num2);
        System.out.println("word: '" + word + "'");
        System.out.println("sentence: '" + sentence1 + "' (empty!)");
        
        System.out.println();

        System.out.print("Enter another int: ");
        int num3 = sc.nextInt();
        
        sc.nextLine();  // Recoil - clears the leftover \n
        
        System.out.print("Now enter a proper sentence with spaces: ");
        String sentence2 = sc.nextLine();  // Works now
        
        System.out.println();

        System.out.println("Results after recoil:");
        System.out.println("int: " + num3);
        System.out.println("sentence: '" + sentence2 + "' (full text captured)");
        
        sc.close();
    }
}