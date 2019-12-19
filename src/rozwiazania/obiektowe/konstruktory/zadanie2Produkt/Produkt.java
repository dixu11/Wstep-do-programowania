package rozwiazania.obiektowe.konstruktory.zadanie2Produkt;

public class Produkt {
    //cechy
   private String nazwa;
   private double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Produkt(String nazwa) {
        this.nazwa = nazwa;
        cena = 50;
    }

    public Produkt() {
        nazwa = "Standardowa Usługa";
        cena = 50;
    }


    //zachowania
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

    //metody standardowe
    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return  nazwa + " cena: " + cena + "zł";
    }
}
