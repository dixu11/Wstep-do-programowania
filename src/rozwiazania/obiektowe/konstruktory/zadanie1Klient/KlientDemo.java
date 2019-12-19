package rozwiazania.obiektowe.konstruktory.zadanie1Klient;

public class KlientDemo {
    public static void main(String[] args) {
        Klient klient1 = new Klient("Marcin");
        Klient klient2 = new Klient("Kasia",27);
        Klient klient3 = new Klient(35);

        //jawne wywołanie toString
        System.out.println(klient1);
        System.out.println(klient2);
        System.out.println(klient3);

        klient1.awansujDoKlientaPremium();
        klient1.zdegradujDOZwyklegoKlienta();
        klient2.wyprawUrodziny();
        klient2.awansujDoKlientaPremium();
        klient3.setImie("Wojtek");

        //skrócone wywołanie toString
        System.out.println(klient1);
        System.out.println(klient2);
        System.out.println(klient3);
    }
}
