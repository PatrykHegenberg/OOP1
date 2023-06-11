import java.util.Iterator;

public class Bestellposition implements Iterable<Bestellposition> {
    private Artikel artikel;
    private int menge;

    public Bestellposition(Artikel artikel, int menge) {
        this.artikel = artikel;
        this.menge = menge;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public double getGesamtpreis() {
        return artikel.getPreis() * menge;
    }

    public void anzeigen() {
        artikel.anzeigen();
        System.out.println("Menge: " + menge);
        System.out.println("Gesamtpreis: " + getGesamtpreis());
    }

    @Override
    public Iterator<Bestellposition> iterator() {
        return iterator();
    }
}

