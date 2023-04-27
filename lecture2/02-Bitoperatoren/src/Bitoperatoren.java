public class Bitoperatoren {
    public static void main(String[] args) {
        int zahl = 1;
        //eine Zahl mit einem Bitoperator verdoppeln
        System.out.println(verdoppler(zahl, 1));
        //eine Zahl mit einem Bitoperator vervierfachen
        System.out.println(verdoppler(zahl, 2));
        //Einen Integerwert von der Konsole einlesen
        System.out.println("Wie oft soll die Zahl ver n-facht werden.");
        int zahl2 = Integer.parseInt(System.console().readLine());
        System.out.println(verdoppler(zahl, zahl2));

        int zahl3 = 64;
        System.out.println(halbierer(zahl3, 1));
        //eine Zahl mit einem Bitoperator vervierfachen
        System.out.println(halbierer(zahl3, 2));
        //Einen Integerwert von der Konsole einlesen
        System.out.println("Wie oft soll die Zahl ver n-facht werden.");
        int zahl4 = Integer.parseInt(System.console().readLine());
        System.out.println(halbierer(zahl3, zahl4));

        zweiKomplement(25);

        berecheneMitKomplement(100, 94);

        // Vergleich zweier positiven ganzen Zahlen und Ausgabe an
        // welcher Stelle sich die entsprechenden Binärzahlen unterscheiden

        compareNumbers(4, 5);
    }

    public static int verdoppler(int zahl, int faktor) {
        return zahl << faktor;   
    }

    public static int halbierer(int zahl, int faktor) {
        return zahl >> faktor;
    }
    
    public static void zweiKomplement(int zahl) {
        //zahl = ~zahl;
        System.out.println(~zahl);
    }

    public static void berecheneMitKomplement(int zahl1, int zahl2) {
        System.out.println(zahl1 + ~zahl2 + 1);
    }

     public static void compareNumbers(int zahl1, int zahl2) {
        // Compare to zahl1 and zahl2 binary

        int diff = zahl1 ^ zahl2; // XOR der beiden Zahlen
        int bit = 1;
        while(diff > 0) {
            if((diff & 1) == 1) {
            System.out.println("Die Zahlen unterscheiden sich an Stelle " + bit);
            }
        diff >>= 1;
        bit++;
        }
    }
}
