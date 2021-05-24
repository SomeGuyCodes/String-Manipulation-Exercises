package com.forth;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Welcome to Assignment 1.");
    System.out.println("Please choose a class.(1-5)");
    Scanner myObj = new Scanner(System.in);
    int userName = Integer.parseInt(myObj.nextLine());
    if(userName == 1) {
        Vowels.vowels();
    }else if(userName ==2) {
       Palindrome.palindrome();
    }else if(userName ==3) {
        Words.words();
    }else if(userName ==4) {
        Consonants.consonants();
    }else if(userName ==5) {
        LastLetterCount.lastLetterCount();
    }else if(userName >5){
        System.out.println("Please choose a number between 1 and 5.");

    }
    }
}
