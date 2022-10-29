package com.pragra.oct27;

public class Star1 {
    public static void main(String[] args) {
        // x row 1
        // x  x row
        // x  x x
        // x  x x x
        // x x x x x
        for (int i=1;i<=5;i++)
        {
            for (int j=1; j<=i;j++)
            {
                System.out.print( "* ");

            }
            System.out.println();

        }
    }
}
