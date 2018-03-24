package com.company;

// Utwórz metody które będą testować czas działania dwóch implementacji listy (tzn. `List`) - `ArrayList` i `
// LinkedList`. Do pomiaru czasu wykorzystaj `System.currentTimeMillis();`. Sprawdź czas:

//  wstawiania na koniec (np. 500_000 elementów)
//
//  wstawiania na początek (np. 500_000 elementów)
//
//  wybierania po indeksie (tzn. 500_000 razy pobierz element pod jakimś indeksem)
//
//  sumowania wszysch elementów przy wykorzystaniu pętli - for
//
//  sumowania wszysch elementów przy wykorzystaniu pętli - foreach

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zadanie4 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Arraylist: ");
        wstawNaKoniec(arrayList, 500_000);
        System.out.println("LinkedList: ");
        wstawNaKoniec(linkedList, 500_000);

    }

    private static void wstawNaKoniec(List<Integer> arrayList, int liczbaElementow) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < liczbaElementow; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Czas wykonania: " + (end - start) + "ms");
    }
}