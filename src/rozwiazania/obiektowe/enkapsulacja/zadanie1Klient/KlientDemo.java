package rozwiazania.obiektowe.enkapsulacja.zadanie1Klient;

public class KlientDemo {
    public static void main(String[] args) {
        Klient klient1 = new Klient();
        Klient klient2 = new Klient();
        Klient klient3 = new Klient();

        klient1.setImie("Marcin");
        klient1.setWiek(30);

        klient2.setImie("Kasia");
        klient2.setWiek(27);

        klient3.setImie("Leszek");
        klient3.setWiek(35);

        //jawne wywołanie toString
        System.out.println(klient1.toString());
        System.out.println(klient2.toString());
        System.out.println(klient3.toString());

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
