package demonstracje.test_scn_04.proceduralne;

import java.util.Random;

public class Metody {

    public static void main(String[] args) {
        System.out.println("Rozpoczynam losowanie 3 liczb");
        wylosujLiczbe1do10();
        wylosujLiczbe1do10();
        wylosujLiczbe1do10();
        System.out.println("Koniec losowania");
        Klasa2.pobierzImie();

    }

    static void wylosujLiczbe1do10() {
        Random random = new Random();
        int wylosowana = random.nextInt(10) + 1;
        System.out.println("Wylosowało się: " + wylosowana);
    }

}
