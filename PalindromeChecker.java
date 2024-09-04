
/***
 *   Question: Checks if the current string is a palindrome.
 *   Owner name: Dikshant Goswami
 *   for example:-
 *               String text = "madam";
 *               Result: true
 *   Date: 4-9-2024
 */

import java.util.Scanner;

public class PalindromeChecker
{

    public static boolean isPalindrome(String name)
    {
        int length = 0;

        // Calculate the length of the string manually
        while (length < name.length() && name.charAt(length) != '\0') {
            length++;
        }

        // Convert all characters to lowercase
        char[] nameChars = name.toCharArray();
        for (int i = 0; i < length; i++)
        {
            if (nameChars[i] >= 'A' && nameChars[i] <= 'Z')
            {
                // Convert to lowercase by adding 32 (difference between 'a' and 'A')
                nameChars[i] = (char) (nameChars[i] + ('a' - 'A'));
            }
            // If the character is already lowercase or not an alphabet, do nothing
        }

        // Check if the string is a palindrome
        for (int i = 0, j = length - 1; i <= j; i++, j--)
        {
            if (nameChars[i] != nameChars[j])
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name you want to check if it is palindrome or not: ");
        String name = scanner.nextLine();

        if (isPalindrome(name))
        {
            System.out.println("Entered name is a palindrome.");
        } else
        {
            System.out.println("The name you entered is not a palindrome.");
        }

        scanner.close();
    }
}
