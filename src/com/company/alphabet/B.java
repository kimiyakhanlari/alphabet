package com.company.alphabet;

import java.util.Scanner;

public class B {
    public static void drawPatternB(int h, int w){
        int mid = (h / 2);
        for(int i = 0; i < h; i++) {
            System.out.printf("*");
            for(int j = 0; j < w; j++) {
                if((i == 0 || i == h - 1 || i == mid) && j < (w - 2)) {
                    System.out.printf("*");
                } else if (j == (w - 2) && !(i == 0 || i == h - 1 || i == mid)) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }

    public static void main(String args[]) {


        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height of the pattern:");
        n = sc.nextInt();
        sc.close();
        drawPatternB(n, (2 * n) - 1);
    }
}

