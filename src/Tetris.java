
public class Tetris {


    String[][] poleGry = new String[10][10]; // tablica pola gry

    public static void main(String[] args) {
        //---------------------------------------Poczatek---------------------------------------------------------------------------
        Tetris RysujPoleGry = new Tetris();// stworzenie objektu RysujPole gry classy tetris zeby nie uzywac static w funkcji rysuj
        RysujPoleGry.pierwszeWypelnienie();
        RysujPoleGry.rysuj();// rysowanie pola gry

        //-------------------------------------------------------------------------------------------------------------------------

        Figura dlugiKlocek = new Figura(1);
    }


    private void rysuj() {

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
    private  void pierwszeWypelnienie(){
        for(int wiersz = 0 ; wiersz < poleGry.length ; wiersz++){
            for(int kolumna = 0 ; kolumna < poleGry.length ; kolumna++ ){
                poleGry[wiersz][kolumna] = "    ";
            }
        }
    } // pierwsze wypelnienie tablicyna pusto.

}