package com.company.alphabet;

import java.util.Scanner;

public class H {
    public static void drawPatternH(int h){
        for(int i = 0; i < h; i++) {
            System.out.printf("*");
            for(int j = 0; j < h; j++) {
                if((j == h - 1) || (i == h / 2)) {
                    System.out.printf("*");
                }else {
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
        drawPatternH(n);
    }
}
