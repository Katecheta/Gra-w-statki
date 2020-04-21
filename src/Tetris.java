import java.lang.reflect.Array;
import java.util.Arrays;

public class Tetris {


    public static void main(String[] args) {
        //deklaracja pola gry
        // String[][] pole = new String[10][10];
        String tekst = "This is some \\\"really\\\" great. (Text)!?";
        tekst = edytorTekstu(tekst);

        System.out.println(koder(tekst));

        groupif("Witajwmojejbajceslonzagranfujarce", 4);
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
    // EDYTOR TEKST 65 -90
    static String edytorTekstu(String text) {

        text = text
                .toUpperCase()
                .replace('\"', ' ')
                .replace('\\', ' ')
                .replace('(', ' ')
                .replace(';', ' ')
                .replace(',', ' ')
                .replace(':', ' ')
                .replace('\'', ' ')
                .replace('!', ' ')
                .replace('?', ' ')
                .replace(')', ' ')
                .replace(',', ' ')
                .replace('.', ' ')
                .replaceAll(" ", "");

        return text;
    }
    // kodderoos

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for (; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if (result.length() < 26) {
            for (currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public static String koder(String doZakodowania) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] tab1 = doZakodowania.toCharArray();
        System.out.println(doZakodowania);
        char[] tab2 = shiftAlphabet(10).toCharArray();
        char[] tab3 = alfabet.toCharArray();
        String wynik2 = "";

        for (int i = 0; i < tab1.length; i++) {
            for (int y = 0; y < tab2.length; y++) {
                if (tab1[i] == tab3[y]) {
                    wynik2 = wynik2 + tab2[y];

                }
            }
        }
        return wynik2;
    }

    public static String groupif(String tekst, int dlugoscGrupy) {
        System.out.println(tekst.length() % dlugoscGrupy);
        String nowy = "";
        try {
            for (int i = 0; i < tekst.length(); i += dlugoscGrupy) {
                nowy = nowy + tekst.substring(i, i + dlugoscGrupy) + " ";
            }
        } catch (IndexOutOfBoundsException e) {
        }
        System.out.println();
        if (tekst.length() % dlugoscGrupy != 0) {
            //dodanie zalegych liter ktore nie miescily sie w zasiegu
            nowy = nowy + tekst.substring(tekst.length() - (tekst.length() % dlugoscGrupy));
            //uzupelnienie xsami pozostalych miejsc
            for ( int y = 1 ; y < (dlugoscGrupy - (tekst.length() % dlugoscGrupy)); y++){
                nowy = nowy + "x";
            }
        }

        return nowy;
    }

}
