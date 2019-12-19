package demonstracje.test_scn_04.podstawy.tablice;

import java.util.Arrays;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        String[] imiona = {"Daniel", "Kasia", "Ania", "Marcin"};
        int index = 0;


        while (index < imiona.length) {
            System.out.println("Cześć " + imiona[index]);
            index++;
        }


        while (index < imiona.length) {
            if (imiona[index].endsWith("a")) {
                System.out.println("Cześć " + imiona[index]);
            }
            index++;
        }

        //wyświetli 4x losowo
        index = 0;
        Random random = new Random();
        while (index < imiona.length) {
            int wylosowany = random.nextInt(imiona.length);
            System.out.println(imiona[wylosowany]);
            index++;
        }


        int[] wylosowane = new int[50_000];
        int index2 = 0;
        while (index2 < wylosowane.length) {
            wylosowane[index2] = random.nextInt(10);
            index2++;
        }
        System.out.println(Arrays.toString(wylosowane));


    }
}
