package com.pragra.oct22;

import java.util.Scanner;

public class ControlSt {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number");
//        int x = sc.nextInt();
        testEvenOrOdd(9);
        testPostiveNeg(-9);
        testMonthDatys(1);

    }

    private static void testPostiveNeg(int y) {

            if(y>0){
                System.out.println("positive");
            }
            else if (y<0)
            {
                System.out.println("negative");
            }
            else
                System.out.println("zero");


        }

    public static void testEvenOrOdd(int x)
    {
        if(x%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
    public static void testMonthDatys(int Month) {
        if (Month == 1) {
            System.out.println("1");
        } else if (Month == 2) {
            System.out.println("1");
        } else if (Month == 2) {
            System.out.println("1");
        } else if (Month == 3) {
            System.out.println("1");
        } else if (Month == 4) {
            System.out.println("1");
        } else if (Month == 4) {
            System.out.println("1");
        } else if (Month == 5) {
            System.out.println("1");
        } else if (Month == 6) {
            System.out.println("1");
        } else if (Month == 7) {
            System.out.println("1");
        } else {
            System.out.println("error");
        }
    }


}
