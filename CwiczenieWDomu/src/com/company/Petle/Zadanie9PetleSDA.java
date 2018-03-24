package com.company.Petle;

// Utwórz metodę, do której przekazujesz jeden parametr i zwraca sumę wszystkich elementów od 1 do podanej liczby

public class Zadanie9PetleSDA {
    public static void main(String[] args) {
//        int parametr = 3;

        System.out.println(sumaZakresu(3));
    }

    private static int sumaZakresu(int parametr) {
        int wynik = 0;
        for (int i = 0; i <= parametr ; i++) {
            wynik = wynik + i;
        }
        return wynik;
    }
}
