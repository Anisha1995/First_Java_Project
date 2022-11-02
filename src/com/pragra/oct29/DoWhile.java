package com.pragra.oct29;

import java.util.Scanner;

public class DoWhile {
public static void main(String[] args) {
    int thoughtNo= (int) (Math.random()*100);
    System.out.println("lets try guessing game");
    System.out.println("I have thought of a num.. try guess");
    Scanner sc= new Scanner(System.in);
    int guessedNo;

    do{

        guessedNo= sc.nextInt();
        if((guessedNo>=10) && (guessedNo<=20) )
        {
            System.out.println("guess number is between than 10 and 20");
        }
        else if((guessedNo>=20) && (guessedNo<=30) )
        {
            System.out.println("guess number is between than 20 and 30");
        }
        else if((guessedNo>=30) && (guessedNo<=40) )
        {
            System.out.println("guess number is between than 30 and 40");
        }
        else if((guessedNo<=40) && (guessedNo<=50) )
        {
            System.out.println("guess number is between than 40 and 50");
        }
        else if((guessedNo<=40) && (guessedNo<=50) )
        {
            System.out.println("guess number is between than 40 and 60");
        }
        else if((guessedNo<=50) && (guessedNo<=60) )
        {
            System.out.println("guess number is between than 10 and 20");
        }
        else if((guessedNo<=60) && (guessedNo<=70) )
        {
            System.out.println("guess number is between than 10 and 20");
        }
        else if((guessedNo<=80) && (guessedNo<=90) )
        {
            System.out.println("guess number is between than 10 and 20");
        }

        else
        {
            System.out.println("guess number is more than 90");
        }
        System.out.println("Keep guessing");
    }
    while (thoughtNo!=guessedNo);
    System.out.println("you win");

}
}
