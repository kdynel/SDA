package com.company;

// Utwórz metodę, która wczytuje liczby od użytkownika do momentu podania
// wartości `-1` a następnie zwraca mapę wartości, gdzie kluczem jest liczba a wartością jest liczba jej wystąpień.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie9mapy {
    public static void main(String[] args) {

        Map<Integer, Integer> mojaMapa = wypelnijMape();
        System.out.println(mojaMapa);
    }

    private static Map<Integer,Integer> wypelnijMape() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> mapaLiczb = new HashMap<>();
        while(true) {
            int podanaLiczba = scanner.nextInt();
            if (podanaLiczba == -1) {
                break;
            }
            if (mapaLiczb.containsKey(podanaLiczba)){
                int staraWartosc = mapaLiczb.get(podanaLiczba);
                mapaLiczb.put(podanaLiczba, ++staraWartosc);
            }else{
                mapaLiczb.put(podanaLiczba, 1);
            }
        }
        return mapaLiczb;

    }
}
