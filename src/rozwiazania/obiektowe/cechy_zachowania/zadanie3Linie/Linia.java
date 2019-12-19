package rozwiazania.obiektowe.cechy_zachowania.zadanie3Linie;

public class Linia {
    //cechy
    int dlugosc;
    String wypelnienie;

    //zachowania
    void drukujLinie() {
        for (int i = 0; i < dlugosc; i++) {
            System.out.print(wypelnienie);
        }
        System.out.println();
    }

}
