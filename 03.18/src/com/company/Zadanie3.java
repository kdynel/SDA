package com.company;

// Utwórz metodę, która wykorzystuje *varargs* by przekazać do metody
// dowolną, większą od zera, liczbę elementów typu `String` i zwrócić jeden napis sklejony z nich.

public class Zadanie3 {
    public static void main(String[] args) {
        String wynik = sklejTekst("Mam ", "na ","imie ", "Krzysiek ");
        System.out.println(wynik);
    }

    private static String sklejTekst(String pierwszyTekst, String... dalszytekst) {
        String wynik = pierwszyTekst;

        for (String tekst: dalszytekst) {
            wynik += tekst; // wynik = wynik + tekst;
        }
        return wynik;
    }
}
