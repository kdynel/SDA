package com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie4SDAniedziela;

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
    private int stanKonta;
    private String wlasciciel;
    private static int liczbarachunkowWBanku = 0;
    private int nrRachunku;

    public Konto(int stanKonta, String wlasciciel) {
        this.stanKonta = stanKonta;
        this.wlasciciel = wlasciciel;
        liczbarachunkowWBanku++;
        nrRachunku = liczbarachunkowWBanku;

    }
    public void wplataNaRachunek(int wplata) {

        stanKonta += wplata;
    }
    public void wyplataZRachunku(int wyplata) {
        if (stanKonta >= wyplata) {
            stanKonta -= wyplata;
        } else {
            System.out.println("kwota przewyższa saldo na rachunku");
        }
    }
    void wyswietlStanKonta() {
        System.out.println("twój stan konta: " + stanKonta + " ,a jego numer to: " + nrRachunku);
    }
//    int stanKonta;
//    String wlascicielKonta;
//    int liczbaRachunkuWBanku = 0;
//    int numerRachunku;
//
//    public Konto(int stanKonta, String wlascicielKonta) {
//        this.stanKonta = stanKonta;
//        this.wlascicielKonta = wlascicielKonta;
//        liczbaRachunkuWBanku++;
//        numerRachunku = liczbaRachunkuWBanku;
//
//    }
//
//    void wplacNaRachunek(int wplacanaKwota){
//        stanKonta = wplacanaKwota + stanKonta;
//    }
//    void wyplacZRachunku(int wyplacanaKwota){
//        if (wyplacanaKwota > stanKonta) {
//            System.out.println("Brak środków na koncie");
//        } else {
//            stanKonta = stanKonta - wyplacanaKwota;
//        }
//    }
}
