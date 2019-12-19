package demonstracje.test_scn_04.podstawy.operatory;

public class Demo {
    public static void main(String[] args) {
        int liczba = 6;
        System.out.println(liczba % 2);
        liczba = liczba + 4;
        System.out.println(liczba);
        liczba *= 4;
        System.out.println(liczba);

        String tekst = "Ala ma kota";
        tekst += " a kot ma Ale";
        System.out.println(tekst);

        liczba++; // 41
        liczba--; // 40
        System.out.println(++liczba); // strona po ktorej damy ++ ma znaczenie

        System.out.println(liczba);
        liczba++;

        boolean czyDodatnia = liczba == 41;
        System.out.println(czyDodatnia);
        liczba = 11;
        boolean czyNieJest0 = liczba != 0;
        System.out.println(czyNieJest0);
        System.out.println(liczba > 10);



    }
}
