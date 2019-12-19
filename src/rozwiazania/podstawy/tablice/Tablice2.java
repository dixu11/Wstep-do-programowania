package rozwiazania.podstawy.tablice;

import java.util.Arrays;
import java.util.Random;

/*Zadanie 1.
Stwórz tablicę skróconym sposobem:
liczb zmiennoprzecinkowych z 4 elementami,
wartości boolean z 2 miejscami.
tablicę znaków z literami: j, a, v, a

DODATKOWO: Wyświetl zawartość tablic za pomocą odpowiedniej metody z biblioteki Arrays.

Zadanie 2.
Również w klasie z zadania pierwszego stwórz tablicę Randomów uzupełnioną trzema obiektami. Za pomocą drugiego z Randomów wylosuj i wyświetl liczbę od 3 do 6.

* */
public class Tablice2 {
    public static void main(String[] args) {
        //zad1
        double[] liczby = {12.435, 34.45, 2 + 2, 7.8};
        System.out.println(Arrays.toString(liczby));
        boolean[] booleans = {true, liczby[0] > 0};
        char[] java = {'j', 'a', 'v', 'a'};

        //zad2
        Random[] randoms = {new Random(), new Random(), new Random()};
        System.out.println(randoms[1].nextInt(4) + 3);


    }
}
