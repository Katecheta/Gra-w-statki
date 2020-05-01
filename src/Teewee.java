public class Teewee extends Figura {
    Teewee() {
        wspX1 = 0;
        wspY1 = 4;
        wspX2 = 1;
        wspY2 = 4;
        wspX3 = 1;
        wspY3 = 3;
        wspX4 = 1;
        wspY4 = 5;
    }

    //-------------------------------------prawo---------------------------------------
    @Override
    public boolean czyMoznaSieRuszycWPrawo() {
       switch (pozycjaFigury){
        case 1:
        return (wspY4 + 1 < poleGry[0].length &&
                poleGry[wspX1][wspY1 + 1].equals(empty) &&
                poleGry[wspX4][wspY4 + 1].equals(empty));
        case 2:
        return (wspY1 + 1 < poleGry[0].length &&
                poleGry[wspX1][wspY1 + 1].equals(empty) &&
                poleGry[wspX3][wspY3 + 1].equals(empty) &&
                poleGry[wspX4][wspY4 + 1].equals(empty));
        case 3:
        return (wspY2 + 1 < poleGry[0].length &&
                poleGry[wspX1][wspY1 + 1].equals(empty) &&
                poleGry[wspX4][wspY4 + 1].equals(empty));
        case 4:
        return (wspY1 + 1 < poleGry[0].length &&
                poleGry[wspX2][wspY2 + 1].equals(empty) &&
                poleGry[wspX3][wspY3 + 1].equals(empty) &&
                poleGry[wspX4][wspY4 + 1].equals(empty));
    }
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

        switch (pozycjaFigury) {
            case 1:
                return (wspY3 - 1 >= 0 &&
                        poleGry[wspX1][wspY1 - 1].equals(empty) &&
                        poleGry[wspX3][wspY3 - 1].equals(empty));
            case 2:
                return (wspY4 - 1 >= 0 &&
                        poleGry[wspX2][wspY2 - 1].equals(empty) &&
                        poleGry[wspX3][wspY3 - 1].equals(empty) &&
                        poleGry[wspX4][wspY4 - 1].equals(empty));
            case 3:
                return (wspY4 - 1 >= 0 &&
                        poleGry[wspX1][wspY1 - 1].equals(empty) &&
                        poleGry[wspX4][wspY4 - 1].equals(empty));
            case 4:
                return (wspY1 - 1 >= 0 &&
                        poleGry[wspX1][wspY1 - 1].equals(empty) &&
                        poleGry[wspX3][wspY3 - 1].equals(empty) &&
                        poleGry[wspX4][wspY4 - 1].equals(empty));
        }
        return true;

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
        switch (pozycjaFigury) {
            case 1:
                return (wspX2 + 1 < poleGry.length &&
                        poleGry[wspX2 + 1][wspY2].equals(empty) &&
                        poleGry[wspX3 + 1][wspY3].equals(empty) &&
                        poleGry[wspX4 + 1][wspY4].equals(empty));
            case 2:
                return (wspX4 + 1 < poleGry.length &&
                        poleGry[wspX1 + 1][wspY1].equals(empty) &&
                        poleGry[wspX4 + 1][wspY4].equals(empty));
            case 3:
                return (wspX1 + 1 < poleGry.length &&
                        poleGry[wspX1 + 1][wspY1].equals(empty) &&
                        poleGry[wspX3 + 1][wspY3].equals(empty) &&
                        poleGry[wspX4 + 1][wspY4].equals(empty));
            case 4:
                return (wspX2 + 1 < poleGry.length &&
                        poleGry[wspX1 + 1][wspY1].equals(empty) &&
                        poleGry[wspX3 + 1][wspY3].equals(empty));
        }
        return true;

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
        switch (pozycjaFigury) {
            case 1:
                return (wspX2 + 1 < poleGry[0].length - 1 && poleGry[wspX2 + 1][wspY2].equals(empty));
            case 2:
                return (wspY2 - 1 >= 0 && poleGry[wspX2][wspY2 - 1].equals(empty));
            case 3:
                return (wspX2 - 1 >= 0 && poleGry[wspX2 - 1][wspY2].equals(empty));
            case 4:
                return (wspY2 + 1 >= 0 && poleGry[wspX2][wspY2 + 1].equals(empty));
        }
        return true;


    }

    @Override
    public void obrut() {
        if (!czyMoznaObrut()) {
            System.out.println(" Nie mozna obrucic");
        } else {
            nanoszenieFiguryNaPole(empty);
            switch (pozycjaFigury) {
                case 1:
                    wspX1 += 1;
                    wspY1 += 1;
                    wspX3 -= 1;
                    wspY3 += 1;
                    wspX4 += 1;
                    wspY4 -= 1;
                    pozycjaFigury = 2;
                    break;
                case 2:
                    wspX1 += 1;
                    wspY1 -= 1;
                    wspX3 += 1;
                    wspY3 += 1;
                    wspX4 -= 1;
                    wspY4 -= 1;
                    pozycjaFigury = 3;
                    break;
                case 3:
                    wspX1 -= 1;
                    wspY1 -= 1;
                    wspX3 += 1;
                    wspY3 -= 1;
                    wspX4 -= 1;
                    wspY4 += 1;
                    pozycjaFigury = 4;
                    break;
                case 4:
                    wspX1 -= 1;
                    wspY1 += 1;
                    wspX3 -= 1;
                    wspY3 -= 1;
                    wspX4 += 1;
                    wspY4 += 1;
                    pozycjaFigury = 1;
                    break;
            }
            nanoszenieFiguryNaPole(full);
            rysuj();
        }
    }
}


