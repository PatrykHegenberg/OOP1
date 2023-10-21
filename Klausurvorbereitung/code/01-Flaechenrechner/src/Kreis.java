import java.lang.Math;

public class Kreis{
    private double radius;

    public Kreis(){
        this.radius = 0;
    }

    public Kreis(int radius){
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public void to_string(){
        System.out.println("Ich bin ein Kreis mit Radius: " + this.radius);
    }
}