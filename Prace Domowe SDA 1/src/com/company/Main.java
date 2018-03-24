package com.company;
// 24.02 zadanie 3
// Utwórz metodę, do której przekazujesz liczbę, która jest numerem miesiąca, a program powinien zwrócić liczbę
//dni w danymi miesiącu. Wykorzystaj instrukcję

import java.util.Scanner;

class PracaDomowa24lutyZAD3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wskaż miesiąc podając jego numer aby dowiedzieć się ile ma dni: ");
        int numerMiesiąca = scanner.nextInt();
        switch (numerMiesiąca)
        {
            case 1:
                System.out.println("styczeń ma 31 dni");
                break;
            case 2:
                System.out.println("luty ma 28 dni");
                break;
            case 3:
                System.out.println("marzec ma 30 dni");
                break;
            case 4:
                System.out.println("Kwiecień ma 30 dni");
                break;

                default:
                    System.out.println("Podany miesiąc jest poza zakresem, podaj liczbę od 1 do 4");
        }
    }
}
