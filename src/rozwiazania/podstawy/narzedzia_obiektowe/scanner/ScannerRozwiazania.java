package rozwiazania.podstawy.narzedzia_obiektowe.scanner;

import java.util.Scanner;

public class ScannerRozwiazania {
    public static void main(String[] args) {
        //zad 1
       Scanner input = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String imie = input.nextLine();
        System.out.println("Twoje imie to... " + imie);
        System.out.println("Cześć " + imie + "!");

        System.out.println("Podaj wiek");
        int wiek = input.nextInt();
        System.out.println("Masz " + wiek + " lat");
        System.out.println("Czy jesteś pełnoletni? " + (wiek >= 18));

        //ulepszony BMI:
        System.out.println("Podaj wagę w kg:");
        double waga = input.nextDouble();
        System.out.println("Podaj wzrost w metrach:");
        double wzrost = input.nextDouble();
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
