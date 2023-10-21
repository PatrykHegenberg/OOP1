public class Rechteck {
    private int laenge;
    private int breite;

    public Rechteck() {
        this.laenge = 0;
        this.breite = 0;
    }

    public Rechteck(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public int getLaenge() {
        return this.laenge;
    }

    public int getBreite() {
        return this.breite;
    }
    public int getArea(){
        return this.laenge * this.breite;
    }

    public void to_string() {
        System.out.println("Ich bin ein Rechteck mit der Breite: " + this.breite + " und der Länge: " + this.laenge);
    }
}