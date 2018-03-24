package com.company;

// Utwórz metodę, która przyjmuje dwa parametry - mapę (w postaci `klucz - wartość`
// np. `String - int`) oraz poszukiwaną liczbę. Metoda ma zwrócić informację ile razy w mapie występuje (jako wartość) podana liczba.

import java.util.HashMap;
import java.util.Map;

public class Zadanie11 {
    public static void main(String[] args) {
        Map<String, Integer> mojaMapa = new HashMap<>();
        wypelnijMape(mojaMapa);
        int ileRazy = ileRazyWystepujeWMapie(mojaMapa, 21);
        System.out.println(ileRazy);
    }

    private static void wypelnijMape(Map<String, Integer> mojaMapa) {
        mojaMapa.put("Ala", 21);
        mojaMapa.put("Ela", 18);
        mojaMapa.put("Ula", 16);
        mojaMapa.put("Iza", 40);
    }

    private static int ileRazyWystepujeWMapie(Map<String, Integer> mojaMapa, int szukanaWartosc) {
        int licznik = 0;
        for (Map.Entry<String, Integer> element : mojaMapa.entrySet()) {
            if (szukanaWartosc > element.getValue()){
                licznik++;

            }
        }
        return licznik;
    }
}
