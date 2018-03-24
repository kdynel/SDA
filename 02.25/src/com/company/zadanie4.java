package com.company; // gdzie leży mój plik

import java.util.Scanner; // gdzie leży klasa Skaner w folderze Java/Util na hdd

public class zadanie4 {

    public static void main(String[] args) { // ściąga dane z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj prędkosc do sprawdzenia");
        int predkosc = scanner.nextInt(); //czeka na wpisanie z klawiatury, okreslamy parametry predkosc dla sprawdzanej metody sprawdzPredkosc
        System.out.println("Twój mandat wynosi " + sprawdzPredkosc(predkosc));

        sprawdzPredkosc(predkosc);
    }

    private static int sprawdzPredkosc(int predkosc) { //inicjujemy prędkość zmienną
        int limit = 60; // definiujemy limit prędkości
        if (predkosc > limit) { //sprawdzamy czy przekroczylismy limit
            int przekroczenie = predkosc - limit; // liczymy o ile przekroczone
            return wyliczMandat(przekroczenie); // uruchamia kolejną metode wyliczMandat
        } else {
            return 0;

        }
    }

    private static int wyliczMandat(int przekroczenie) { // kolejna metoda wyliczMandat ze zmienną typu int parametr przekroczenie
        int podstawaMandatu = 100; // mandat minimalny
        int a = przekroczenie / 10 * podstawaMandatu;
        int b = przekroczenie % 10;
        if (b == 0) { // jeśli nie rozpoczynam kolejnej dziesiątki
            return a;
        } else {
            return a + podstawaMandatu;
        }

    }
}
