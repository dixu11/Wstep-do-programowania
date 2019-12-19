package rozwiazania.podstawy.narzedzia_obiektowe.random;

import java.util.Random;
import java.util.Scanner;

public class RandomRozwiazania {

    /*

Zadanie 2.
Napisz program, który pobierze jedną przykładową ilości ścian kostki, np. 4-ścienna, itp., a następnie zasymuluje rzut kostką o wybranej liczbie ścian i wyświetli wylosowaną liczbę.

DODATKOWO: Przetestuj do jakich wartości program nie zadziała prawidłowo.

Zadanie 3.
Napisz program, który zapyta o imię i  wyświetli jego losową literę.
*/

    public static void main(String[] args) {
        //zad 2
        System.out.println("Ile ścianek ma mieć kostka? ");
        Scanner scanner = new Scanner(System.in);
        int iloscScianek = scanner.nextInt();
        Random random = new Random();
        int wylosowana = random.nextInt(iloscScianek) +1;
        // ma być +1 aby poprawić z 0-5 na 1-6
        System.out.println("Wylosowałem: " + wylosowana);

        //zad 3
        System.out.println("Podaj imię, wylosuję jedną literę");
        Scanner scanner2 = new Scanner(System.in);
        String imie = scanner2.nextLine();
        int dlugoscImienia = imie.length();
        int numerLitery = random.nextInt(dlugoscImienia);
        System.out.println("Losowa litera: " + imie.charAt(numerLitery));

    }
}
