package rozwiazania.podstawy.tablice;
/*Zadanie 1.
Napisz program “Poszukiwany”, stwórz i przypisz do odpowiedniej zmiennej dwie tablice:
tablica liczb z 4 miejscami,
tablica tekstów z 2 miejscami.
Następnie przypisz ręcznie:
do liczb: osobno dzień,  miesiąc, rok ucieczki z więzienia,
na 4 pozycji wpisz kwotę nagrody,
do tekstów:  imię  i nazwisko uciekiniera.
Wyświetl uzupełnioną wiadomość:
“ … - … - ….. zbiegł więzień …… …….. !”
“Nagroda za doprowadzenie: ……….$!”

Zadanie 2.
Zmodyfikuj poprzedni program tak, aby bez względu na wielkość tablicy liczb, w miejscu przeznaczonym na kwotę pieniężną program zawsze wstawiał ostatni element z tablicy,  a nie 4 element.
*/
public class Tablice {
    public static void main(String[] args) {
        int[] dataINagroda = new int[4];
        String[] imieNazwisko = new String[2];
        dataINagroda[0] = 10;
        dataINagroda[1] = 5;
        dataINagroda[2] = 2015;
        dataINagroda[3] = 50_000;
        imieNazwisko[0] = "Jan";
        imieNazwisko[1] = "Kowalski";
        System.out.println(dataINagroda[0] + "-" + dataINagroda[1] + "-"
        + dataINagroda[2] + " zbiegł więzień " + imieNazwisko[0] + " " +
                imieNazwisko[1] + ".");
        System.out.println("Nagroda za przyprowadzenie: " +
                dataINagroda[dataINagroda.length -1] + "zł");

    }
}
