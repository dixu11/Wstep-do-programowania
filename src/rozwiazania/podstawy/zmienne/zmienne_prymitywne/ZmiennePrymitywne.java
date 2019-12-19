package rozwiazania.podstawy.zmienne.zmienne_prymitywne;

public class ZmiennePrymitywne {
    public static void main(String[] args) {
        //zad 1
        byte mojByte = 100;
        byte mojByte2 = -100;
        short mojShort = 10000;
        short mojShort2 = -10000;
        int mojInt = 1_000_000_000;
        int mojInt2 = -1_000_000_000;
        long mojLong = -1_000_000_000_000_000_000L;
        long mojLong2 = 1_000_000_000_000_000_000L;
        float mojFloat = 1232345.456f;
        float mojFloat2 = -1232345.456F;
        double mojDouble = 123.456454564564564523432423;
        double mojDouble2 = -123.456454564564564523432;
        char mojZnak = ' ';
        char mojZnak2 = 'b';
        char mojZnak3 = 90;
        boolean mojBolean = true;
        boolean mojBolean2 = false;

        //zad2
        //int suma = mojShort + mojDouble;   -> podkreśla bo ryzyko utraty reszty po przecinku
        double suma = mojShort + mojDouble;
        System.out.println("Wynik to: " + suma);

        //zad3
        boolean dodatnia = mojShort2 > 0;
        System.out.println("Czy w zmiennej mojShort2 jest liczba dodatnia?");
        System.out.println(dodatnia);

    }
}
