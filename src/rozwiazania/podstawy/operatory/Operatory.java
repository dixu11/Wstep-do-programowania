package rozwiazania.podstawy.operatory;

public class Operatory {
    /*
    * Operatory
Zadanie 1.
Zwiększ oraz zmniejsz zawartość zmiennej typu int o 1 wykorzystując wszystkie 3 poznane do tej pory sposoby.

Podpowiedź: wykorzystaj operatory: “=”, “+=”, “-=”, “++”, “--”

Zadanie 2.
Używając zmiennej typu String przetestuj operator +=, -= oraz *=. Nie kompilujące się instrukcje wykomentuj.

Zadanie 3.
Napisz program który oblicza wskaźnik BMI: wzór: waga/wzrost^2. Dodatkowo program ma sprawdzić
* czy BMI jest powyżej 24,9 - nadwaga lub czy BMI jest poniżej 18,5 - niedowaga.  Poinformuj o każdym działaniu programu.
    * */

    public static void main(String[] args) {
        //zad 1
        int liczba = 10;
        liczba = liczba + 1;
        System.out.println(liczba);
        liczba += 1;
        System.out.println(liczba);
        liczba++;
        System.out.println(liczba);
        liczba = liczba - 1;
        System.out.println(liczba);
        liczba -= 1;
        System.out.println(liczba);
        liczba--;
        System.out.println(liczba);

        //zad 2
        String imie = "Jan";
       // imie += " ";
        imie += " Kowalski";
        System.out.println(imie);
//        imie -= "Kowalski";
//        imie *= "Kowalski";


        //zad 3 - trudne
        double waga = 70;
        double wzrost = 1.80;
        System.out.println("Waga: " + waga);
        System.out.println("Wzrost: " + wzrost);
        // waga/wzrost^2
        System.out.println("Licze BMI...");
//        double bmi = waga / (wzrost * wzrost); //inny sposob
        double bmi = waga / Math.pow(wzrost,2);
        System.out.println("Wyszło: " + bmi);
        // czy BMI jest powyżej 24,9 - nadwaga lub czy BMI jest poniżej 18,5 - niedowaga.
        boolean nadwaga = bmi > 24.9;
        boolean niedowaga = bmi < 18.5;
          System.out.println("Nadwaga: " + nadwaga);
        System.out.println("Niedowaga: " + niedowaga);
    }
}
