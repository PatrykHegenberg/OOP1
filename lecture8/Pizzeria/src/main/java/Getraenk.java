public class Getraenk extends Artikel{
    private String groesse;

    public Getraenk(String name, double preis, String groesse) {
        super(name, preis);
        this.groesse = groesse;
    }

    public String getGroesse() {
        return groesse;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    @Override
    public void anzeigen() {
        System.out.println(getName() + " (" + groesse + "): " + getPreis() + " Euro");
    }
}
