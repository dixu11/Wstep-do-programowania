package rozwiazania.podstawy.wywolywanie_metod.metody_obiektow;

/*
Stwórz zmienną typu String i zainicjuj ją dowolnym zdaniem złożonym, a następnie:
wyświetl zdanie dużymi literami,
zapisz w zmiennej odpowiedniego typu ilość symboli w zdaniu,
wyświetl pierwszą  i piątą literę w tym zdaniu,
nadpisz stworzoną zmienną tak, żeby zawierała zdanie wielkimi literami,
wyświetl odpowiedź na pytanie czy w zdaniu znajduje się słowo “nie” (true/false),
wyświetl fragment tekstu od znaku 5 do 13,
wyświetl fragment tekstu od znaku 7 do końca,
wyświetl ostatnią literę zdania,
wyświetl zdanie 10 razy wykorzystując odpowiednie metody.
*/
public class MetodyObiektow {
    public static void main(String[] args) {
        //zad 1
        String zdanie = "Przychodzi baba do lekarza a lekarz nie baba :)";
        System.out.println(zdanie.toUpperCase());
        int iloscZnakow = zdanie.length();
        System.out.println(zdanie.charAt(0));
        System.out.println(zdanie.charAt(4));
        System.out.println(zdanie.charAt(0) + " " + zdanie.charAt(4));
        zdanie = zdanie.toUpperCase();
        System.out.println(zdanie.toLowerCase().contains("nie"));
        System.out.println(zdanie.substring(4,12));
        System.out.println(zdanie.substring(7));
        //trudne ->
        System.out.println(zdanie.charAt(iloscZnakow-1));
        zdanie = zdanie + "\n";
        System.out.println(zdanie.repeat(10));
        // System.out.println(zdanie.concat("\n").repeat(10)); // dodanie "entera" tylko na potrzeby wyświetlenia powielonego tekstu


    }

}
