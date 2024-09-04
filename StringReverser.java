/***
 *   Question: Reverses the current string.
 *
 *   Owner name: Dikshant Goswami
 *   for example:-
 *              String text = "Java";
 *              String reversedText = reverse(); // Result: "avaJ"
 *   Date: 4-9-2024
 */



import java.util.Scanner;

public class StringReverser
{

    public static void toReverseString(char[] name, int length)
    {
        // Reversing the string by swapping characters from the ends
        for (int i = length - 1, j = 0; i > j; i--, j++)
        {
            char temp = name[i];
            name[i] = name[j];
            name[j] = temp;
        }
        // Output the reversed string
        System.out.println(name);
    }

    public static boolean isAlphabetic(char[] name, int length)
    {
        for (int i = 0; i < length; i++)
        {
            char c = name[i];
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name you want the reverse of: ");
        String input = scanner.nextLine();
        char[] name = input.toCharArray(); // Convert input string to char array
        int length = name.length; // Get the length of the input

        if (isAlphabetic(name, length))
        {
            toReverseString(name, length);
        } else
        {
            System.out.println("Please! Enter only alphabets");
        }

        scanner.close();
    }
}
