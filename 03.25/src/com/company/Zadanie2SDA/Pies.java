package com.company.Zadanie2SDA;

// Utwórz klasy `Pies`, `Kot`, `Kon`. Utwórz interfejs `WydajacyOdglos` w którym będzie metoda `dajGlos()`.

public class Pies implements WydajacyGlos {

    @Override
    public String dajGlos() {
        return "Woof";
    }
}
