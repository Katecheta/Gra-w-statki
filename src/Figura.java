public class Figura {

    int wspX1;
    int wspY1;

    int wspX2;
    int wspY2;

    int wspX3;
    int wspY3;

    int wspX4;
    int wspY4;


    Figura(int x) {
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
        }
    }  // Konstruktor figor

    public void obrutFigury() {

    }
}