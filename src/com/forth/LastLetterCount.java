package com.forth;

import java.util.Scanner;

public class LastLetterCount {
    public static void lastLetterCount(){
        int sWords = 0;
        int yWords = 0;
        int totWords = 0;
        int length = 0;
        int[] sSpace = {0,0};
        String sWord = " ";
        int sBeg = 0;
        int sEnd = 0;
        int[] ySpace = {0,0};
        String yWord = " ";
        int yBeg = 0;
        int yEnd = 0;
        int sCount = 0;
        int yCount = 0;
        String uInput = " ";
        System.out.println("Please enter a string of text.");
        Scanner userIn = new Scanner(System.in);
        String userName = userIn.nextLine();
        length = userName.length();
        //int x = userName.length();
        int[] input ={0,userName.length()};

        for(int i = 0; i <userName.length()-1; i++){
            if (sCount == 1){
                for(int y = i; y<userName.substring(0,i).length(); y--)
                    if(userName.charAt(i-1)== ' ' || y== 0 ){
                        sWord = userName.substring(0,y);
                        System.out.println(userName.substring(0,1));
                    }
            if(userName.charAt(i) == ' ' && userName.charAt(i-1)== 's'){
                sWords = sWords + 1;
                sCount++;
                System.out.println(userName.substring(0,1));

                }
                System.out.println(userName.substring(0,1).length());
            }
            if(userName.charAt(i) == ' ' && userName.charAt(i-1)== 'y'){
                yWords = yWords + 1;
            }
        }
        System.out.println("There are " + sWords + " words that end in \"S\".");
        System.out.println("There are " + yWords + " words that end in \"Y\".");
        System.out.println(sWord);
    }
}
