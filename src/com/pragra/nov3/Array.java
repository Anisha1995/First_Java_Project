package com.pragra.nov3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<marks.length;i++){
            System.out.println("Enter marks of subject "+(i+1));
            marks[i]=sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        System.out.println("Total marks = "+sum);
        //avg
        System.out.println(sum/ marks.length);

    }




}

