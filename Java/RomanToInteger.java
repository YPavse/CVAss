// B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

import java.util.Scanner;
import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        int result = romanToInteger(romanNumeral);
        System.out.println("The integer value is: " + result);

        scanner.close();

    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanNumerals.get(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue; 
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}


