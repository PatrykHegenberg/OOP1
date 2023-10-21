public class Rechteck {
    private int laenge;
    private int breite;
    private int flaeche;

    public Rechteck(int laenge, int breite){
        this.laenge = laenge;
        this.breite = breite;
    }
    public void setLaenge(int l){
        this.laenge = l;
    }

    public void setBreite(int b) {
        this.breite = b;
    }

    public int berechneFlaeche() {
        this.flaeche = this.laenge * this.breite;
        return this.flaeche;
    }
}
