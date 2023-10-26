// C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = scanner.nextLine().toLowerCase(); 

        if (isPangram(input)) {
            System.out.println("The input is a pangram");
        } else {
            System.out.println("The input is not a pangram");
        }
        scanner.close();
    }

    public static boolean isPangram(String input) {
       
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a'; 
                alphabet[index] = true;
            }
        }
        
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false; 
            }
        }

        return true; 
    }
}
