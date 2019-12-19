package rozwiazania.podstawy.wywolywanie_metod.metody_bibliotek;

public class MetodyBibliotek {
    public static void main(String[] args) {
        //zad 1
        System.out.println(Math.pow(2, 5));

        //zad 2
       String tekst = "ul. Wiejska 1";
      char ostatnia =  tekst.charAt(tekst.length() -1);
        System.out.println(tekst);
        System.out.println("Czy ostatni znak to cyfra?: " +Character.isDigit(ostatnia));
        System.out.println("------------------------------");

        //zad 3 - trudne
       double wylosowana =  Math.random();
        System.out.println("Wylosowało się: " + wylosowana);

        wylosowana = wylosowana * 100;
        System.out.println(wylosowana);
       long zaokraglona = Math.round(wylosowana);
        System.out.println("Jutro będzie padać na " + zaokraglona + " %!");

    }
}
