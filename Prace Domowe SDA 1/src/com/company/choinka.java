package com.company;

import java.util.Scanner;

public class choinka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dla wysokości choinki");
        int a = scanner.nextInt();
        choinka(a);
        //choinkaProper(a);
    }

    private static void choinka(int height) {
        String tree = "";
        for (int i = 1; i <= height; i++) {
            tree = tree + i;
            System.out.println(tree);

        }

    }
/*
    private static void choinkaProper(int height) {
        String tree = "";
        for (int i = 1; i <= height; i++) {
            tree = tree + i;
            String spaces = "";
            for (int y = 0; y < height - i; y++) {
                spaces += " ";
            }
            System.out.println(spaces + tree); */

}

