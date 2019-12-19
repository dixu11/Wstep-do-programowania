package rozwiazania.podstawy.instrukcje_warunkowe;

import java.util.Scanner;

public class Rozwiazania2 {
    /*   Zadanie 4.
        W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna.
                Napisz program umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt.  Danymi wejściowymi dla programu są:
• cena towaru (od 100 zł do 10 tys. zł),
• liczba rat (od 6 do 48).
        Program powinien sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach, a w przypadku błędu wyświetlać stosowny komunikat i natychmiast zakończyć działanie programu.
                Kredyt jest oprocentowany w zależności od liczby rat:
 • od 6–12 wynosi 2.5% ,
• od 13–24 wynosi 5%,
• od 25–48 wynosi 10%.
        Obliczona miesięczna rata powinna zawierać również odsetki.

  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile kosztuje towar -> 100 - 10 000zł");
        double cena = scanner.nextDouble();
        System.out.println("Podaj ile rat wybierasz (6-48)");
        int raty = scanner.nextInt();

        if (cena < 100 || cena > 10_000) {
            System.out.println("Niepoprawna cena, uruchom ponownie");
            return;
        }
        if (raty < 6 || raty > 48) {
            System.out.println("Niepoprawna ilość rat, uruchom ponownie");
            return;
        }
        double stawka;
        if (raty <= 12) {
            stawka = 0.025;
        } else if (raty <= 24) {
            stawka = 0.05;
        } else {
            stawka = 0.1;
        }


        double cenaRaty = cena / raty;
        double oprocentowania = cenaRaty * stawka;
        double lacznaCenaRaty = cenaRaty + oprocentowania;
        System.out.println("Koszt 1 raty wynosi: " + lacznaCenaRaty + "zł");

    }
}

