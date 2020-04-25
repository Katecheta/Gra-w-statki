public class Figura {

    String[][] poleGry = new String[10][10]; // tablica pola gry

    int wspX1;
    int wspY1;

    int wspX2;
    int wspY2;

    int wspX3;
    int wspY3;

    int wspX4;
    int wspY4;


    Figura(int x) {  // Konstruktor figor
        switch (x) {
            case 1: {
                wspX1 = 0;           // pierwszy dlugiKlocek
                wspY1 = 4;
                wspX2 = 1;
                wspY2 = 4;
                wspX3 = 2;
                wspY3 = 4;
                wspX4 = 3;
                wspY4 = 4;
            }
            case 2: {
                wspX1 = 0;           // drugi kwadrat
                wspY1 = 4;
                wspX2 = 1;
                wspY2 = 4;
                wspX3 = 0;
                wspY3 = 5;
                wspX4 = 1;
                wspY4 = 5;
            }
        }
        zerowanie();
    }

    public void ruchDolu() {
        wspX1 += 1;
        wspX2 += 1;
        wspX3 += 1;
        wspX4 += 1;
    }

    public void ruchPrawo() {
        wspY1 += 1;
        wspY2 += 1;
        wspY3 += 1;
        wspY4 += 1;
    }

    public void ruchLewo() {
        wspY1 -= 1;
        wspY2 -= 1;
        wspY3 -= 1;
        wspY4 -= 1;
    }

    public nanoszenieFiguryNaPole() {
        poleGry[wspX1][wspY1] = "[**]";
        poleGry[wspX2][wspY2] = "[**]";
        poleGry[wspX3][wspY3] = "[**]";
        poleGry[wspX3][wspY3] = "[**]";
        poleGry[wspX4][wspY4] = "[**]";

        return poleGry;
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