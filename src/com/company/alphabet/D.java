package com.company.alphabet;

import java.util.Scanner;

public class D {
    public static void drawPatternE(int h){
        for (int i = 0; i < h; i++) {
            System.out.printf("*");
            for (int j = 0; j < h; j++) {
                if ((i == h / 2 && j <= h / 2) || (i == 0 || i == h - 1)) {
                    System.out.printf("*");
                } else {
                    continue;
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
        drawPatternE(n);
    }
}
