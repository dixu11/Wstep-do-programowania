package rozwiazania.proceduralne.metody_statyczne;

import java.util.Scanner;

public class Metody {

    public static void main(String[] args) {
         wyswietlLiczbyOd1Do10();
         wyswietlLiczbyOd1Do10();
         podajDate();
    }

    //zad1
    public static void wyswietlLiczbyOd1Do10() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
    }

    //zad2
    public static void podajDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok");
        int rok = scanner.nextInt();
        System.out.println("Podaj miesiąc");
        int miesiac = scanner.nextInt();
        System.out.println("Podaj dzień");
        int dzien = scanner.nextInt();
        System.out.println("Data to: " + rok + "-" + miesiac + "-" + dzien);
    }
}
