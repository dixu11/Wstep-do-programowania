package rozwiazania.podstawy.petle_for;

import java.util.Random;

public class PetleForEach {
    /*
    * Zadanie 1.
Wpisz do tablicy pojedyncze litery swojego imienia i wyświetl
*  je jedna pod drugą, za pomocą pętli for each.

Zadanie 2.
Wylosuj 500 000 liczb od 1 do 100 za pomocą pętli for.
* Następnie wykorzystaj pętlę for each, aby przejrzeć wylosowane
*  liczby i policzyć ile razy wystąpiła liczba 25.

Podpowiedź: aby kod był czytelniejszy możesz zapisać
*  w nim liczbę wykorzystując podkreślnik: “_”, zostanie on
*  pominięty w trakcie kompilacji kodu. np: 500_000

    * */
    public static void main(String[] args) {
        // zadanie 1
        char[] litery = {'D', 'a', 'n', 'i', 'e', 'l'};
        for (int i = 0; i < litery.length; i++) {
            System.out.println(litery[i]);
        }
        for(char litera : litery){
            System.out.println(litera);
        }

        System.out.println();
        //zadanie 2
        int[] wylosowane = new int[500_000];
        Random random = new Random();
        for (int i = 0; i < wylosowane.length; i++) {
            wylosowane[i] = random.nextInt(100) +1;
        }

        int ileZnalazlem = 0;
        for (int wylosowana : wylosowane) {
            if (wylosowana == 25) {
                ileZnalazlem++;
            }
        }
        System.out.println("Wylosowalo sie " + ileZnalazlem + " liczb 25 w 500");

    }
}
