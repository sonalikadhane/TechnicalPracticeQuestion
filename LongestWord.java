/*Have the function LongestWord(sen) take the sen parameter being passed and return the 
 * longest word in the string. If there are two or more words that are the same length, 
 * return the first word from the string with that length. Ignore punctuation and assume sen
 *  will not be empty. Words may also contain numbers, for example "Hello world123 567"
 */

import java.util.Scanner;

public class LongestWord
 {
	    public static String LongestWord(String sen)
         {
	        // Remove punctuation and split the string into words
	        String[] words = sen.split("\\W+");

	        // Find the longest word
	        String longestWord = "";
	        for (String word : words) {
	            if (word.length() > longestWord.length()) {
	                longestWord = word;
	            }
	        }
	        return longestWord;
	    }
	    public static void main(String[] args)
         {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a sentence: ");
	        String userSentence = scanner.nextLine();

	        String result = LongestWord(userSentence);
	        System.out.println("The longest word is: " + result);
	        
	    }
	


}
