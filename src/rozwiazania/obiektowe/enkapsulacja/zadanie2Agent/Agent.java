package rozwiazania.obiektowe.enkapsulacja.zadanie2Agent;

public class Agent {
    //prywatne cechy
    private String narodowosc;
    private String tajnyDokument;

    //wlasne metody
    String przekazTajnyDokument(String narodowoscPytajacego) {
        if (narodowosc.equals(narodowoscPytajacego)) {
            return tajnyDokument;
        }
        return "";
    }

    //metody standardowe
    public void setNarodowosc(String narodowosc) {
        this.narodowosc = narodowosc;
    }

    public void setTajnyDokument(String tajnyDokument) {
        this.tajnyDokument = tajnyDokument;
    }

    @Override
    public String toString() {
        return "Agent narodowości " + narodowosc + " z tajną wiadomością "
                + tajnyDokument.length() + " znaków.";
    }
}
