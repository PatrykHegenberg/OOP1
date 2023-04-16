public class flaechenrechner {
    public static void main(String[] args) {
        Rechteck rechteck1, rechteck2;
        Kreis kreis1;
        Dreieck dreieck1;
        int f;
        double F;
        rechteck1 = new Rechteck();
        rechteck1.setBreite(4);
        rechteck1.setLaenge(5);
        f = rechteck1.berechneFlaeche();
        System.out.println("Das erste Rechteck hat die Flaeche: " + f );
        rechteck2 = new Rechteck();
        rechteck2.setBreite(3);
        rechteck2.setLaenge(6);
        f = rechteck2.berechneFlaeche();
        System.out.println("Das zweite Rechteck hat die Flaeche: " + f );
        
        kreis1 = new Kreis();
        kreis1.setRadius(4);
        F = kreis1.berechneFlaeche();
        System.out.println("Der Kreis hat die Flaeche: " + F );

        dreieck1 = new Dreieck();
        dreieck1.setBreite(5);
        dreieck1.setHoehe(4);
        F = dreieck1.berechneFlaeche();
        System.out.println("Das Dreieck hat die Flaeche: " + F );
    }
}