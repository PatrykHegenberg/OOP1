public class Dreieck{
    private double breite;
    private double hoehe;

    public Dreieck(){
        this.breite = 0;
        this.hoehe = 0;
    }

    public Dreieck(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double getArea(){
        return (this.breite * this.hoehe) / 2;
    }

    public void to_string(){
        System.out.println("Ich bin ein rechtwinkliges Dreieck mit Breite: " + this.breite + " und Höhe: " + this.hoehe);
    }
}