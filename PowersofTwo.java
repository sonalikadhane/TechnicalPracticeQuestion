/*Have the function PowersofTwo(num) take the num parameter being passed which will be an 
 * integer and return the string true if it's a power of two. If it's not return the string 
 * false. For example if the input is 16 then your program should return the string true but
 *  if the input is 22 then the output should be the string false.
 */

import java.util.Scanner;

public class PowersofTwo 
{
    public static String PowersofTwo(int num)
     {
        // Check if num is a power of two
        if (num <= 0) {
            return "false";
        }

        // Keep dividing num by 2 until it becomes odd
        while (num % 2 == 0) {
            num /= 2;
        }

        // If num is 1, it was a power of two
        if (num == 1) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);// Create a Scanner object to get user input
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        // Call PowersofTwo function and display the result
        String result = PowersofTwo(userInput);
        System.out.println("Result: " + result);

    }
}
