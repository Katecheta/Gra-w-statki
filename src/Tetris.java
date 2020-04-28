
public class Tetris {

    public static void main(String[] args) {
        //----------------------------podstawowy objekt klocka----------------------------------------------------
        Figura klocek = new Figura();
        //----------------------------losujemy klocek ------------------------------------------------------------
        for (int i = 0; i < 4; i++) {
            switch ((int) Math.round(Math.random() * 1)) {
                case 1:
                    klocek = new Dlugi();
                    break;
                case 2:
                    klocek = new Kwadrat();
                    break;
            }
            klocek.nanoszenieFiguryNaPole(Figura.full);
            klocek.rysuj();

            while (Figura.czyGracDalej) {
                klocek.ruchDolu();
            }
        }
    }
}




