package demonstracje.test_scn_04.podstawy.tablice;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        char[] litery = new char[5];
        litery[0] = 'a';
        litery[1] = 'b';
        litery[2] = 'c';
        litery[3] = 'd';
        litery[4] = 'e';
        System.out.println(litery[0]);

        int[] liczby = new int[3];
        liczby[0] = 10;
        liczby[1] = 20;
        System.out.println(liczby[0]);
        System.out.println(liczby[1]);
        System.out.println(liczby[2]);
        System.out.println(Arrays.toString(liczby));

        String[] imieNazwisko = new String[2];
        imieNazwisko[0] = "Jan";
        imieNazwisko[1] = "Kowalski";
        System.out.println("Cześć " + imieNazwisko[0] +" " + imieNazwisko[1]);
        System.out.println(imieNazwisko.length);

    }
}
