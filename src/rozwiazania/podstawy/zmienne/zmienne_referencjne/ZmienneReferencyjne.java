package rozwiazania.podstawy.zmienne.zmienne_referencjne;

public class ZmienneReferencyjne {
    public static void main(String[] args) {
        //zad 1
        String imie = "Jan";
        String imie2 = new String("Jan");
        String nazwisko = "Kowalski";
        int wiek = 30;

        System.out.println("Pan " + imie + " "+ nazwisko +
                " ma dziś " + wiek + " urodziny!");

        //zad 2
        System.out.println(imie.toUpperCase());
        System.out.println(nazwisko.toUpperCase());
        //imie = null;
       // System.out.println(imie.toUpperCase());
        //uwaga - NullPointerException! - błąd zatrzymujący program

        //zad 3 - w pliku txt

        //zad 4
        int liczba1 = 20;
        int liczba2 = 5;
        int liczba3 = 12;
        System.out.println("Dodamy zadeklarowane zmienne do nowej...");
        int suma = liczba1 + liczba2 + liczba3;
        System.out.println(liczba1 + "+" + liczba2 + "+" + liczba3
        + "=" + suma);




    }
}
