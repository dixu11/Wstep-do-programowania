package rozwiazania.proceduralne.pola;

import java.util.Arrays;
import java.util.Random;

public class Zad2 {
    static int tabsLength = 5;
    static int[] tab1 = new int[tabsLength];
    static int[] tab2 = new int[tabsLength];

    public static void main(String[] args) {
        wyswietlTablice();
        wylosujLiczby();
        wyswietlTablice();
        wKtorejWiecej();

    }

    public static void wylosujLiczby() {
        Random random = new Random();
        for (int i = 0; i < tabsLength; i++) {
            tab1[i] = random.nextInt(10);
            tab2[i] = random.nextInt(10);
        }
    }

    public static void wKtorejWiecej() {
        int tab1Sum = 0;
        int tab2Sum = 0;
        for (int i = 0; i < tabsLength; i++) {
            tab1Sum += tab1[i];
            tab2Sum += tab2[i];
        }
        System.out.println("Suma w 1: " + tab1Sum);
        System.out.println("Suma w 2: " + tab2Sum);
        if (tab1Sum > tab2Sum) {
            System.out.println("Tab1 większa");
        } else if (tab1Sum < tab2Sum) {
            System.out.println("Tab2 większa");
        } else {
            System.out.println("W tablicach tyle samo");
        }
    }

    public static void wyswietlTablice() {
        for (int i = 0; i < tabsLength; i++) {
            System.out.println("i = " + i + " : tab1 : " + tab1[i] +
                    " tab2 : "+ tab2[i] );
        }
        System.out.println();
    }
}
