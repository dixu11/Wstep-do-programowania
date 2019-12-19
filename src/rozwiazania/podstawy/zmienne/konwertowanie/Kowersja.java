package rozwiazania.podstawy.zmienne.konwertowanie;

public class Kowersja {
    public static void main(String[] args) {
        //zad 1
        int liczbaInt = 10;
        long liczbaLong = 35L;
        double liczbaDouble = 15.64;

        liczbaLong = liczbaInt;
        //liczbaInt = liczbaLong;
        System.out.println("Po automatycznej konwersji wynik: " + liczbaLong);

        //zad 2
        byte liczbaByte = 10;
        int liczbaInt2 = 127;
        liczbaByte = (byte) liczbaInt2;
        System.out.println("Po rzutowaniu wynik: " + liczbaByte);
        liczbaByte = (byte)128;
        System.out.println("Po przekroczeniu zakresu: " + liczbaByte); // przekręca się licznik!

        //zad 3
        int mojInt3 = -5;
        double mojDouble3 = 5.55;
        mojInt3 = (int) mojDouble3;
        System.out.println("Wynik po rzutowaniu double na int: " + mojInt3);
        mojInt3 = (int) (mojDouble3 * 2.5);
        // potrzebny dodatkowy nawias żeby castowana była wartość po przemnożeniu a nie przed
        System.out.println("Wynik po przemnożeniu: " + mojInt3);





    }
}
