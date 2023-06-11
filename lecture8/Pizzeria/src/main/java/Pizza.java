public class Pizza extends Artikel{
    private String groesse;

    public Pizza(String name, double preis, String groessen) {
        super(name, preis);
        this.groesse = groessen;
    }

    public String getGroessen() {
        return groesse;
    }

    public void setGroessen(String groessen) {
        this.groesse = groessen;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Größe: " + this.groesse);
    }
}
