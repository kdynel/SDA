package com.company;

public class ChristmassTree {
    public static void main(String[] args) {
        int height = 10;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
