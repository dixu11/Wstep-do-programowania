package rozwiazania.podstawy.projekt_loteria;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        System.out.println("Zaczynamy loterię!");
        //Part 1 - wybieranie wartości
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

        //Part 2 - losowanie wartości
        Random random = new Random();
        int[] wylosowane = new int[pula];
        for (int i = 0; i < wylosowane.length; i++) {
            wylosowane[i] = random.nextInt(max) + 1;
        }
        System.out.println("Wylosowane liczby: " + Arrays.toString(wylosowane));

        //Part 3 - sprawdzanie trafień
        int trafienia = 0;
        for (int wylosowana : wylosowane) {
            for (int wybrana : wybrane) {
                if (wybrana == wylosowana) {
                    System.out.println(wybrana + " trafiona!");
                    trafienia++;
                }
            }
        }
        System.out.println("Trafiono: " + trafienia);

        //part 4 - ogłoszenie wyników
        double nagroda;
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
