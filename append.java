/***
 *   Question: Appends the newString provided by the user to the existing string.
 *   Owner name: Dikshant Goswami
 *    The method  remember the appended result like:-
 *    hello
 *    hello world
 *    hello world dikshant
 *   Date: 4-9-2024
 */


import java.util.*;
public class append
{
    static String s = "";
    public static void main(String[] args)
    {
        System.out.println("Enter the string:- ");
        Scanner sc=new Scanner(System.in);

        while (true)
        {
            String inp = sc.nextLine();
            s = s + inp + " ";
            System.out.println(s );
        }

   }
}