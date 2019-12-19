package rozwiazania.obiektowe.konstruktory.zadanie3Linia;

public class LiniaDemo {
    public static void main(String[] args) {
        Linia linia = new Linia();
        Linia linia2 = new Linia(32,"^");
        Linia linia3 = new Linia(8,"\"");

        linia.drukujLinie();
        linia2.drukujLinie();
        linia3.drukujLinie();
    }
}
