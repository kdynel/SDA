package com.company.Zadanie7;

import com.company.Zadanie6.Osoba;

public class KontoFirmowe extends Konto {
    private int oplataZaTransakcje;

    public KontoFirmowe(int stan, int numerRachunku, Osoba osoba, int oplataZaTransakcje) {
        super(stan, numerRachunku, osoba);
    }
    public void setOplataZaTransakcje(int oplataZaTransakcje) {
        this.oplataZaTransakcje = oplataZaTransakcje;
    }

    @Override
    public boolean wyplata(int wyplaconaKwota) {
        return super.wyplata(wyplaconaKwota+oplataZaTransakcje);
    }

    @Override
    public boolean wplata(int wplaconaKwota) {
        return super.wplata(wplaconaKwota-oplataZaTransakcje);
    }

    @Override
    public String przelewSrodkow(int kwotaPrzelewu, Konto rachunekDocelowy) {
        return super.przelewSrodkow(kwotaPrzelewu, rachunekDocelowy);
    }

}
