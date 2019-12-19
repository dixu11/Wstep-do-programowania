package demonstracje.test_scn_04.proceduralne;

import java.util.Scanner;

public class Klasa2 {

    public static void pobierzImie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String imie = scanner.nextLine();
        System.out.println("Witaj " + imie);

    }
}
