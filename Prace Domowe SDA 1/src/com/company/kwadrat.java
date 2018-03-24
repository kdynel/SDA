package com.company; // narysuj prostokąt na podstawie podanych parametrów długość wysokość

public class kwadrat {
    public static void main(String[] args) {
        int dlugosc = 10;
        int wysokosc = 10;
        // napiszLinie(dlugosc);
        narysujProstokat(wysokosc, dlugosc);

    }

    private static void narysujProstokat(int wysokosc, int dlugosc) {
        for (int i = 0; i < wysokosc; i++) {



            for (int j = 0; j < dlugosc; j++) {
                System.out.print("x");

            }
            System.out.println();
        }
    }
/*
    private static void napiszLinie(int dlugosc) {
        for (int i = 0; i < dlugosc ; i++) {
            System.out.print("x");

        }
    } */
}
