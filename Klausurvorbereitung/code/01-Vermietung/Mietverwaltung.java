public class Mietverwaltung {
    public static void main(String[] args) {
        Ferienhaus h1 = new Ferienhaus("Oskar", 3, 2, 75.50, false);
        Ferienhaus h2 = new Ferienhaus("Gustaf", 5, 4, 150.00, true);
        Ferienappartment a1 = new Ferienappartment("Detlef", 2, 50.00, true);

        h1.getInfo();
        h2.getInfo();
        a1.getInfo();
        h1.mieten();
        h2.mieten();
    }
}