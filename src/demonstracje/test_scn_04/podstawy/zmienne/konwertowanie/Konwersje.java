package demonstracje.test_scn_04.podstawy.zmienne.konwertowanie;

public class Konwersje {
    public static void main(String[] args) {
        int liczbaInt = 129;
        short liczbaShort = 20;
        liczbaShort = (short)liczbaInt;
        System.out.println(liczbaShort);
        byte mojByte = 127;
        mojByte = (byte)liczbaInt;
        System.out.println(mojByte);

        double liczbaDouble = 13;
        liczbaInt = (int) liczbaDouble;
        System.out.println(liczbaInt);

        liczbaInt = 107;
        char litera = 'a';
        litera = (char)liczbaInt;
        System.out.println(litera);




        //liczba = warunek;


    }
}
