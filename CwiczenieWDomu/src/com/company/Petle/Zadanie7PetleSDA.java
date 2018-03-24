package com.company.Petle;

// Utwórz metodę, w której pętlą wyświetlisz wszystkie liczby od liczby przekazanej jako parametr do 0 (tj. w kolejności malejącej).

public class Zadanie7PetleSDA {
    public static void main(String[] args) {

        int a = 14;
        int wynik = wyswietlLiczby(a);
    }

    private static int wyswietlLiczby(int a) {
        for (int i = a; i >= 0 ; i--) {
            System.out.print(i);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        return a;
    }
}
