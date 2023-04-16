public class Mietverwaltung {
    public static void main(String[] args) {
        Ferienhaus haus1, haus2;
        Ferienappartment ap1, ap2;

        haus1 = new Ferienhaus("Erstes", 3, 1, 4, 1, 45.55, false);
        haus2 = new Ferienhaus("Zweites", 5, 2, 7, 2, 245.99, true);

        haus1.printInfo();
        haus2.printInfo();

        ap1 = new Ferienappartment("A1", 3, 4, 59.99, false);
        ap2 = new Ferienappartment("A2", 5, 9, 100.00, true);

        ap1.printStatus();
        ap2.printStatus();
    }
}