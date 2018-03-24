package com.company;

// przykład, wprowadzenie

public class TablicaDwuwymiarowa {
    public static void main(String[] args) {

        int[][] tab = new int[5][5];

        tab[0][0] = 1;
        tab[0][1] = 2;
        tab[0][2] = 3;
        tab[2][2] = 25;
        System.out.println(tab[2][2]);
        System.out.println(tab[0][0]);

        int[][] tab2 = {
                {1, 12, 345, 3},
                {345, 34, 34, 2},
                {56, -55, 67, 5672},
        };
        System.out.println(tab2[2][3]);

    }
}

