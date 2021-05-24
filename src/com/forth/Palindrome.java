package com.forth;

import java.util.Scanner;

public class Palindrome {
    static String test = "";
    static void palindrome(){
        System.out.println("Please enter a string of text to determine if it's a palindrome.(The same thing spelled backwards\"Duh\")");
        Scanner userIn = new Scanner(System.in);
        String theWord = userIn.nextLine();
        int count = theWord.length();
        for (int i = theWord.length()-1; i >=0  ; i--){
            test += theWord.charAt(i);
        }
        for (int x = 0; x <theWord.length(); x++){
            if(x>theWord.length()-2) {
                System.out.println(theWord + " is a palindrome.");
            }
            if (theWord.charAt(x) == test.charAt(x)) {
               // System.out.println(x);
                //System.out.println(theWord.charAt(x));
                continue;
            }else{
            System.out.println(theWord + " is NOT a palindrome.");
            break;
            }



    }
       /* System.out.println(count);
        System.out.println(test);
        System.out.println("TheWord is: " + theWord + ".");
        System.out.println("Test is: " + test + ".");*/
    }
}
