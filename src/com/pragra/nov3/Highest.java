package com.pragra.nov3;

import java.util.Scanner;

public class Highest {
    public static void main(String[] args) {
        int marks[] = {22, 94, 86, 30, 70};
        int highestMark = marks[0];
        for (int i = 0; i < 5; i++) {
            if (marks[i] > highestMark) {
                highestMark = marks[i];
                System.out.println("Highest Mark " + highestMark);
            }
            }
    }
}

//public class GreatestArr {
//    public static void main(String[] args) {
//        greatArr();
//
//    }
//    public static void greatArr(){
//        int arr[] = new int[5];
//        int max=0;
//        Scanner sc= new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Please enter marks");
//            arr[i]=sc.nextInt();
//        }
//        max=arr[0];
//        for (int i = 0; i < arr.length; i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("Highest number = " +max);
//
//    }
//}
