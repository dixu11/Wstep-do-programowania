package demonstracje.test_scn_04.podstawy.wywolywanie_metod.metody_bibliotek;

public class BiblitekiStatyczne {
    public static void main(String[] args) {
        int liczba = 10;
        liczba = Integer.MAX_VALUE;
        System.out.println(liczba);
        byte liczbaByte = Byte.MAX_VALUE;
        System.out.println(liczbaByte);

        liczba = 10;
        liczbaByte = 20;
        int suma = Integer.sum(liczba, liczbaByte);
        System.out.println(suma);
        String tekst = "20";
        int otrzymana = Integer.parseInt(tekst);
        System.out.println(otrzymana);
        System.out.println("Większa z 2 liczb (10) i (20) to: " +
                Integer.max(10, 20));

        char symbol = 'a';
        System.out.println(Character.isDigit(symbol));
        System.out.println(Character.isLowerCase(symbol));
        double zPrzecinkiem = 10.654;
       int  zaokraglona=  (int) Math.round(zPrzecinkiem);
        System.out.println(zaokraglona);
        double wylosowana = Math.random();
        System.out.println(wylosowana);
        wylosowana = wylosowana * 100;
        System.out.println(wylosowana);
        System.out.println(Math.pow(2,10));





    }
}
