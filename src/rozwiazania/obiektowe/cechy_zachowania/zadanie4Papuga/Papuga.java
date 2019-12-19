package rozwiazania.obiektowe.cechy_zachowania.zadanie4Papuga;

import java.util.Random;
import java.util.Scanner;

public class Papuga {
    String imie;
    String[] znaneSlowa = {"arrr", "arrr", "arrr", "arrr", "arrr"};
    Random random = new Random();

    void sluchaj() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co mówisz do papugi?");
        System.out.println(imie + " słucha...");
        String slowo = scanner.nextLine();
        znaneSlowa[random.nextInt(znaneSlowa.length)] = slowo;
        System.out.println("Papuga zapamiętała!");
    }

    void gadaj() {
        int ileRazy = random.nextInt(4) + 1;
        System.out.print(imie + " mówi: ");
        for (int i = 0; i < ileRazy; i++) {
            System.out.print(znaneSlowa[random.nextInt(znaneSlowa.length)] + " ");
        }
        System.out.println();
    }
}
