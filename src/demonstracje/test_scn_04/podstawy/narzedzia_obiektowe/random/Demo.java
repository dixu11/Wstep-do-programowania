package demonstracje.test_scn_04.podstawy.narzedzia_obiektowe.random;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Wylosuję liczbę od 0-4");
        int wylosowana = random.nextInt(5);
        System.out.println(wylosowana);
        //5-15
        System.out.println("Wylosuję liczbę od 5-15");
        int wylosowana2 = random.nextInt(11)+5;
        System.out.println(wylosowana2);
        System.out.println(random.nextBoolean());
    }
}
