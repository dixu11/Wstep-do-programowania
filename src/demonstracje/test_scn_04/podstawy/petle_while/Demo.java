package demonstracje.test_scn_04.podstawy.petle_while;

import java.util.Random;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        int licznik = 0;
        while (licznik < 10) {
           // Thread.sleep(1000);
            System.out.println(licznik+1);
            licznik++;
        }
        System.out.println("------");

        //zad - pętla wykonuje losowanie od 1-10 tak długo aż nie trafi 10
        Random random = new Random();
        int wylosowana = 1;
        // deklaruję zmienną przed pętlą aby mieć do niej dostęp w warunku
        // przypisuję 1 żeby w zmiennej było "cokolwiek" na start
        // bo inaczej nie sprawdzę warunku
        while(wylosowana != 10) {
             wylosowana= random.nextInt(10) + 1;//losuje 1-10
            System.out.println(wylosowana);
        }

    }
}
