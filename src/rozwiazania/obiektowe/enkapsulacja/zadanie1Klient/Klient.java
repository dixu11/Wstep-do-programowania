package rozwiazania.obiektowe.enkapsulacja.zadanie1Klient;

public class Klient {
    //cechy - domyślnie prywatne
   private String imie;
   private int wiek;
   private boolean premium;

    //zachowania
    void wyprawUrodziny() {
        System.out.println(imie + " obchodzi urodziny!");
        wiek++;
        System.out.println("Ma teraz: " + wiek + " lat.");
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public boolean isPremium() {
        return premium;
    }

    void awansujDoKlientaPremium() {
        premium = true;
    }

    void zdegradujDOZwyklegoKlienta() {
        premium = false;
    }

    @Override
    public String toString() {
        return "Imię: " + imie + ", wiek: " + wiek + ", premium: " + premium;
    }
}
