package com.company.Petle;

// Utwórz metodę, która przyjmuje jeden parametr (który jest liczbą wierszy i kolumn) oraz wyświetla
// tabliczkę mnożenia (znaki możesz oddzielać znakiem tabulacji \t).

public class Zadanie1PetleSDAniedziela {
    public static void main(String[] args) {

        tabliczkaMnozenia(5);
    }

    private static void tabliczkaMnozenia(int parametr) {
        for (int i = 1; i <= parametr ; i++) {
            for (int j = 1; j <= parametr ; j++) {
                System.out.print((i*j) + "\t");
            }

            System.out.println();
        }
    }
}
