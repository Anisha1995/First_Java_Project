package com.pragra.nov3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
                int [] arr= new int[5];

                for (int i=0;i<=4;i++)
                {
                    System.out.println("marks");
                    arr[i]=sc.nextInt();
                }

        for (int i=0;i<=4;i++)
        {
            System.out.print( arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(arr));
    }
}
