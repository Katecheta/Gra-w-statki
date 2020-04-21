import java.lang.reflect.Array;
import java.util.Arrays;

public class MazeRunner {

    public static void main(String[] args) {
        intro();
        Maze myMap = new Maze();
        myMap.printMap();
    }

    public static void intro() {
        System.out.println("Welcome to Maze Runner !\n Hear is your current position:");
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