package com.pragra;

public class Calculator {
    public static void main(String[] args) {
        int sumresult = sum(10, 2);
        int substrationResult = substration(10, 2);
        int mulresult = mul(10, 2);
        int divResult = div(10, 2);

        System.out.println(" sum: " + sumresult);
        System.out.println(" difference: " + substrationResult);
        System.out.println(" product: " + mulresult);
        System.out.println(" division: " + divResult);

    }

    public static int substration(int a, int b) {
        return a-b;
    }

    public static int sum(int a, int b) {
        return a+b;
    }
    public static int mul(int a, int b)
    {
        return a*b;
    }
    public static int div(int a, int b)
    {
        return a/b;
    }
}
