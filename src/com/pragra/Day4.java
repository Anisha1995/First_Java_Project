package com.pragra;

import java.util.Date;

public class Day4 {
    static int d,a;
    int n;
    public static void main(String[] args) {
        Date date= new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        boolean isActive=false;

        int age=20;
        System.out.println("age:" + (age+5));


        String name=null;
        System.out.println(name);
        System.out.println( "sum is " + sum(3,8));
    }

    public static void method2() {
        System.out.println(d);
        System.out.println("hello");

    }

    public static int sum(int a, int b) {
       return  a+b;

    }

    public  void test2() {

    }
}
