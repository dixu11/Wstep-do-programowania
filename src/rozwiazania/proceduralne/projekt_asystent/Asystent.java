package rozwiazania.proceduralne.projekt_asystent;

import java.util.Random;
import java.util.Scanner;

public class Asystent {
    private static String[] opcje = {"Zagrajmy w Lotto", "Wyświetl prostokąt",
            "Oblicz ratę", "Zakończ program"};
    private static String[] przywitania = {"Czołem", "Siema", "Hej", "Witaj", "Yo"};
    private static Random random = new Random();
    private static boolean menuUruchomione;

    public static void main(String[] args) {
        rozpocznijProgram();
    }

    private static void rozpocznijProgram() {
        System.out.println(generujPowitanie());
        powtarzajMenu();
        System.out.println(generujPozegnanie());
    }

    private static void powtarzajMenu() {
        menuUruchomione = true;
        do {
            uruchomMenu();
        } while (menuUruchomione);
    }

    private static void uruchomMenu() {
        generujListeOpcji();
        int wybor = pobierzWybor();
        uruchomOpcje(wybor);
    }

    private static void generujListeOpcji() {
        System.out.println();
        System.out.println("Co dzisiaj robimy?");
        for (int i = 0; i < opcje.length; i++) {
            System.out.println(i + 1 + ". " + opcje[i]);
        }
    }

    private static int pobierzWybor() {
        Scanner scanner = new Scanner(System.in);
        boolean wybranoPoprawnie;
        int wybor;
        do {
            wybranoPoprawnie = true;
            System.out.println("Wpisz numer opcji");
            String wyborString = scanner.nextLine();
            char[] characters = wyborString.toCharArray();
            for (char character : characters) {
                if (!Character.isDigit(character)) {
                    wybranoPoprawnie = false;
                    break;
                }
            }
            wybor = Integer.parseInt(wyborString);
            if (wybor < 1 || wybor > opcje.length) {
                wybranoPoprawnie = false;
            }
        } while (!wybranoPoprawnie);
        return wybor;
    }

    private static void uruchomOpcje(int wybor) {
        //mozna wymienic na instrukcje switch
        if (wybor == 1) {
            GraWLotto.zagrajWLoterie();
        } else if (wybor == 2) {
            RysowanieProstokata.rysujProstokat();
        } else if (wybor == 3) {
            ObliczanieRaty.obliczRaty();
        } else {
            menuUruchomione = false;
        }

    }

    private static String generujPowitanie() {
        return przywitania[random.nextInt(przywitania.length)] + "!";
    }

    private static String generujPozegnanie() {
        String pozegnanie = "";
        int ile = random.nextInt(5) + 1;
        for (int i = 0; i < ile; i++) {
            pozegnanie += "pa";
        }
        return pozegnanie + "!";
    }


}
