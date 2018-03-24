package com.company.ProgramowanieObiektowe.Zadanie1SDA.Testowanie;

public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto(1000, "Jarek");
        Konto konto2 = new Konto(10000, "Paweł");
        konto2.wplacNaKonto(500);
        System.out.println(konto.stanKonta);
        System.out.println(konto2.stanKonta);

    }
}
