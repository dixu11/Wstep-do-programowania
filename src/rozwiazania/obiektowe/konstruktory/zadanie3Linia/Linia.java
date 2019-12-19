package rozwiazania.obiektowe.konstruktory.zadanie3Linia;

import java.util.Scanner;

public class Linia {
    //cechy
   private int dlugosc;
   private String wypelnienie;

    public Linia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaką długość ma mieć linia?");
        dlugosc = scanner.nextInt();
        System.out.println("Jakie ma mieć wypełnienie?");
        scanner.nextLine(); // czysci bufor scannera po "\n" zostawionym przez nextInt
        wypelnienie = scanner.nextLine();
    }

    public Linia(int dlugosc, String wypelnienie) {
        this.dlugosc = dlugosc;
        this.wypelnienie = wypelnienie;
    }

    //zachowania
    void drukujLinie() {
        for (int i = 0; i < dlugosc; i++) {
            System.out.print(wypelnienie);
        }
        System.out.println();
    }

}
