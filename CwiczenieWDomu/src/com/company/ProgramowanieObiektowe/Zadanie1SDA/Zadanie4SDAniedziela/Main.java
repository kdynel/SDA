package com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie4SDAniedziela;

public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto(200_000, "Krzysiek");
        Konto konto2 = new Konto(100_000, "Mama");
        Konto konto3 = new Konto(300_000,"Tata");
      //  konto.wplacNaRachunek(200);
     //   System.out.println(konto.stanKonta);
   //     konto.wyplacZRachunku(1_000_000);
 //       System.out.println(konto.stanKonta);
        konto.wyswietlStanKonta();
        konto2.wyswietlStanKonta();
        konto3.wyswietlStanKonta();
    }
}
