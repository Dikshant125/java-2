
/***
 *   Question: Replaces all occurrences of character a with character b in the current string.
 *   Owner name: Dikshant Goswami
 *   for example:-
 *                String text = "Java Programming";
 *                replace('a', 'o'); // Result: "Jovo Progromming"
 *                replace('ava', 'o'); // Result: "Jo Progromming"
 *   Date: 4-9-2024
 */

import java.util.Scanner;

public class Replace
{

    public static void replace(String string, char oldCharacter, char newCharacter)
    {
        String output = "";

        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == oldCharacter)
            {
                output += newCharacter;
                if (string.charAt(i) == ' ')
                {
                    output += ' ';
                }
            } else
            {
                output += string.charAt(i);
            }
        }
        System.out.println(output);

    }

    public static void main(String[] args)
    {
        String str;

        char oldCharacter, newCharacter;
        int key;
        boolean continueProgram = true;

        while (continueProgram)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("1) Press 1 to continue");
            System.out.println("2) Press 2 to exit");
            System.out.println("Enter your choice: ");

            if (!sc.hasNextInt())
            {
                System.out.println("Please enter a valid number!");
                continue;
            }
            key = sc.nextInt();
            sc.nextLine();

            switch (key)
            {
                case 1:
                    System.out.println("Enter the string:: ");
                    str = sc.nextLine();

                    System.out.println("Enter the old character:: ");
                    oldCharacter = sc.next().charAt(0);
                    sc.nextLine();

                    System.out.println("Enter the new character:: ");
                    newCharacter = sc.next().charAt(0);


                    replace(str, oldCharacter, newCharacter);
                    break;
                case 2:
                    System.out.println("Exiting the program...");
                    continueProgram = false;
                    break;

                default:
                    System.out.println("Invalid input, please enter a valid choice");
                    break;
            }
    }
}

}