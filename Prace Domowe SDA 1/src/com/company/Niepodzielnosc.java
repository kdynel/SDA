package com.company;

// wypisz największą liczbę niepodzielną przez 2,3,5,7 ale mniejszą od 1000 / nie działa wskazanie liczby tylko największej

public class Niepodzielnosc {
    public static void main(String[] args) {
        int a = 1000;
        int b = 1;
        int wynik = wskazLiczbeNiepodzielna(a, b);
        System.out.println("Największa liczba niepodzielna przez 2 3 5 7 ale mniejsza od 1000 to: " + wynik);
    }

    private static int wskazLiczbeNiepodzielna(int a, int b) {
        for (int i = a; i >= b; i--) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                return i;
            }
        }
        return 0; // dlaczego tu jest return 0 i co to daje

    }
}
