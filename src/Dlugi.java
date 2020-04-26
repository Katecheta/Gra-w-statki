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

        if (wspY1 + 1 >= 10) {
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
        if (wspY4 - 1 < 0) {
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
        if (wspX4 + 1 >= 10) {
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
        }
    }
    //-----------------------------------------------------------------------------------

    public boolean czyMoznaObrut(){

        return false;
    }
    public void obrut(){
        if(pozycjaFigury == 1){
                
        }else{

        }
    }
}
