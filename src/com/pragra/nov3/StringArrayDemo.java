package com.pragra.nov3;

import java.util.Random;

public class StringArrayDemo {
    public static void main(String[] args) {
        String [] arr= new String[3];
        arr[0]="abc";
        arr[1]=" ";
        arr[2]="def";

        String [] arr1= {"abc", "", "def"};

        int [] mk ={2,3,3,6,9};
        int [] mk1 = new int[]{2,3,3,6,9};

        Random r = new Random();
        int marks []=new int[10];
        for (int i=0; i<=9; i++)
        {
           marks[i] = r.nextInt(10);
            System.out.print(marks[i] + " ");
        }

        System.out.println("");
        Random r1 = new Random();
        int marks1 []=new int[10];
        for (int i=0; i<marks1.length; i++)
        {
            marks1[i] = r1.nextInt(100);
            System.out.print(marks1[i] + " ");
        }
    }
}
