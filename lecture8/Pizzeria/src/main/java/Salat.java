public class Salat extends Artikel{
    private String art;

    public Salat(String name, double preis, String art) {
        super(name, preis);
        this.art = art;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Art: " + art);
    }
}
