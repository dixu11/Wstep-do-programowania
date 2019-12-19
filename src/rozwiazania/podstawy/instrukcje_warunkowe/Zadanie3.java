package rozwiazania.podstawy.instrukcje_warunkowe;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        // zad 3 jest całkiem spore więc zasługuje na osobną klasę...
        //rozwiązanie bez wariantów dodatkowych
        Scanner pobieracz = new Scanner(System.in);
        System.out.println("Wylosuję dla Ciebie liczbę od 1 do 10...");
        System.out.println("Spróbuj zgadnąć jaka to liczba. Masz 2 szanse!");
        double wylosowana = Math.random(); //liczba 0-1 bez pełnej jedynki
        wylosowana = wylosowana * 10 + 1; // liczba od 1 do 11  bez pełnej 11
        int wylosowanaInt = (int)wylosowana; // ucinam resztę po przecinku i otrzymuję liczbę od 1 - 10, sukces!
//        System.out.println(wylosowanaInt); - mówię co wylosowałem ale tylko gdy testuję ten program :) Użytkownik niech nie wie...
        System.out.println("Już coś wylosowałem, napisz liczbę, może zgadniesz!");
        int pobrana = pobieracz.nextInt(); // pobieramy liczbę od użytkownika
        System.out.println("Napisałeś " + pobieracz + ", hmmm...");
        if (pobrana > wylosowanaInt) {
            System.out.println("Wprowadziłeś za dużą liczbę!");
        } else if (pobrana < wylosowanaInt) {
            System.out.println("Wprowadziłeś za małą liczbę!");
        } else {
            System.out.println("Brawoooooo!!! Zgadłeś!");
            return; // kończymy program jeśli zgadł już w pierwszym podejściu :)
        }

        //powtarzamy kod (gdy nauczymy się pętli będzie to można zrobić sprytniej...)
        System.out.println("Coś nie poszło.. spróbuj jeszcze raz");
        pobrana = pobieracz.nextInt();
        if (pobrana > wylosowanaInt) {
            System.out.println("Wprowadziłeś za dużą liczbę!");
        } else if (pobrana < wylosowanaInt) {
            System.out.println("Wprowadziłeś za małą liczbę!");
        } else {
            System.out.println("Brawoooooo!!! Zgadłeś!");
        }
    }
}
