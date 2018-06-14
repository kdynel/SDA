package com.company.Zadanie4SDA;

public class Pociag extends Pojazd {

   int liczaWagonow;
   boolean czyMaWagonBarowy;

   public Pociag(String nazwa) {
      super(nazwa);
   }

   public Pociag(String nazwa, int liczaWagonow, boolean czyMaWagonBarowy) {
      super(nazwa);
      this.liczaWagonow = liczaWagonow;
      this.czyMaWagonBarowy = czyMaWagonBarowy;
   }

   @Override
   public int maxPredkosc() {
      return 300;
   }

   @Override
   public int liczbaPasazerow() {
      return 2000;
   }

   @Override
   public String wyswietlDane() {
      return String.format("Nazwa: %s, prędkość: %s, liczba pasażerów: %s, liczba wagonów: %s, czy ma wagon barowy: %S", nazwa, maxPredkosc(), liczbaPasazerow(), liczaWagonow, czyMaWagonBarowy ? "tak" : "nie");
   }
}


