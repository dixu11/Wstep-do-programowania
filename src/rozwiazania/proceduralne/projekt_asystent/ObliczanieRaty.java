package rozwiazania.proceduralne.projekt_asystent;

import java.util.Scanner;

public class ObliczanieRaty {

    private static double cena;
    private static int ileRat;

    public static void obliczRaty() {
        zbierzDane();
        if (!czyDanePoprawne()) return;
        double oprocentowanie = policzOprocentowanie();
        double pelnaCena = obliczRate(oprocentowanie);
        System.out.println("Cena uwzględniająca oprocentowanie " + pelnaCena + "zł");
        pelnaCena = zaokraglLiczbe(pelnaCena, 2);
        System.out.println("Cena zaokrąglona do 2 miejsc po przecinu: " + pelnaCena);
    }


    private static void zbierzDane() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w sklepie AGD! Podaj dane zakupu, a ja wyliczę pełną cenę raty.");
        System.out.println("Podaj cenę produktu (od 100zł do 10000zł)");
        cena = scanner.nextInt();
        System.out.println("Dobrze, podaj teraz ilość rat (6-48)");
        ileRat = scanner.nextInt();
    }

    private static boolean czyDanePoprawne() {
        if (cena < 100 || cena > 10_000) {
            System.err.println("Wybrano za wysoką lub za niską cenę! Uruchom program ponownie");
            return false;
        }

        if (ileRat < 6 || ileRat > 48) { // czy jest mniej niż 6 lub więcej niż 48
            System.err.println("Wybrano nieprawidłową ilość rat! Uruchom program ponownie ");
            return false; // kończę działanie programu z powodu niepoprawnych danych
        }
        System.out.println("Dane wprowadzone poprawnie :) ");
        return true;
    }

    private static double policzOprocentowanie() {
        System.out.println("Wyliczam oprocentowanie...");
        if (ileRat < 13) { // nie muszę ponownie sprawdzać czy jest mniej niż 6 ponieważ gdyby tak było program byłby już zakończony
            return 0.025; // 2,5%
        } else if (ileRat < 25) {
            return 0.05; // 5% = 5 setnych
        }
        return 0.1; // 10%
    }

    private static double obliczRate(double oprocentowanie) {
        System.out.println("Twoje oprocentowanie wynosi: " + oprocentowanie * 100);
        double cenaRaty = cena / ileRat; //poniewaz jedna z wartosci jest typu double wynik dzielenia tez bedzie double
        System.out.println("Cena raty przed oprocentowaniem: " + cenaRaty + "zł");
        double oprocentowanieCenowo = cenaRaty * oprocentowanie;
        return cenaRaty + oprocentowanieCenowo;
    }

    private static double zaokraglLiczbe(double liczba, double ileMiejsc) {
        double modyfikator = Math.pow(10, ileMiejsc);
        liczba *= modyfikator;
        long zaokraglenie = Math.round(liczba);
        liczba = zaokraglenie / modyfikator;
        return liczba;
    }

}
