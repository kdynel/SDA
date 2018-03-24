package com.company.Zadanie7;

// 1 Utwórz klasę `Konto`, która zawiera pola `stan`, `numer`, `wlasciciel` (klasa `Osoba`) oraz metody
// umożliwiające wpłatę, wypłatę, przelewanie środków, sprawdzenie status konta.
// 2 Utworz klasę `KontoOszczednosciowe`, które dodatkowo zawiera pole `procentOszczednosci` (dodawany za każdą transakcję)
// 3

import com.company.Zadanie6.Osoba;

public class Main {
    public static void main(String[] args) {
        testyKontaPrywatnego();
        testyKontaFirmowego();

    }

    private static void testyKontaFirmowego() {
        Osoba osoba2 = new Osoba ("Wojtek", 30);
        KontoFirmowe konfofirmowe1 = new KontoFirmowe(500, 502, osoba2, 10);
        KontoFirmowe kontoFirmowe2 = new KontoFirmowe(600, 503, osoba2, 15);

    }

    private static void testyKontaPrywatnego() {
        Osoba osoba1 = new Osoba("Jan Kowalski", 30);
        Konto konto1 = new Konto(2000, 500, osoba1);
        Konto konto2 = new Konto(3000, 600, osoba1);

        System.out.println(konto1.stanKonta());
        konto1.wplata(200);
        System.out.println(konto1.stanKonta());
        konto1.wyplata(400);
        System.out.println(konto1.stanKonta());
        konto1.wyplata(5000);
        System.out.println(konto1.stanKonta());
        String komunikat = konto1.przelewSrodkow(500, konto2);
        System.out.println(komunikat);
        System.out.println(konto1.stanKonta());
        System.out.println(konto2.stanKonta());
        String komunikat2 = Konto.przelewMiedzyKontami(500, konto1, konto2);
        System.out.println(komunikat2);
    }
}
