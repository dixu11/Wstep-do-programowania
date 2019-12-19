package rozwiazania.podstawy.instrukcje_warunkowe;

import java.util.Scanner;

public class Zadanie1Zadanie2 {
    public static void main(String[] args) {
        //zad 1
        Scanner scanner = new Scanner(System.in); // szykujemy narzędzie do pobierania danych
        System.out.println("Witaj, ile masz lat?");
        int wiek = scanner.nextInt(); //pobieramy liczbę z konsoli i zapisujemy ją w nowej zmiennej int
        if (wiek >= 18) { // jeśli podano więcej niż 18...
            System.out.println("Jesteś pełnoletni!"); // ...wykonuje się ten kod
        }else { // jeśli warunek nie jest spełniony...
            System.out.println("Nie jesteś pełnoletni");
        }

        //zad 2
        // ponieważ w poprzednim zadaniu stworzyłem Scanner nie muszę tworzyć go ponownie
        System.out.println("Podaj liczbę a ja powiem Ci co o niej myslę...");
        int liczba = scanner.nextInt();

        if(liczba > 0){
            System.out.println("Liczba dodatnia!");
        }else if(liczba == 0){
            System.out.println("Podałeś 0");
        } else{
            System.out.println("Liczba ujemna");
        }

        if (liczba % 2 == 0) {
            System.out.println("Parzysta!");
        } else {
            System.out.println("Nieparzysta!");
        }

    }
}
