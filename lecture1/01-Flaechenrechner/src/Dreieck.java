public class Dreieck {
    private int breite;
    private int hoehe;
    private int flaeche;

    public void setBreite(int b) {
        this.breite = b;
    }

    public void setHoehe(int h) {
        this.hoehe = h;
    }

    public double berechneFlaeche() {
        this.flaeche = (this.breite * this.hoehe)/2;
        return this.flaeche;
    }
}
