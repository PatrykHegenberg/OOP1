public class Fuhrparkverwaltung {
    public static void main(String[] args) {
        Fahrzeug fahrzeug1, fahrzeug2, fahrzeug3;
        fahrzeug1 = new Fahrzeug("H-XY 123", "VW", 140, 23456, true);
        fahrzeug2 = new Fahrzeug("H-XY 654", "Audi", 220, 66222, true);
        fahrzeug3 = new Fahrzeug("H-XY 999", "BMX", 245, 100001, false);

        fahrzeug1.printStatus();
        fahrzeug2.printStatus();
        fahrzeug3.printStatus();
    }
}