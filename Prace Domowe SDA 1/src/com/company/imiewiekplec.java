package com.company;

import java.util.Scanner;

public class imiewiekplec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String imie = scanner.next();
        System.out.println("Podaj swój wiek");
        int wiek = scanner.nextInt();
        System.out.println("Jeśli jesteś mężczyzną nacisnij K, jeśli kobietą naciśnij M");
        scanner.nextLine();
        String wybierzPlec = scanner.nextLine();
        boolean plec = przyrownaniePlci(wybierzPlec);
        System.out.printf("Mam na imię" + imie + " mam " + wiek + "lat i jestem" + plec);


    }

    private static boolean przyrownaniePlci(String wybierzPlec) {

        String plec = "M";
        if (wybierzPlec == plec) {
            return true;
        }
        return false;
    }
}
