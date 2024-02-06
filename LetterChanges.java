/*Have the function LetterChanges(str) take the str parameter being passed and modify it using the 
 * following algorithm. Replace every letter in the string with the letter following it
 *  in the alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this new
 *   string (a, e, i, o, u) and finally return this modified string.
 */

package sona;

import java.util.Scanner;

public class LetterChanges {

    public static String LetterChanges(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char nextChar = (char) (c + 1);

                // Handle wrapping from 'z' to 'a'
                if (c == 'z') {
                    nextChar = 'a';
                }

                // Capitalize vowels
                if (isVowel(nextChar)) {
                    nextChar = Character.toUpperCase(nextChar);
                }

                result.append(nextChar);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static void main(String[] args)
     {
    
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to get user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        String result = LetterChanges(userInput);
        System.out.println("Result: " + result);

        
    }
}
