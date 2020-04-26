public class Kwadrat extends Figura {

Kwadrat(){
    wspX1 = 0;           // drugi kwadrat
    wspY1 = 4;
    wspX2 = 1;
    wspY2 = 4;
    wspX3 = 0;
    wspY3 = 5;
    wspX4 = 1;
    wspY4 = 5;
}
    public void obrut() {
        nanoszenieFiguryNaPole(empty);
        nanoszenieFiguryNaPole(full);
    }
}
