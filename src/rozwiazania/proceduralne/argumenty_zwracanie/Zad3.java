package rozwiazania.proceduralne.argumenty_zwracanie;

import java.util.Scanner;

public class Zad3 {

    static String poprawnyLogin = "korek123";
    static String poprawneHaslo = "worek321";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login;
        String haslo;
        do {
            System.out.println("Podaj login");
            login = scanner.nextLine();
            System.out.println("Podaj hasło");
            haslo = scanner.nextLine();
        } while (!zalogujSie(login, haslo));
    }

    static boolean zalogujSie(String login, String haslo) {
        if (login.isEmpty()) {
            System.err.println("Login nie może być pusty");
            return false;
        }
        if (haslo.isEmpty()) {
            System.err.println("Hasło nie może być puste");
            return false;
        }
        if (!login.equals(poprawnyLogin)) {
            System.err.println("Niepoprawny login");
            return false;
        }
        if (!haslo.equals(poprawneHaslo)) {
            System.err.println("Niepoprawne hasło");
            return false;
        }
        System.out.println("Zalogowano poprawnie");
        return true;
    }
}
