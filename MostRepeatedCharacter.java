/***
 *   Question: Finds and returns the character that appears the most frequently in the
 *              current string.
 *   Owner name: Dikshant Goswami
 *   for example:-
 *               String text = "success";
 *               char maxChar = maxRepeat(); // Result:
 *               's' -> 3
 *   Date: 4-9-2024
 */


import java.util.Scanner;

public class MostRepeatedCharacter
{

    public static int maximum(int i, int j)
    {
        return (i > j) ? i : j;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any word & get the most repeated character: ");
        String name = scanner.nextLine();

        int mx = 0;
        // Finding the maximum occurrence of any character
        for (int i = 0; i < name.length() - 1; i++)
        {
            int count = 1;
            for (int j = i + 1; j < name.length(); j++)
            {
                if (name.charAt(i) == name.charAt(j))
                {
                    count++;
                }
            }
            mx = maximum(mx, count);
        }

        int idx = -1;
        // Finding the index of the character with maximum occurrence
        for (int i = 0; i < name.length() - 1; i++)
        {
            int count = 1;
            for (int j = i + 1; j < name.length(); j++)
            {
                if (name.charAt(i) == name.charAt(j))
                {
                    count++;
                }
                if (count == mx) idx = i;
            }
        }

        if (idx != -1)
        {
            System.out.println(name.charAt(idx) + " -> " + mx);
        } else
        {
            System.out.println("No repeated characters found.");
        }

        scanner.close();
    }
}
