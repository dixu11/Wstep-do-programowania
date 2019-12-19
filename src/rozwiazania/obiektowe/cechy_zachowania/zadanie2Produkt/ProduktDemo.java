package rozwiazania.obiektowe.cechy_zachowania.zadanie2Produkt;

public class ProduktDemo {
    public static void main(String[] args) {
        Produkt pralka = new Produkt();
        Produkt szczoteczka = new Produkt();
        Produkt szampon = new Produkt();
        Produkt recznik = new Produkt();

        pralka.nazwa = "Pralka";
        pralka.cena = 1000;

        szczoteczka.nazwa = "Szczoteczka";
        szczoteczka.cena = 2.99;

        szampon.nazwa = "Szampon";
        szampon.cena = 12.99;

        recznik.nazwa = "Ręcznik";
        recznik.cena = 19.99;

        System.out.println(pralka.zwrocEtykiete());
        System.out.println(szczoteczka.zwrocEtykiete());
        System.out.println(szampon.zwrocEtykiete());
        System.out.println(recznik.zwrocEtykiete());

        System.out.println("Cena po rabacie 10% pralka" +
                pralka.cenaPoRabacie(0.1));
        szczoteczka.zmienCene(4.99);
        szampon.zmienCene(10);
        System.out.println(recznik.cenaPoRabacie(-10));
        System.out.println(recznik.cenaPoRabacie(50));

        System.out.println(pralka.zwrocEtykiete());
        System.out.println(szczoteczka.zwrocEtykiete());
        System.out.println(szampon.zwrocEtykiete());
        System.out.println(recznik.zwrocEtykiete());

    }
}
