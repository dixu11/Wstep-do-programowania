package rozwiazania.podstawy.petle_for;

import java.util.Arrays;

/*
*Zadanie 1.
Stwórz pętlę, która:
wyświetla liczby od -1 000 do 1 000 włącznie,
wyświetla co drugą liczbę od 500 do 950,
wyświetla liczby od 10 do 1,
wyświetla wszystkie pozycje w tablicy, w której wypisałeś trzy ulubione potrawy,
zmienia wszystkie pozycje tablicy na <brak składników>,
wyświetla zmienioną tablicę.

Zadanie 2.
Napisz program, który rysuje prostokąt z określonych znaków: szerokość 8 znaków, wysokość 4 wiersze, znak: “*”

Zadanie 3.
Zmodyfikuj poprzedni program:  to użytkownik ma zdecydować ile ma być znaków a ile wierszy, a także jakim znakiem ma wypełnić się prostokąt.

* */
public class PetleFor1 {

    public static void main(String[] args) {
        //zad 1
        for (int i = -1000; i <= 1000; i++) {
            System.out.println(i);
        }
        System.out.println("----");
        for (int i = 500; i< 950; i+=2){
            System.out.println(i);
        }
        System.out.println("----");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("----");
        String[] potrawy = {"barszcz", "mielone", "kebab"};
        for (int i = 0; i < potrawy.length; i++) {
            System.out.println(potrawy[i]);
        }
        System.out.println("----");
        //fori
        for (int i = 0; i < potrawy.length; i++) {
            potrawy[i] = "<brak składników>";
        }
        System.out.println(Arrays.toString(potrawy));
        //8(szerokosc) // 4 // *

        //zad2 + mozna dodac skaner
        int szerokosc = 8;
        int wysokosc = 4;
        char wypelnienie = '*';

        for (int i = 0; i < wysokosc; i++) {
            //ciag gwiazdek
            for (int j = 0; j < szerokosc; j++) {
                System.out.print(wypelnienie);
            }
            //enter
            System.out.println();
        }

        for (int i = 0; i < potrawy.length; i++) {
            String potrawa = potrawy[i];
            System.out.println(potrawa);
        }


        //petle for-each sa wygodniejsze do przegladania zbiorow
        //nie sa w stanie modyfikowac wartosc
        for (String potrawa : potrawy) {
            System.out.println(potrawa);
        }
    }


}
