package rozwiazania.obiektowe.cechy_zachowania.zadanie1Klient;

public class Klient {
    //cechy
    String imie;
    int wiek;
    boolean premium;

    //zachowania
    String podajDane() {
        return "Imię: " + imie + ", wiek: " + wiek + ", premium: " + premium;
    }

    void wyprawUrodziny() {
        System.out.println(imie + " obchodzi urodziny!");
        wiek++;
        System.out.println("Ma teraz: " + wiek + " lat.");
    }

    void zmienImie(String noweImie) {
        imie = noweImie;
    }

    boolean czyJestKlientemPremium() {
        return premium;
    }

    void awansujDoKlientaPremium() {
        premium = true;
    }

    void zdegradujDOZwyklegoKlienta() {
        premium = false;
    }
}
