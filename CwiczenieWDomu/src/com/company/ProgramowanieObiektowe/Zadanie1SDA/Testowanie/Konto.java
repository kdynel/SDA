package com.company.ProgramowanieObiektowe.Zadanie1SDA.Testowanie;

// Utwórz klasę Konto służącą do odbsługi rachunku bankowego
//
//    pola:
//
//        stan konta
//        właściciel konta
//
//
//    metody:
//
//        umożliwiające wpłacanie na rachunek
//        umożliwiające wypłacanie z rachunku
//        pobranie numeru konta

public class Konto {

    int stanKonta;
    String wlascicielKonta;

    public Konto(int stanKonta, String wlascicielKonta) {
        this.stanKonta = stanKonta;
        this.wlascicielKonta = wlascicielKonta;
    }

    void wplacNaKonto(int wplata) {
        stanKonta = stanKonta + wplata;
    }

    void wyplacZKonta(int wyplata) {
        if (stanKonta >= wyplata) {
            stanKonta = stanKonta - wyplata;
        } else {
            System.out.println("Brak środków na koncie");
        }
    }
}


