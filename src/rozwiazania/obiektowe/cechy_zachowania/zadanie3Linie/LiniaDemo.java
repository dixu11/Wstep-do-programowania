package rozwiazania.obiektowe.cechy_zachowania.zadanie3Linie;

public class LiniaDemo {
    public static void main(String[] args) {
        Linia linia = new Linia();
        Linia linia2 = new Linia();
        Linia linia3 = new Linia();

        linia.dlugosc = 10;
        linia.wypelnienie = "*";

        linia2.dlugosc = 32;
        linia2.wypelnienie = "^";

        linia3.dlugosc = 8;
        linia3.wypelnienie = "\"";

        linia.drukujLinie();
        linia2.drukujLinie();
        linia3.drukujLinie();
    }
}
