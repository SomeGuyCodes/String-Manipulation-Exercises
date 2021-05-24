package com.forth;

import java.util.Scanner;

public class Vowels {
    static int output= 0;
    static String vowels = "aeiou";

    static void vowels(){
        System.out.println("Please enter a string of text.");
        Scanner userIn = new Scanner(System.in);
        String userName = userIn.nextLine();
        for (int i = 0; i < userName.length(); i++){
            for(int x = 0; x < vowels.length(); x++) {
               //System.out.println("Index of i = "+ i + " And value of i =" + userName.charAt(i));
                //System.out.println("Index of x = "+ x + " And value of x =" + vowels.charAt(x));
                if (userName.charAt(i) == vowels.charAt(x)) {
                    output = output + 1;
                }
            }
        }
        System.out.println("\"" + userName + "\" has " + output + " vowels.");
    }

}
