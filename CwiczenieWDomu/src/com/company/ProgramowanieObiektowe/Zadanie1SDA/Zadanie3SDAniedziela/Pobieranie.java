package com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie3SDAniedziela;

// Utwórz klasę Pobieranie służącą do pobierania danych z konsoli.
//
//    metody:
//
//        pobierzInt()
//        pobierzString()
//
//
//        Dodaj możliwość przekazania wartości logicznej, od której zależy wyświetlenie komunikatu na konsoli (np. Podaj wartość typu
//  String:). Użytkownik może zadeklarować obiekt nowo utworzonej klasy u siebie w projekcie:
//
//        Pobieranie p = new Pobieranie();
//        p.pobierzInt(true)

import java.util.Scanner;

public class Pobieranie {
    Scanner scanner = new Scanner(System.in);

    int pobierzInt(boolean warunekInt){
        if(warunekInt == true){
            System.out.println("Podaj liczbe");
        }
        int pobranaLiczba = scanner.nextInt();
        scanner.nextLine();
        return pobranaLiczba;
    }
    String pobierzString(boolean warunekString){
        if (warunekString == true) {
            System.out.println("Podaj string");
        }
        String pobranyString = scanner.nextLine();
        return pobranyString;
    }
}
