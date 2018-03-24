package com.company;
// Utwórz metodę, która przyjmuje dwa parametry - listę liczb (np. `ArrayList`) oraz poszukiwaną liczbę. Metoda ma
// zwrócić listę indeksów pod którymi występuje poszukiwana liczba.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Zadanie6 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int liczbaElementow = pobierzLiczbeElementow();
        int poszukiwanaLiczba = pobierzPoszukiwana();
        List<Integer> mojaLista = uzupelnijListe(liczbaElementow);
        System.out.println(mojaLista);
        List<Integer> listaIndeksow = znajdzPoszukiwaneIndeksy(mojaLista, poszukiwanaLiczba);
        System.out.println(listaIndeksow);
    }

    private static List<Integer> znajdzPoszukiwaneIndeksy(List<Integer> mojaLista, int poszukiwanaLiczba) {
        List<Integer> listaIndeksow = new ArrayList<>();
        for (int indeks = 0; indeks < mojaLista.size(); indeks++) {
            if (mojaLista.get(indeks) == poszukiwanaLiczba) {
                listaIndeksow.add(indeks);
            }
        }
        return listaIndeksow;
    }

    private static int pobierzPoszukiwana() {
        System.out.println("Podaj poszukiwaną liczbe: ");
        return scanner.nextInt();
    }

    private static List<Integer> uzupelnijListe(int liczbaElementow) {
        Random r = new Random();
        List<Integer> uzupelnionaLista = new ArrayList<>();
        for (int i = 0; i < liczbaElementow; i++) {
            uzupelnionaLista.add(i, r.nextInt(10));
        }
        return uzupelnionaLista;

    }

    private static int pobierzLiczbeElementow() {
        System.out.println("Podaj liczbę elementów do wczytania: ");
        return scanner.nextInt();
    }

}

