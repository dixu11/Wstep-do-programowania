package demonstracje.test_scn_04.podstawy.wywolywanie_metod.metody_obiektow;

public class MetodyObiektow {
    public static void main(String[] args) {
        String powitanie = "Witam serdecznie! Co słychać?";
        System.out.println(powitanie.toUpperCase());
        System.out.println(powitanie);
        System.out.println(powitanie.length());
        String powitanieDuzymiLiterami = powitanie.toUpperCase();
        System.out.println(powitanieDuzymiLiterami);
        int iloscZnakow = powitanie.length();
        System.out.println(iloscZnakow);
        System.out.println( powitanie.isEmpty());
        boolean czyPusty = powitanie.isEmpty();
        System.out.println(czyPusty);
        System.out.println(powitanie.charAt(iloscZnakow -1));
        System.out.println(powitanie.toLowerCase().startsWith("witam"));
        System.out.println(powitanie.substring(4));
        System.out.println(powitanie.substring(5,15));
        System.out.println(  powitanie.concat("\n").repeat(10));
        powitanie.isEmpty(); // dokumentacja - ctrl + Q

    }
}
