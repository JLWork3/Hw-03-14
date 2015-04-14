package nyc.c4q.Jvidals1;

import java.util.Scanner;

/**
 * Created by s3a on 3/23/15.
 * Janneisy Vidals
 * 2.1 Accesscode
 * HW Excercises
 * Description:
 * Write a function uniqueCharacters which accepts as input a string S.
 * Given the string S return a string S2 which contains all the distinct characters in S.
 * The input string will only contain lowercase characters.
 * The ordering of characters in the output string does not matter. Eg.
 *abbcaabcaa --> abc
 *apple --> aple or aepl
 *microsoft --> microsft

 *
 *
 */

import  java.util.Scanner;
public class StringandLoops
{

    public static void main(String[] args)
    {
        System.out.println("Enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();


    }
    //        System.out.print("Enter a word: ");
    //        Scanner scanner = new Scanner(System.in);
    //        String string = scanner.nextLine();
    //        System.out.print(rot13Encode(string));
    //
    //
    //        for(int i = 0; i < string.length(); i++)
    //        {
    //            char c = string.charAt(i);
    //            int code = (int) c;
    //            System.out.print(" char " + c + " = " + code);
    //        }
    //
    //
    //    }

    public static String rot13Encode(String string)
    {

        String result = "";
        for(int i = 0; i < string.length(); i++)
        {
            char c = string.charAt(i);

        }
        return string;
    }

    public static String reverse(String reverse)
    {
        String string = "";

        for(int i = 0; i < reverse.length(); i--)
        {
            char c = reverse.charAt(i);
        }
        return reverse;
    }

    //Write a function uniqueCharacters which accepts as input a string S. x
    // Given the string S return a string S2 which contains all the distinct characters in S.
    // The input string will only contain lowercase characters.x
    // The ordering of characters in the output string does not matter. Eg.

    public static String uniqueCharacters(String S)
    {

        S = "";


        for(int c = 0; i < S.length(); ++ i)
        {
            char b = S.charAt(i);





    }
}
