package com.forth;

import java.util.Scanner;

public class Words {
    static void words(){
        String test = " ";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        System.out.println("Type a sentence or group of words.");
        Scanner userIn = new Scanner(System.in);
        String userName = userIn.nextLine();

        /*for (int i = 0; i < userName.length(); i++){
            for(int x = 0; x < letters.length(); x++) {
                if () {

                }
            }*/
        for(int i = 0; i<userName.length()-1; i++){
            if(userName.length() >= 1 && i <= 0){
                count = count + 1;
            }
            if(userName.charAt(i)==test.charAt(0)){
                count = count + 1;
            }
        }
        System.out.println("Your sentence has "  + count + " words.");
    }
}
