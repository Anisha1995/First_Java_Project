package com.pragra.oct29;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int thoughtNo= (int) (Math.random()*10);
        System.out.println("lets try guessing game");
       System.out.println("I have tought of a num.. try guess");
        Scanner sc= new Scanner(System.in);
        while (true)
        {
            int guessedNo= sc.nextInt();
            if (thoughtNo==guessedNo)
            {
                System.out.println("you guess right... you win");
                break;
            }
            else
            {
                System.out.println("you were wrong... try again");
            }
        }
    }
}
