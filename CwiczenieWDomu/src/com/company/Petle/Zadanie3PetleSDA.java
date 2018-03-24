package com.company.Petle;

// Utwórz metodę, która przyjmuje jeden parametr i wyświetla wszystkie potęgi dwójki nie przekraczające podanego parametru

public class Zadanie3PetleSDA {
    public static void main(String[] args) {
        int parametr = 20;

        wyswietlPotegi(parametr);
    }

    private static void wyswietlPotegi(int parametr) {
        for (int i = 0; i <= parametr ; i++) {
            double wynik = Math.pow(2, i);
            if (wynik <= parametr) {
                System.out.println(wynik);
            }

        }
    }
}
