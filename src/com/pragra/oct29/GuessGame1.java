package com.pragra.oct29;

import java.util.Scanner;

public class GuessGame1 {
    public static void main(String[] args) {
        int thoughtNo= (int) (Math.random()*10);
        System.out.println("lets try guessing game");
        System.out.println("I have tought of a num.. try guess");
        Scanner sc= new Scanner(System.in);
        int guessedNo= sc.nextInt();

        while (thoughtNo!=guessedNo)
        {
            System.out.println("you were wrong... try again");
            guessedNo= sc.nextInt();
        }
        System.out.println("you win");
    }
}
