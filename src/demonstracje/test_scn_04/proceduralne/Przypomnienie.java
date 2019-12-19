package demonstracje.test_scn_04.proceduralne;

import java.util.Scanner;

public class Przypomnienie {
    public static void main(String[] args) {
       /* System.out.println("Zaczynamy!");
        System.out.print("między ");
        System.out.println("Dalej");

        int liczba = 20;

        liczba = 30;
        System.out.println(liczba);

         liczba += 10;
        System.out.println(liczba);

        String tekst = "co tam?";
        tekst += " Jak mija dzień?";
        System.out.println(tekst);
        long duzaLiczba = 1000;
        liczba =(int) duzaLiczba;

        System.out.println(liczba);


        System.out.println(tekst.charAt(0));
       char litera =  tekst.charAt(0);

        System.out.println("Czy znak "+ litera + " jest cyfrą: " +
                Character.isDigit(litera) );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak się nazywasz?");
        String imie = scanner.nextLine();
        System.out.println("Cześć  " + imie);*/

        int liczba = 31;
        // 15-30
        int wynik;
        if (liczba <= 15 || liczba >= 30) {
            System.out.println("Jest mniejsza od 15 lub większa od 30");
            wynik = liczba * 2;
        } else {
            System.out.println("Liczba poza przedziałem");
            wynik = liczba / 2;
        }
        System.out.println(wynik);



    }
}
