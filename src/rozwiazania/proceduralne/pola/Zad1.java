package rozwiazania.proceduralne.pola;

public class Zad1 {

    static String dna = "gggcccgtactgcaatcgagaaccgaacga";

    public static void main(String[] args) {
        System.out.println(dna);
        duzeLitery();
        System.out.println(dna);
        zamienLitery();
        System.out.println(dna);
        przytnijDo15();
        System.out.println(dna);
        wstawSpacjeCo3();
        System.out.println(dna);
    }

    public static void duzeLitery() {
        dna = dna.toUpperCase();
    }

    public static void zamienLitery() {
        dna = dna.replace("A", "T");
        dna = dna.replace("G", "C");
    }

    public static void przytnijDo15() {
        dna = dna.substring(0, 15);
        System.out.println(dna.length());
    }

    public static void wstawSpacjeCo3() {
        String poprawiony = "";
        for (int i = 0, counter = 1; i < dna.length(); i++, counter++) {
            poprawiony += dna.charAt(i);
            if (counter == 3) {
                poprawiony += " ";
                counter = 0;
            }
        }
        dna = poprawiony;
    }


}
