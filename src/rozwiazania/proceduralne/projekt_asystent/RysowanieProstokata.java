package rozwiazania.proceduralne.projekt_asystent;

import java.util.Scanner;

public class RysowanieProstokata {

    private static int szerokosc, wysokosc;
    private static String wypelnienie;

    public static void rysujProstokat() {
        zbierzDane();
        drukujProstokat();
    }

    private static void zbierzDane() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaka ma być szerokość?");
        szerokosc = scanner.nextInt();
        System.out.println("Jaka ma być wysokość?");
        wysokosc = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Jakie ma być wypełnienie? Napisz jeden znak");
        wypelnienie = scanner.nextLine();


    }

    private static void drukujProstokat() {
        for (int i = 0; i < wysokosc; i++) {
            //ciag gwiazdek
            for (int j = 0; j < szerokosc; j++) {
                System.out.print(wypelnienie);
            }
            //enter
            System.out.println();
        }
    }
}
