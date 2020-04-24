

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MazeRunner {

    public static void main(String[] args) {
        Character a = 'a';
        System.out.println(a);
        intro();
        int printl;
        Maze myMap = new Maze();
        myMap.printMap();
        String move;
        String czySkaczesz = "";
        int licznik = 0;
        while (!myMap.didIWin() || licznik < 100) {

            boolean canIMove = false;
            move = usserMove();


            while (!canIMove) {
                switch (move) {
                    case "R":
                        canIMove = myMap.canIMoveRight();
                        break;
                    case "L":
                        canIMove = myMap.canIMoveLeft();
                        break;
                    case "U":
                        canIMove = myMap.canIMoveUp();
                        break;
                    case "D":
                        canIMove = myMap.canIMoveDown();
                        break;
                }           // cheks move and sets canIMove is it posible
                if (!canIMove) {
                    if (myMap.isThereAPit(move)) {
                        System.out.println("Uwaga, przepasc ! Skaczesz?");
                        if (navigatePit()) {
                            myMap.jumpOverPit(move);
                        } else {
                            System.out.println("jak chcesz");
                        }
                    }
                    System.out.print("Nie da rady. ");
                    if (myMap.isThereAPit(move)) {
                        System.out.println("Przepaść !");
                    } else {
                        System.out.println("Sciana");
                    }
                    myMap.printMap();
                    move = usserMove();
                }          //wywoluje ruch i sprawdza czy jest prawidłowy.
            }

            switch (move) {
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


            }               //  wykonanie ruchu wczesniej zatwierdzonego jako prawidlowy
            myMap.printMap();
            licznik++;

        }
        if (licznik < 100) {
            System.out.println("Brawo wygrales, zrobiles to w " + licznik + "rucharch");
        } else
            System.out.println("Niestety, koniec ruchów. Przegrales");

    }

    public static void intro() {
        System.out.println("Welcome to Maze Runner !\n Hear is your current position:");
    }

    public static String usserMove() {
        String ruch = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Wher would you like to move? (R, L, U, D) \n Your move: ");
        ruch = scan.next();
            while(!ruch.equals("R") && !ruch.equals("L") && !ruch.equals("U") && !ruch.equals("D")){
                System.out.println("try again");
                ruch = scan.next();
            }

        return ruch;
    }

    public static void movesMessage(int licznik) {
        switch (licznik) {
            case 50:
                System.out.println("zostało jeszcze 50 ruchów");
            case 75:
                System.out.println("zostało jeszcze 25 ruchów");
            case 90:
                System.out.println("zostało jeszcze 10 ruchów");
            case 100:
                System.out.println("Koniec !");
        }
    }

    public static boolean navigatePit() {
        String czySkaczesz = "";
        Scanner scan = new Scanner(System.in);
        czySkaczesz = scan.next();
        if (czySkaczesz.substring(0, 1).equals("Y")) {
            return true;
        } else
            return false;


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