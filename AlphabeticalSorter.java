/***
 *   Question: Sorts the characters of the current string in alphabetical order.
 *
 *   Owner name: Dikshant Goswami
 *   for example:-
 *               String text = "program";
 *               String sortedText = sort(); // Result: "agmnoprr"
 *   Date: 4-9-2024
 */


import java.util.Scanner;

public class AlphabeticalSorter
{

    public static void toSortAlphabets(char[] name, int len)
    {
        for (int i = 0; i < len - 1; i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                if (name[i] > name[j])
                {
                    // Swap characters
                    char temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        // Output the sorted characters as a string
        System.out.println(new String(name, 0, len));
    }

    public static boolean isAlphabetic(char[] name, int len)
    {
        for (int i = 0; i < len; i++) {
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
        System.out.print("Enter the string you want in alphabetical order: ");

        String input = scanner.nextLine(); // Read the entire line of input
        char[] name = input.toCharArray(); // Convert the input string to a char array
        int len = name.length; // Get the length of the input

        if (isAlphabetic(name, len))
        {
            toSortAlphabets(name, len);
        } else
        {
            System.out.println("Please! Enter only Alphabets");
        }

        scanner.close();
    }
}
