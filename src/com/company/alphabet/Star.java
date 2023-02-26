package com.company.alphabet;


import java.util.Scanner;



public class Star {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int i, j, k, l;

        System.out.print("Please Enter H Pattern Rows = ");
        int rows = sc.nextInt();

        System.out.println("Printing H Star Pattern");

        for (i = 1; i <= rows; i++ )
        {
            for (j = 1; j <= i; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 1; i <= rows - 1; i++ )
        {
            for (j = rows - 1; j >= i; j-- )
            {
                System.out.print("*");
            }
            for(k = 1; k <= i * 2; k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
