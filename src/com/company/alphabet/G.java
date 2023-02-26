package com.company.alphabet;

import java.util.Scanner;

public class G {
    public static void drawPatternG(int h, int w){
        w--;
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if((j == 0 || j == w -1 ) && (i == 0 || i == h -1)) {
                    System.out.printf(" ");
                }else if(j == 0) {
                    System.out.printf("*");
                }else if(i == 0 && j <= h) {
                    System.out.printf("*");
                }else if(i == h / 2 && j > h / 2) {
                    System.out.printf("*");
                }else if(i > h / 2 && j == w - 1) {
                    System.out.printf("*");
                }else if(i == h - 1 && j < w) {
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
        drawPatternG(n, (2 * n) - 1);
    }
}
