package rozwiazania.obiektowe.cechy_zachowania.zadanie1Klient;

public class KlientDemo {
    public static void main(String[] args) {
        Klient klient1 = new Klient();
        Klient klient2 = new Klient();
        Klient klient3 = new Klient();

        klient1.imie = "Marcin";
        klient1.wiek = 30;

        klient2.imie = "Kasia";
        klient2.wiek = 27;

        klient3.imie = "Leszek";
        klient3.wiek = 35;

        System.out.println(klient1.podajDane());
        System.out.println(klient2.podajDane());
        System.out.println(klient3.podajDane());

        klient1.awansujDoKlientaPremium();
        klient1.zdegradujDOZwyklegoKlienta();
        klient2.wyprawUrodziny();
        klient2.awansujDoKlientaPremium();
        klient3.zmienImie("Wojtek");

        System.out.println(klient1.podajDane());
        System.out.println(klient2.podajDane());
        System.out.println(klient3.podajDane());
    }
}
