package com.forth;

import java.util.Scanner;

public class Consonants {
    static void consonants(){
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyz";
        char star = '*';
        String out = " ";
        System.out.println("Please enter a string of text.");
        Scanner userIn = new Scanner(System.in);
        String userName = userIn.nextLine();

        for(int i =0; i < userName.length(); i++) {
            for (int x = 0; x <=20; x++) {
                if(userName.charAt(i) == consonants.charAt(x)){
                    count = count +1;
                    out = out +  "*";
                    break;
                }else if(x>=20 && userName.charAt(i) != consonants.charAt(x)) {
                out = out + userName.charAt(i);
                }
            }
        }
        System.out.println("Your input has " + count + " consonants.");
        System.out.println(out);
    }
}
