/*Have the function ABCheck(str) take the str parameter being passed and return the string 
 * true if the characters a and b are separated by exactly 3 places anywhere in the string 
 * at least once (ie. "lane borrowed" would result in true because there is exactly three
 *  characters between a and b). Otherwise return the string false.
 * 
 */

import java.util.Scanner;
public class ABCheck 
{
	    public static boolean ABCheck(String str) 
        {
	        for (int i = 0; i < str.length() - 4; i++) {
	            if (str.charAt(i) == 'a' && str.charAt(i + 4) == 'b')
                 {
	                return true;
	            }
	        }
	        return false;
	    }
	    public static void main(String[] args)
         {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String userInput = scanner.nextLine();
	        boolean result = ABCheck(userInput);
	        System.out.println("Result: " + result);
	    }
	

}
