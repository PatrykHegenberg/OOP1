import java.lang.Math;

public class Kreis {
    private int radius;
    private double flaeche;

    public void setRadius(int r) {
        this.radius = r;
    }

    public double berechneFlaeche() {
        this.flaeche = Math.PI * Math.pow(this.radius, 2);
        return this.flaeche;
    }
}
