public class Dlugi extends Figura {

    Dlugi() {
        wspX1 = 0;           // pierwszy dlugiKlocek
        wspY1 = 4;
        wspX2 = 1;
        wspY2 = 4;
        wspX3 = 2;
        wspY3 = 4;
        wspX4 = 3;
        wspY4 = 4;
    }

    //-------------------------------------prawo---------------------------------------
    @Override
    public boolean czyMoznaSieRuszycWPrawo() {
        if (pozycjaFigury == 1) {
            if (wspY1 + 1 >= poleGry[0].length ||
                    poleGry[wspX1][wspY1 + 1].equals(full) ||
                    poleGry[wspX2][wspY2 + 1].equals(full) ||
                    poleGry[wspX3][wspY3 + 1].equals(full) ||
                    poleGry[wspX4][wspY4 + 1].equals(full)) {
                return false;
            } else {
                return true;
            }
        } else if (wspY1 + 1 >= poleGry[0].length ||
                poleGry[wspX1][wspY1 + 1].equals(full)) {
            return false;
        } else
            return true;

    }

    @Override
    public void ruchPrawo() {
        if (czyMoznaSieRuszycWPrawo()) {
            super.ruchPrawo();
        } else
            System.out.println("Nie mozna sie ruszyc w prawo");
    }

    //-------------------------------------lewo----------------------------------------
    @Override
    public boolean czyMoznaSieRuszycWlewo() {
        if (pozycjaFigury == 1) { //przypadek dla pierwszej pozycji figury
            if (wspY4 - 1 < 0 ||
                    poleGry[wspX1][wspY1 - 1].equals(full) ||
                    poleGry[wspX2][wspY2 - 1].equals(full) ||
                    poleGry[wspX3][wspY3 - 1].equals(full) ||
                    poleGry[wspX4][wspY4 - 1].equals(full)) {
                return false;
            } else {
                return true;
            }
        } else if (wspY4 - 1 < 0 || //przypadek dla drugiej pozycji figury
                poleGry[wspX4][wspY4 - 1].equals(full)) {
            return false;
        } else {
            return true;
        }


    }

    @Override
    public void ruchLewo() {
        if (czyMoznaSieRuszycWlewo()) {
            super.ruchLewo();
        } else {
            System.out.println("Nie mozna sie ruszyc w lewo");
        }
    }

    //-----------------------------------dul-------------------------------------------
    @Override
    public boolean czyMoznaSieRuszycWDul() {
        if (pozycjaFigury == 1) {
            if (wspX4 + 1 >= poleGry.length ||
                    poleGry[wspX4 + 1][wspY4].equals(full)) {
                return false;
            } else {
                return true;
            }
        } else if (wspX4 + 1 >= poleGry.length ||
                poleGry[wspX1 + 1][wspY1].equals(full) ||
                poleGry[wspX2 + 1][wspY2].equals(full) ||
                poleGry[wspX3 + 1][wspY3].equals(full) ||
                poleGry[wspX4 + 1][wspY4].equals(full)) {
            return false;

        } else {
            return true;
        }
    }

    @Override
    public void ruchDolu() {
        if (czyMoznaSieRuszycWDul()) {
            super.ruchDolu();
        } else {
            System.out.println("Nie mozna sie ruszyc w dul");
            czyGracDalej = false;
        }
    }
    //-----------------------------------------------------------------------------------

    public boolean czyMoznaObrut() {
        if (pozycjaFigury == 1) {
            return (wspY1 + 2 < 10 && wspY4 - 1 >= 0 &&
                    poleGry[wspX1 + 2][wspY1 + 2].equals(empty) &&           // pierwszy dlugiKlocek
                    poleGry[wspX2 + 1][wspY2 + 1].equals(empty) &&
                    poleGry[wspX4 - 1][wspY4 - 1].equals(empty));
        } else {
            return (wspY4 + 1 < 10) &&
                    poleGry[wspX1 - 2][wspY1 - 2].equals(empty) &&         // pierwszy dlugiKlocek
                    poleGry[wspX2 - 1][wspY2 - 1].equals(empty) &&
                    poleGry[wspX4 + 1][wspY4 + 1].equals(empty);

        }

    }

    @Override
    public void obrut() {
        if (!czyMoznaObrut()) {
            System.out.println(" Nie mozna obrucic");
        } else {
            nanoszenieFiguryNaPole(empty);
            if (pozycjaFigury == 1) {
                wspX1 += 2;           // pierwszy dlugiKlocek
                wspY1 += 2;
                wspX2 += 1;
                wspY2 += 1;
                wspX4 -= 1;
                wspY4 -= 1;
                pozycjaFigury = 2;
            } else {
                wspX1 -= 2;           // pierwszy dlugiKlocek
                wspY1 -= 2;
                wspX2 -= 1;
                wspY2 -= 1;
                wspX4 += 1;
                wspY4 += 1;
                pozycjaFigury = 1;
            }
            nanoszenieFiguryNaPole(full);
            rysuj();
        }
    }
}
