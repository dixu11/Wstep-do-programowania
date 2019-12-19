package rozwiazania.podstawy.instrukcje_warunkowe;

import java.util.Scanner;

public class Rozwiazania {
    public static void main(String[] args) {
  /*      Zadanie 3.
   Zrób grę w zgadywanie, w której program losuje liczbę od 1 do 10
   , a gracz ma 2 próby aby zgadnąć liczbę. W przypadku
    każdej odpowiedzi gracz dostaje informację zwrotną:
    za wysoko/za nisko/trafiona.*/

     double wylosowanaDb = Math.random();
        wylosowanaDb *= 10;
        wylosowanaDb += 1;
        int wylosowana = (int)wylosowanaDb;
        System.out.println(wylosowana);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wylosowałem liczbę 1-10!" +
                "\nZgadnij jaka to liczba...");
        int proba = scanner.nextInt();
        System.out.println("Obstawiasz... " + proba);

        if (proba < 1 || proba > 10) {
            System.out.println("Nie słuchasz polecenia!");
        }
        if (proba == wylosowana){
            System.out.println("Wygrałeś!");
            return;
        } else if (proba > wylosowana) {
            System.out.println("Za wysoko!");
        }else {
            System.out.println("Za nisko!");
        }
        System.out.println("Spróbuj jeszcze raz!");
        proba = scanner.nextInt();
        System.out.println("Obstawiasz... " + proba);

        if (proba < 1 || proba > 10) {
            System.out.println("Nie słuchasz polecenia!");
        }
        if (proba == wylosowana){
            System.out.println("Wygrałeś!");
            return;
        } else if (proba > wylosowana) {
            System.out.println("Za wysoko!");
        }else {
            System.out.println("Za nisko!");
        }
    }
}
