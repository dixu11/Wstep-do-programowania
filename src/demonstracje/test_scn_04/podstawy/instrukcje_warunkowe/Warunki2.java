package demonstracje.test_scn_04.podstawy.instrukcje_warunkowe;

import java.util.Scanner;

public class Warunki2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Na ile rat bierzesz produkt 6-12?");
        int raty = scanner.nextInt();

        if (raty < 6 || raty>12) {
            System.err.println("Niepoprawnie wprowadzone dane");
            return;
        }

        System.out.println("Wyliczam cenę jednej raty...");


    }
}
