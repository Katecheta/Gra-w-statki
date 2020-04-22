import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MazeRunner {

    public static void main(String[] args) {
        intro();
        Maze myMap = new Maze();
        myMap.printMap();
        String move;
        while(!myMap.didIWin()) {

            boolean canIMove = false;
            move = usserMove();

            while (!canIMove) {
                switch (move) {
                    case "R":
                        canIMove = myMap.canIMoveRight();
                        System.out.println(1);
                        break;
                    case "L":
                        canIMove = myMap.canIMoveLeft();
                        System.out.println(2);
                        break;
                    case "U":
                        canIMove = myMap.canIMoveUp();
                        System.out.println(3);
                        break;
                    case "D":
                        canIMove = myMap.canIMoveDown();
                        System.out.println(4);
                        break;
                }// cheks move and sets canIMove is it posible
                if (!canIMove) {
                    System.out.println("Nie da rady. Sciana");
                    myMap.printMap();
                    move = usserMove();
                }
            }   //wywoluje ruch i sprawdza czy jest prawidłowy.
            System.out.println(move);
            switch (move) u{
                case "R":
                    myMap.moveRight();
                    break;
                case "L":
                    myMap.moveLeft();
                    break;
                case "U":
                    myMap.moveUp();
                    break;
                case "D":
                    myMap.moveDown();
                    break;


            }    //  wykonanie ruchu wczesniej zatwierdzonego jako prawidlowy
            myMap.printMap();
        }
    }

    public static void intro() {
        System.out.println("Welcome to Maze Runner !\n Hear is your current position:");
    }

    public static String usserMove() {
        System.out.print("Wher would you like to move? (R, L, U, D) \n Your move: ");
        Scanner scan = new Scanner(System.in);
        String ruch = scan.next();
        if (ruch.equals("L") || ruch.equals("R") || ruch.equals("U") || ruch.equals("D")) {
            return ruch;
        } else {
            System.out.println(" Move that you have taped is invalid. Pleas chouse one of LRUD");
            usserMove();
        }
        return ruch;
    }


}






/*
     static String[][] dodajFigure(String[][] pole1, Figura kwadrat){
         pole1[kwadrat.wspX1][kwadrat.wspY1] = "[ ]" ;
         pole1[kwadrat.wspX2][kwadrat.wspY2] = "[ ]" ;
         pole1[kwadrat.wspX3][kwadrat.wspY3] = "[ ]" ;
         return pole1;


     }

     static void rysujPole(String[][] pole1){
        String[][] pole = new String[10] [10];
         pole = pole1;
        // rysuj gorna linie
         for( int i = 0 ; i < 3*pole.length ; i++){
             System.out.print("-");
         }
         System.out.println();
         // rysuj tabele
        for(int i = 0 ; i < pole.length ; i++){
            System.out.print("|");
            for(int y = 0 ; y < pole.length; y++){
                System.out.print(pole[i][y]);
            }
            System.out.println("|");
        }
        // rysuj dolna linie
        for( int i = 0 ; i < 3 * pole.length ; i++){
            System.out.print("-");
        }
     }

     static void zapelnijTabele(String [][] pole){
         for(int i = 0 ; i < pole.length ; i++  ){
             for( int y = 0 ; y < pole.length ; y++ ) {
                 pole[i][y] = "   ";
             }
         }
     }
 //
 normalizeText("This is some \"really\" great. (Text)!?")
 . , : ; ’ ” ! ? ( )
 */
//deklaracja pola gry
// String[][] pole = new String[10][10];