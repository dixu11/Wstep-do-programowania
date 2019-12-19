package rozwiazania.podstawy.zmienne.zmienne_wstep;

public class ZmienneWstep {
    public static void main(String[] args) {
        //zad 1
        int dzien = 26;
        int miesiac = 10;
        System.out.println("Urodziłem się w dniu " + dzien + " w miesiącu " + miesiac);

        //zad 2
        int liczba1 = 20;
        int liczba2 = 5;
        int liczba3 = 12;
        System.out.println("Dodamy zadeklarowane zmienne do nowej...");
        int suma = liczba1 + liczba2 + liczba3;
        System.out.println("Wynik to: " + suma);

        //zad 3
        int odejmowanie = liczba1 - liczba2 - liczba3;
        System.out.println("Wynik odejmowania: " + odejmowanie);
        int mnozenie = liczba1 * liczba2;
        System.out.println("Wynik mnozenia liczby 1 i 2  to: " + mnozenie);
        int dzielenie = liczba1 / liczba2;
        System.out.println("Wynik dzielenia liczb: " + liczba1 + " i " + liczba2);
        System.out.println("To... " + dzielenie);

        //zad 4 - trudne
        //dodanie do sumy jeszcze raz tej samej liczby:
        //a
        suma = suma + liczba1;
        System.out.println("Suma z dodaną jeszcze raz liczbą " + liczba1
        + " to: " + suma);
        //b
        suma = suma * liczba2;
        System.out.println("Suma przemonozona przez " + liczba2 + " to... " + suma);
        //c
        //zmienie znak w zmiennej liczba1 na przeciwny
        liczba1 = -liczba1;
        System.out.println("Zmienna ze zmienionym znakiem: " + liczba1);
        //d
        System.out.println("Zawartości przed zamianą:");
        System.out.println(liczba1);
        System.out.println(liczba2);
        System.out.println("Zawartości po:");
        int tymczasowa = liczba1; // pomocnicza zmienna ktora przechowa stracona wartosc
        liczba1 = liczba2;
        liczba2 = tymczasowa;
        System.out.println(liczba1);
        System.out.println(liczba2);
    }
}
