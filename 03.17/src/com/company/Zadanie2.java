package com.company;
// Utwórz metodę, która wczytuje liczby od użytkownika do momentu podania `-1`
// a następnie zwraca ich listę listę (np. wykorzystując implementację `ArrayList`)

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        List<Integer> listaLiczb = pobierzLiczbe();
        wyswietlListe(listaLiczb);
    }

    private static void wyswietlListe(List<Integer> listaLiczb) {
        for (Integer element : listaLiczb) {
            System.out.println(element);
        }
    }

    private static List<Integer> pobierzLiczbe() {
        List<Integer> mojaLista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj liczbe: ");
            int wczytabaLiczba = scanner.nextInt();
            if (wczytabaLiczba == -1) {
                return mojaLista;
            }
            mojaLista.add(wczytabaLiczba);
        }
    }
}
