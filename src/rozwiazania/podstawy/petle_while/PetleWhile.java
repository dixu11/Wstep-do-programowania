package rozwiazania.podstawy.petle_while;

import java.util.Scanner;

public class PetleWhile {
    public static void main(String[] args) {
        /*
        *
        * Zadanie 1.
Stwórz pętlę która wyświetla:
liczby rosnąco od 1 do 10,
liczby malejąco od 99 do 66,
wyłącznie parzyste liczby od 20 do 40,
5 razy Twoje imię.

Podpowiedź: aby zrobić pętlę, która wykona kod określoną ilość razy stwórz dla tej pętli zmienną int, wykorzystaj ją do kontrolowania ilości wykonań pętli.

Zadanie 2.
Napisz program, który wyświetla tajny komunikat. Zanim wyświetli komunikat prosi o podanie hasła liczbowego (sam wymyśl jakie ma być hasło). W przypadku wprowadzenia niepoprawnego hasła program pyta ponownie o liczbę tak długo dopóki użytkownik nie wpisze poprawnego hasła.
*/

        //a
        int licznik = 1;
        while (licznik <= 10) {
            System.out.println(licznik);
            licznik++;
        }
        System.out.println("-----");
        //b
        licznik = 99;
        while (licznik >= 66) {
            System.out.println(licznik);
            licznik--;
        }
        System.out.println("-----");
        //c
        licznik = 20;
        while (licznik <= 40) {
            System.out.println(licznik);
            licznik += 2;
        }
       /* licznik = 20;
        while (licznik <= 40) {
            if (licznik %2 == 0) {
                System.out.println(licznik);
            }
            licznik ++;
        }*/
        //d
        licznik = 0;
        while (licznik < 5) { // kod wykona się 5 razy
            System.out.println("Daniel");
            licznik++;
        }

        //zad 2
     /*   Scanner scanner = new Scanner(System.in);
        int poprawne = 1234;
        int proba = 0;
        while (proba != poprawne) {
            System.out.println("Podaj hasło: ");
           proba = scanner.nextInt();
        }

        System.out.println("Tajne wiadomość");*/

        //zad 3
        //Scanner scanner = new Scanner(System.in);
        /*
       String poprawne = "masło";
        String proba;
        do {
            System.out.println("Podaj hasło: ");
            proba = scanner.nextLine();
        } while (!proba.equalsIgnoreCase(poprawne));
        System.out.println("Tajne wiadomość");*/

        //zad 4
        Scanner scanner = new Scanner(System.in);
        int pobrana;
        int suma = 0;
        int najwyzsza = Integer.MIN_VALUE;
        int najnizsza = Integer.MAX_VALUE;
        do {
            System.out.println("Podaj liczbe, wychodzisz pisząc 0");
            pobrana = scanner.nextInt();
            if (pobrana > najwyzsza) {
                najwyzsza = pobrana;
            }
            if (pobrana < najnizsza && pobrana != 0) {
                najnizsza = pobrana;
            }

            suma += pobrana;
        } while (pobrana != 0);

        System.out.println("Laczna suma to: " + suma);
        System.out.println("Najwyzsza z podanych " + najwyzsza);
        System.out.println("Najniższa z podanych " + najnizsza);

    }
}
