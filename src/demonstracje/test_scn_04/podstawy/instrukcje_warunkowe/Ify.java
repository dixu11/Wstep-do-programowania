package demonstracje.test_scn_04.podstawy.instrukcje_warunkowe;

import java.util.Scanner;

public class Ify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ulubioną liczbę");
        int liczba = scanner.nextInt();
        System.out.println("Twoja liczba to: " + liczba);

        // 5 - 10
        if (liczba >= 5 && liczba <= 10) {
            System.out.println("Liczba z przedziału 5-10");
        }


        if(liczba > 0){
            System.out.println("Liczba dodatnia!");
        }else if(liczba == 0){
            System.out.println("Podałeś 0");
        } else{
            System.out.println("Liczba ujemna");
        }

        if (liczba % 2 == 0) {
            System.out.println("Parzysta!");
        } else {
            System.out.println("Nieparzysta!");
        }

    }
}
