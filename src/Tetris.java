import java.util.Scanner;

public class Tetris {

    public static void main(String[] args) {
        //----------------------------podstawowy objekt klocka----------------------------------------------------
        Figura klocek = new Figura();
        Figura.zerowanie();
        Scanner scan = new Scanner(System.in);
        String ruch;
        //----------------------------losujemy klocek ------------------------------------------------------------
        while (!Figura.poleGry[0][4].equals(Figura.full)) {
            int licznik = 0;
            while (licznik == 0) {
                licznik = (int) Math.round((Math.random() * 3));
            }

            switch (licznik) {
                case 2:
                    klocek = new Dlugi();
                    break;
                case 3:
                    klocek = new Kwadrat();
                    break;
                case 1:
                    klocek = new  Teewee();
            }
            //----------------------------------------------------------------------------------------------
            Figura.czyGracDalej = true;
            klocek.nanoszenieFiguryNaPole(Figura.full);
            klocek.ruchDolu();
            //-----------------------------faza pojedynczego klocka---------------------------------------
            while (Figura.czyGracDalej) {
                ruch = scan.nextLine();
                switch (ruch) {
                    case "R":
                        klocek.ruchPrawo();
                        break;
                    case "L":
                        klocek.ruchLewo();
                        break;
                    case "D":
                        klocek.ruchDolu();
                        break;
                    case "O":
                        klocek.obrut();
                        break;
                    default:
                        System.out.println("Zla komenda ");
                        System.out.println("wpisz R dla ruchu w prawo");
                        System.out.println("wpisz L dla ruchu w lewo");
                        System.out.println("wpisz D dla ruchu w dul");
                        System.out.println("wpisz Os dla obrotu figury");
                }
            }
            //-------------------------------sprawdzamy czy jest cos do kasowania---------------------------------------
            sprawdzCzyKasowac();
        }
    }


    public static void sprawdzCzyKasowac() {
        for (int rzad = 0; rzad <= Figura.poleGry.length -1; rzad++) {
            int licznik = 0;
            for (int kolumna = 0; kolumna <= Figura.poleGry[0].length - 1; kolumna++) {
                if (Figura.poleGry[rzad][kolumna].equals(Figura.full)) {
                    licznik++;
                }
                if (licznik >= 10) {
                    kasuj(rzad);
                    System.out.println("kasuj rzad" + rzad);
                }
            }
        }
    }

    public static void kasuj(int rzad) {
        for (; rzad >= 0; rzad--) {
            for (int kolumna = 0; kolumna <= Figura.poleGry.length - 1; kolumna++) {
                if (rzad == 0) {
                    Figura.poleGry[rzad][kolumna] = Figura.empty;
                } else {
                    Figura.poleGry[rzad][kolumna] = Figura.poleGry[rzad - 1][kolumna];
                }
            }

        }

    }

}



