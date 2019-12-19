package rozwiazania.obiektowe.cechy_zachowania.zadanie2Produkt;

public class Produkt {
    //cechy
    String nazwa;
    double cena;

    //zachowania
    void zmienCene(double nowaCena) {
        cena = nowaCena;
    }

    String zwrocEtykiete() {
        return nazwa + " cena: " + cena + "zł";
    }

    double cenaPoRabacie(double rabat) {
        if (rabat < 0) {
            System.err.println("Rabat ma być liczbą dodatnią");
            return -1;
        }
        if (rabat > 1) {
            System.err.println("Podaj rabat jako liczbę z przedziału 0 do 1");
            return -1;
        }
        return cena * (1 - rabat);
    }
}
