package rozwiazania.obiektowe.konstruktory.zadanie2Produkt;

public class ProduktDemo {
    public static void main(String[] args) {
        Produkt pralka = new Produkt("Pralka",1000);
        Produkt szczoteczka = new Produkt("Szczoteczka", 2.99);
        Produkt szampon = new Produkt("Szampon", 12.99);
        Produkt recznik = new Produkt("Ręcznik",19.99);

        System.out.println(pralka);
        System.out.println(szczoteczka);
        System.out.println(szampon);
        System.out.println(recznik);

        System.out.println("Cena po rabacie 10% pralka" +
                pralka.cenaPoRabacie(0.1));
        szczoteczka.setCena(4.99);
        szampon.setCena(10);
        System.out.println(recznik.cenaPoRabacie(-10));
        System.out.println(recznik.cenaPoRabacie(50));

        System.out.println(pralka);
        System.out.println(szczoteczka);
        System.out.println(szampon);
        System.out.println(recznik);

    }
}
