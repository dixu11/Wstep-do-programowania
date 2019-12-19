package rozwiazania.obiektowe.konstruktory.zadanie1Klient;

public class Klient {
    //cechy - domyślnie prywatne
   private String imie;
   private int wiek;
   private boolean premium;

   //konstruktory
    public Klient(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Klient(String imie) {
        this.imie = imie;
        wiek = 18;
    }

    public Klient(int wiek) {
        this.wiek = wiek;
        imie = "Jan";
    }

    public Klient() {
        imie = "Jan";
        wiek = 18;
    }

    //metody własne
    void wyprawUrodziny() {
        System.out.println(imie + " obchodzi urodziny!");
        wiek++;
        System.out.println("Ma teraz: " + wiek + " lat.");
    }

    void awansujDoKlientaPremium() {
        premium = true;
    }

    void zdegradujDOZwyklegoKlienta() {
        premium = false;
    }

    //metody standardowe
    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Imię: " + imie + ", wiek: " + wiek + ", premium: " + premium;
    }
}
