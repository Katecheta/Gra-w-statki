public class Figura {

    static String[][] poleGry = new String[10][10]; // tablica pola gry

    // ponizej wsporzedne tworzace calafigure
    int wspX1;  // wspolrzedne pierwszego klocka
    int wspY1;

    int wspX2;  // wspolrzedne drugiego klocka
    int wspY2;

    int wspX3;  // wspolrzedne trzeciego klocka
    int wspY3;

    int wspX4;  // wspolrzedne czwartego klocka
    int wspY4;

    Figura() {
        zerowanie();
    } // konstruktor domyslny

    static String full = "[**]";
    static String empty = "    ";

    //-------------------------------------- ruchy figur -----------------------------------------------
    public void ruchDolu() {
        nanoszenieFiguryNaPole(empty);

        wspX1 += 1;
        wspX2 += 1;
        wspX3 += 1;
        wspX4 += 1;

        nanoszenieFiguryNaPole(full);
        rysuj();
    }

    public void ruchPrawo() {
        nanoszenieFiguryNaPole(empty);
        wspY1 += 1;
        wspY2 += 1;
        wspY3 += 1;
        wspY4 += 1;
        nanoszenieFiguryNaPole(full);
        rysuj();
    }

    public void ruchLewo() {
        nanoszenieFiguryNaPole(empty);
        wspY1 -= 1;
        wspY2 -= 1;
        wspY3 -= 1;
        wspY4 -= 1;
        nanoszenieFiguryNaPole(full);
        rysuj();
    }

    //-------------------------------------------end----------------------------------------------------
    //------------------------------------czy mozna sie ruszyc------------------------------------------
    public boolean czyMoznaSieRuszycWPrawo() {
        return false;
    }

    public boolean czyMoznaSieRuszycWlewo() {
        return false;
    }

    public boolean czyMoznaSieRuszycWDul(){
        return false;
    }

    //----------------------------------------obroty figur----------------------------------------------

    int pozycjaFigury = 1;

    public void obrut() {
        nanoszenieFiguryNaPole(empty);


        nanoszenieFiguryNaPole(full);
    }

    //----------------------------------------operacje na polu-------------------------------------------
    public void nanoszenieFiguryNaPole(String nanoszenie) {
        poleGry[wspX1][wspY1] = nanoszenie;
        poleGry[wspX2][wspY2] = nanoszenie;
        poleGry[wspX3][wspY3] = nanoszenie;
        poleGry[wspX4][wspY4] = nanoszenie;

    }       //  nanoszenie figury na pole.

    public void rysuj() {

        System.out.println("------------------------------------------");

        for (int rzad = 0; rzad < poleGry.length; rzad++) {
            System.out.print("|");
            for (int kolumna = 0; kolumna < poleGry.length; kolumna++) {
                System.out.print(poleGry[rzad][kolumna]);
            }
            System.out.println("|");
        }
        System.out.println("------------------------------------------");
    }    // metoda kotra rysuje pole gry z objektu RysujPoleGry.

    public void zerowanie() {
        for (int wiersz = 0; wiersz < poleGry.length; wiersz++) {
            for (int kolumna = 0; kolumna < poleGry.length; kolumna++) {
                poleGry[wiersz][kolumna] = "    ";
            }
        }
    } // pierwsze wypelnienie tablicyna pusto.

}