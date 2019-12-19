package rozwiazania.proceduralne.argumenty_zwracanie;

public class Zad1 {
    public static void main(String[] args) {
        przywitaj("Marcin");
        ktoraMniejsza(10, 15);
        int[] przykladowe = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        wyswietlTablice(przykladowe);
    }

    static void przywitaj(String imie) {
        System.out.println("Witaj " + imie + "!");
    }

    static void ktoraMniejsza(int liczba1, int liczba2) {
        if (liczba1 < liczba2) {
            System.out.println(liczba1 + " mniejsza");
        } else if (liczba2 < liczba1) {
            System.out.println(liczba2 + " mniejsza");
        } else {
            System.out.println("Obie identyczne");
        }
    }

    static void wyswietlTablice(int[] liczby) {
        for (int liczba : liczby) {
            System.out.print(liczba + " ");
        }
        System.out.println();
    }
}
