/***
 *   Question: Removes a substring from the current string starting at index start and of
 * length length.
 *   Owner name: Dikshant Goswami
 *   for example:-
 *              String text = "Academy";
 *              splice(2, 2); // Result: "Acemy"
 *   Date: 4-9-2024
 */

import java.util.*;
public class Splice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:- ");
        String s = sc.nextLine();
        System.out.println("enter the start:- ");
        int a = sc.nextInt();
        System.out.println("enter the end:- ");
        int b = sc.nextInt();
        String out="";
        for(int i=0;i<s.length();i++){
            if(a<0 || b>s.length()){
                System.out.println("invalid index");
                break;
            }
            if(i>=a && i<=b-1+a ) continue;
            else out=out+s.charAt(i);
        }
        System.out.println(out);
       }
}
