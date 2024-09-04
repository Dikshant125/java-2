/***
 *   Question: Splits the current string into an array of words.
 *   Owner name: Dikshant Goswami
 *   for example:-
 *               String text = "Codeup ACE Academy";
 *               String[] words = split(“ “); // Result: ["Codeup", "ACE", "Academy"]
 *   Date: 4-9-2024
 */


import java.util.Scanner;

public class Split
{
    public static void main(String[] args)
    {
        System.out.println("enter the string:- ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = new String[s.length()];
        String output = "";
        int index = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
            {
                if (!output.isEmpty())
                { // Avoid storing empty strings
                    arr[index] = output;
                    index++;
                }
                output = ""; // Reset output for the next word
            } else
            {
                output += s.charAt(i);
            }
        }

        // Add the last word to the array
        if (!output.isEmpty())
        {
            arr[index] = output;
            index++;
        }

        // Print each element in the array
        for (int i = 0; i < index; i++)
        {
            System.out.println(arr[i]);
        }
    }
}