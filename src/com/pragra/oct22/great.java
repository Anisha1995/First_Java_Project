package com.pragra.oct22;

import java.util.Scanner;

public class great {
    public static void main(String[] args) {
        greatestCheck(22, 22, 3);
        checkilligible(false);
    }
    public static void checkilligible(boolean isActive)
    {
        if (isActive)
        {
            System.out.println("eligible");
        }
        else
        {
            System.out.println("ineligible");
        }
    }
    public static void greatestCheck(int a, int b, int c) {
        if (a >= b && a >=c) {
            System.out.println("largest is a " + a);

        }
        else if (b >= c && b >=a)
        {
            System.out.println("largest is a " + b);
        }
        else
            System.out.println("largest is c " + c);
    }
}