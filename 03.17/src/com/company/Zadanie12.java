package com.company;

// Utwórz metodę, która która przyjmuje set (np. `HashSet`) i zwraca jego rozmiar (tzn. liczbę elementów)

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zadanie12 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
    }
}
