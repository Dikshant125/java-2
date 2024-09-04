/***
 *   Question: Counts the total number of words in the current string.
 *   Owner name: Dikshant Goswami
 *   for example:-
 *                String text = "Hello World from Codeup";
 *                int wordCount = countWords(); // Result: 4
 *   Date: 4-9-2024
 */


import java.util.*;
public class CountWord
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}