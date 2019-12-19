package rozwiazania.podstawy.instrukcje_warunkowe;

import java.util.Scanner;

public class Zadanie4 {

        /*
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
            //zad 4
            Scanner scanner = new Scanner(System.in);
            System.out.println("Witamy w sklepie AGD! Podaj dane zakupu, a ja wyliczę pełną cenę raty.");
            System.out.println("Podaj cenę produktu (od 100zł do 10000zł)");
            double cena = scanner.nextInt();
            if (cena < 100 || cena > 10_000) {
                System.err.println("Wybrano za wysoką lub za niską cenę! Uruchom program ponownie");
                return;
            }
            System.out.println("Dobrze, podaj teraz ilość rat (6-48)");
            int ileRat = scanner.nextInt();
            if (ileRat < 6 || ileRat > 48) { // czy jest mniej niż 6 lub więcej niż 48
                System.err.println("Wybrano nieprawidłową ilość rat! Uruchom program ponownie ");
                return; // kończę działanie programu z powodu niepoprawnych danych
            }
            System.out.println("Dane wprowadzone poprawnie :) ");
            System.out.println("Wyliczam oprocentowanie...");
            double oprocentowanie;
            if (ileRat < 13) { // nie muszę ponownie sprawdzać czy jest mniej niż 6 ponieważ gdyby tak było program byłby już zakończony
                oprocentowanie = 0.025; // 2,5%
            } else if (ileRat < 25) {
                oprocentowanie = 0.05; // 5% = 5 setnych
            } else {
                oprocentowanie = 0.1; // 10%
            }

            System.out.println("Twoje oprocentowanie wynosi: " + oprocentowanie * 100);
            double cenaRaty = cena / ileRat; //poniewaz jedna z wartosci jest typu double wynik dzielenia tez bedzie double
            System.out.println("Cena raty przed oprocentowaniem: "+ cenaRaty + "zł");
            double oprocentowanieCenowo = cenaRaty * oprocentowanie;
            double pelnaCena = cenaRaty + oprocentowanieCenowo;
            System.out.println("Cena uwzględniająca oprocentowanie " + pelnaCena + "zł");

            //DODATKOWO DLA CIEKAWSKICH ;) -> co możemy zrobić żeby cena wyświetlała się do 2 miejsc po przecinku?
            pelnaCena *= 100;
            long zaokraglenie = Math.round(pelnaCena);
            pelnaCena = zaokraglenie / 100.0; // dzielę przez 100.0 aby wynik był w double
            System.out.println("Cena zaokrąglona do 2 miejsc po przecinu: " + pelnaCena);
        }
}
