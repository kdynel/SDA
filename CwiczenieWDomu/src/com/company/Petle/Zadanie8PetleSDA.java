package com.company.Petle;

// Utwórz metodę, do której przekazujesz dwa parametry (np min i max) a następnie wyswietlasz wszystkie liczby z podanego przedziału

public class Zadanie8PetleSDA {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        wyswietlLiczby(min, max);
    }

    private static void wyswietlLiczby(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }
}
