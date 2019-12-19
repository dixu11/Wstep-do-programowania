package rozwiazania.proceduralne.argumenty_zwracanie;

import java.util.Random;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        double wylosowana = wylosuj();
        System.out.println("Wylosowano: " + wylosowana);
        int suma = dodaj(3, 6);
        System.out.println("Suma to: " + suma);
        String imie = "Jan";
        System.out.println("Pierwsza litera " + imie +
                " to: " + dajPierwszaLitere(imie));
        int godziny = 5;
        System.out.println("Ile godzin: " + godziny);
        System.out.println("Ile minut: " + przeliczNaMinuty(godziny));

        if (czyParzysta(godziny)) {
            System.out.println(godziny + " to parzysta liczba");
        } else {
            System.out.println(godziny + " to nieparzysta liczba");
        }

        wyswietlLiczby(3,9);
        String data =  podajDate();
        System.out.println("Podano datę: " + data);
    }

    static double wylosuj() {
        Random random = new Random();
        return random.nextDouble();
    }

    static int dodaj(int a, int b) {
        return a + b;
    }

    static char dajPierwszaLitere(String tekst) {
        return tekst.charAt(0);
    }

    static int przeliczNaMinuty(int godziny){
        return godziny * 60;
    }

    static boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }

    //dodatkowe
    public static void wyswietlLiczby(int odLiczby, int doLiczby) {
        for (int i = odLiczby; i <= doLiczby; i++) {
            System.out.println(i);
        }
    }

    public static String podajDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok");
        int rok = scanner.nextInt();
        System.out.println("Podaj miesiąc");
        int miesiac = scanner.nextInt();
        System.out.println("Podaj dzień");
        int dzien = scanner.nextInt();


       return rok +"-" + miesiac + "-" + dzien;
    }
}
