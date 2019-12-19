package demonstracje.test_scn_04.podstawy.tablice;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int[] liczby = {45,67,34,23,56,78};
        String[] teksty = {"Ala", "Marcin"};
        System.out.println(Arrays.toString(liczby));
        System.out.println(teksty[1]);
        Scanner[] skanery = {new Scanner(System.in),new Scanner(System.in)};


    }
}
