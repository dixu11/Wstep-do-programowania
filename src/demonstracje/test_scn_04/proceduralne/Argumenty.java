package demonstracje.test_scn_04.proceduralne;

public class Argumenty {

    public static void main(String[] args) {
        przywitaj("Marcin");
        dodajLiczby(10,20);
        dodajLiczby(20,30);
    }

    public static void przywitaj(String imie) {
        System.out.println("Cześć" + imie);
    }

    public static void dodajLiczby(int liczba1, int liczba2) {
        System.out.println("Suma to:");
        System.out.println(liczba1 + liczba2);
    }

}
