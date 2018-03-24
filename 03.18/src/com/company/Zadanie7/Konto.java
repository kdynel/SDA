package com.company.Zadanie7;

import com.company.Zadanie6.Osoba; // skopowiowało Osoba z poprzedniego zadania bo IJ juz wykrylo ze była taka klasa
// w programie

public class Konto {
    private int stan;
    private int numerRachunku;
    private Osoba osoba;

    public Konto(int stan, int numerRachunku, Osoba osoba) {
        this.stan = stan;
        this.numerRachunku = numerRachunku;
        this.osoba = osoba;
    }

    public boolean wyplata(int wyplaconaKwota) {
        stan -= wyplaconaKwota;
        if (wyplaconaKwota > stan) {
            System.out.println("Za malo srodkow na koncie");
            return false;
        }
        stan -= wyplaconaKwota;
        return true;
    }

    public boolean wplata(int wplaconaKwota) {
        stan += wplaconaKwota;
        return true;
    }

    public int stanKonta() {
        return stan;
    }

    public String przelewSrodkow(int kwotaPrzelewu, Konto rachunekDocelowy) {
        if (stan < kwotaPrzelewu) {
            return "Za malo srodkow na koncie";
        }
        stan -= kwotaPrzelewu;
        rachunekDocelowy.wplata(kwotaPrzelewu);
        return "Transakcja udana";
    }
    public static String przelewMiedzyKontami(int kwotaPrzelewu, Konto nadawca, Konto odbiorca) {

        if (kwotaPrzelewu > nadawca.stanKonta()) {
            return String.format("Za malo srodkow na koncie, " + "chcesz przelac %s, a posiadasz %s", kwotaPrzelewu, nadawca.stanKonta());
        }
        nadawca.wyplata(kwotaPrzelewu);
        odbiorca.wplata(kwotaPrzelewu);

        return String.format("Na rachunek odbiorcy przelano %s. " + "Na koncie nadawcy pozostalo %s." + "Na koncie odbiorcy jest %s",
                kwotaPrzelewu, nadawca.stanKonta(), odbiorca.stanKonta());

    }
}