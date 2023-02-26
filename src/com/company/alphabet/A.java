package com.company.alphabet;//import required classes and package, if any

import java.util.Scanner;

public class A {

    public static void drawPatternA(int h, int w) {
        int n = w / 2;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= w; j++) {
                if (j == n || j == (w - n) || (i == h / 2 && j > n && j < (w - n))) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
            n--;
        }
    }

    public static void main(String args[]) {


        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height of the pattern:");
        n = sc.nextInt();
        sc.close();
        drawPatternA(n, (2 * n) - 1);
    }
}