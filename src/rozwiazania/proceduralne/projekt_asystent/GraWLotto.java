package rozwiazania.proceduralne.projekt_asystent;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GraWLotto {

    private static int pula = 6;
    private static int maxWartosc = 24;

    public static void zagrajWLoterie() {
       przywitaj();
        int[] wybrane = pobierzLiczby();
        int[] losowane = wylosujLiczby();
        int trafione = policzTrafienia(wybrane, losowane);
        oglosWynik(trafione);
    }

    private static void przywitaj() {
        System.out.println("Zaczynamy loterię!");
    }

    private static int[] pobierzLiczby() {
        Scanner scanner = new Scanner(System.in);
        int pula = 6;
        int max = 28;
        int[] wybrane = new int[pula];
        System.out.println("Wprowadzaj liczby z zakresu od 1 do " +max);
        for (int i = 0; i < wybrane.length; i++) {
            System.out.println("Wprowadź liczbę nr " + (i + 1));
            int wybrana = scanner.nextInt();
            if (wybrana < 1 || wybrana > max) {
                System.err.println("Nieprawidłowy zakres, wprowadź liczbę jeszcze raz");
                i--; // pozwala zostać przy bierzącym i
                continue; // przerywa aktualne wykonanie pętli i przechodzi do kolejnego
            }
            wybrane[i] = wybrana;
        }
        System.out.println("Wybrane liczby: " + Arrays.toString(wybrane));
        return wybrane;
    }

    private static int[] wylosujLiczby() {
        Random random = new Random();
        int[] wylosowane = new int[pula];
        for (int i = 0; i < wylosowane.length; i++) {
            wylosowane[i] = random.nextInt(maxWartosc) + 1;
        }
        System.out.println("Wylosowane liczby: " + Arrays.toString(wylosowane));
        return wylosowane;
    }

    private static int policzTrafienia(int[] pobrane, int[] wylosowane) {
        int trafienia = 0;
        for (int wylosowana : wylosowane) {
            for (int wybrana : pobrane) {
                if (wybrana == wylosowana) {
                    System.out.println(wybrana + " trafiona!");
                    trafienia++;
                }
            }
        }
        System.out.println("Trafiono: " + trafienia);
        return trafienia;
    }

    private static void oglosWynik(int trafienia) {
        double nagroda;
        //można zamienić na switch
        if (trafienia < 3) {
            System.out.println("Niestety nic nie wygrałeś!");
            return;
        } else if (trafienia == 3) {
            nagroda = 16;
        } else if (trafienia == 4) {
            nagroda = 200;
        } else if (trafienia == 5) {
            nagroda = 4_000;
        } else {
            nagroda = 1_500_000;
        }
        System.out.println("Twoja nagroda to: " + nagroda + " zł!");
    }

}
