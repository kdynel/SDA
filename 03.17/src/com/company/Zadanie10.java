package com.company;

// Utwórz metodę, która przyjmuje trzy parametry. Pierwszy - liczba liczb do wylosowania, druga to początek zakresu losowania,
// trzecia to koniec zakresu losowania. Metoda ma zwrócić mapę gdzie kluczem jest liczba a wartością jest liczba jej wystąpień.

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Zadanie10 {
    public static void main(String[] args) {
        Map<Integer, Integer> nowaMapa = generujMape(20000, -10, 10);
        System.out.println(nowaMapa);
    }

    private static Map<Integer,Integer> generujMape(int liczbaLiczb, int min, int max) {
        Random r = new Random();
        Map<Integer, Integer> wygenerowanaMapa = new HashMap<>();

        for (int i = 0; i < liczbaLiczb; i++) {
            int losowaLiczba = r.nextInt(max - min +1) + min;
            if (wygenerowanaMapa.containsKey(losowaLiczba)){
                wygenerowanaMapa.put(losowaLiczba, wygenerowanaMapa.get(losowaLiczba) + 1);
            }else{
                wygenerowanaMapa.put(losowaLiczba, 1);
            }

        }
        return wygenerowanaMapa;
    }
}
