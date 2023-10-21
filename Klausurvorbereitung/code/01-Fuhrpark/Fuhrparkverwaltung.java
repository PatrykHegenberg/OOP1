public class Fuhrparkverwaltung {
    public static void main(String[] args) {
        Fahrzeug f1 = new Fahrzeug("H-XY 123", "VW", 140, 23456, true);
        Fahrzeug f2 = new Fahrzeug("H-XY 654", "Audi", 220,66722, true);
        Fahrzeug f3 = new Fahrzeug("H-XY 999", "BMW", 245, 100001, false);
        f1.getInfo();
        f2.getInfo();
        f3.getInfo();
    }
}