package rozwiazania.podstawy.tablice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tablice3 {
    /*Zadanie 1.
Szybkim sposobem stwórz tablicę 10 liczb i wstaw liczby z przedziału 1 - 1000.
za pomocą pętli wyświetl wszystkie liczby,
wyświetl tylko liczby większe niż 100,
wyświetl tylko liczby większe niż 100 i mniejsze niż 500.

Podpowiedź: stwórz zmienną int, dzięki której wykonasz pętle tyle razy ile jest wartości w tablicy.
Podpowiedź 2: ustaw pomocniczą zmienną tak, żeby odpowiadała indeksom z tablicy: 0-9 i wykorzystaj ją, aby wybierać,  którą komórkę wyświetlasz.

Zadanie 2.
Za pomocą pętli wylosuj 6 liczb z dużego lotka i zapisz je w tablicy. Następnie wyświetl zawartość tablicy przy pomocy biblioteki Arrays.

Zadanie 3.
Napisz program, który zapyta użytkownika ile notatek potrzebuje i stworzy tablicę tekstów o wpisanej wielkości. Następnie stwórz pętlę, która pozwoli wprowadzać notatki tyle razy ile jest miejsc w tablicy i wyświetl wszystkie pozycje tablicy.

Podpowiedź: aby w jednym rzędzie drukować określoną ilość znaków stwórz pętlę, która w jednym powtórzeniu drukuje jeden znak instrukcją print() i wykonaj ją tyle razy ile znaków potrzebujesz.
Podpowiedź 2: instrukcją do wywołania w pętli może być inna pętla, nazywamy taki zapis zagnieżdżeniem pętli.

    * */
    public static void main(String[] args) {
        //zad 1
        int[] liczby = {12, 454, 777, 100, 44,
                666, 777, 888, 798, 111};
        int index = 0;
        while (index < liczby.length) {
            System.out.println(liczby[index]);
            index++;
        }

        System.out.println("------");
        index = 0;
        while (index < liczby.length) {
            if (liczby[index] > 100) {
                System.out.println(liczby[index]);
            }
            index++;
        }
        System.out.println("----");
        index = 0;
        while (index < liczby.length) {
            int liczba = liczby[index];
            if ( liczba> 100 && liczba<500) {
                System.out.println(liczba);
            }
            index++;
        }

        //zad 2
        int[] wylosowane = new int[6];
        Random random = new Random();
        index = 0;
        while (index < wylosowane.length) {
            wylosowane[index] = random.nextInt(20) + 1;
            index++;
        }
        System.out.println(Arrays.toString(wylosowane));

        //zad 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile chcesz notatek?");
        int iloscNotatek = scanner.nextInt();
        scanner.nextLine();
        String[] notatki = new String[iloscNotatek];
        for (int i = 0; i < notatki.length; i++) {
            System.out.println("Podaj notatkę");
            notatki[i] = scanner.nextLine();
        }
        System.out.println("Twoje notatki:");
        System.out.println(Arrays.toString(notatki));

        //Arrays.sort(notatki);
       // Arrays.binarySearch(notatki, "bla");
    }

}
