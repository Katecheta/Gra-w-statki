public class Kwadrat extends Figura {

    Kwadrat() {
        wspX1 = 0;           // drugi kwadrat
        wspY1 = 4;
        wspX2 = 1;
        wspY2 = 4;
        wspX3 = 0;
        wspY3 = 5;
        wspX4 = 1;
        wspY4 = 5;
    }

    //-------------------------------------prawo---------------------------------------
    @Override
    public boolean czyMoznaSieRuszycWPrawo() {

        if (wspY1 + 1 >= poleGry[0].length - 1 ||
                poleGry[wspX3][wspY3 + 1].equals(full) ||
                poleGry[wspX4][wspY4 + 1].equals(full)) {
            return false;
        } else {
            return true;
        }


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
        //przypadek dla pierwszej pozycji figury
        if (wspY4 - 1 <= 0 ||
                poleGry[wspX1][wspY1 - 1].equals(full) ||
                poleGry[wspX2][wspY2 - 1].equals(full)) {
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
        return true;
    }

    @Override
    public void obrut() {
        if (!czyMoznaObrut()) {
            System.out.println(" Nie mozna obrucic");
        } else {
            System.out.println("Gotowe ;P");
            rysuj();
        }
    }

}
