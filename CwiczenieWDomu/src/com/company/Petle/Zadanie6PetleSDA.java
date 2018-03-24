package com.company.Petle;

// Utwórz metodę, w której wyświetlisz co drugą liczbę z przedziału 0 do 14 (krańcowy zakres przedziału ma być drugim parametrem metody)

public class Zadanie6PetleSDA {
    public static void main(String[] args) {
//        int pierwszaLiczba = 0;
//        int drugaLiczba = 14;

        wyswietlPrzedzial(0,14);
    }

    private static void wyswietlPrzedzial(int pierwszaLiczba, int drugaLiczba) {
        for (int i = pierwszaLiczba; i <= drugaLiczba; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } // czy wynik nie powinien byc przekazany z metody do maina?
        }
    }
}
