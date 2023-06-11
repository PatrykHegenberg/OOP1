import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Sortiment implements Iterable<Artikel> {
    private List<Artikel> artikelListe;

    public Sortiment() {
        artikelListe = new ArrayList<>();
    }

    public void artikelHinzufuegen(Artikel artikel) {
        artikelListe.add(artikel);
    }

    public void artikelEntfernen(Artikel artikel) {
        artikelListe.remove(artikel);
    }

    public List<Artikel> getArtikelListe() {
        return artikelListe;
    }

    public int getArtikelAnzahl() {
        return artikelListe.size();
    }

    public void anzeigen() {
        System.out.println("Sortiment:");
        for (Artikel artikel : artikelListe) {
            artikel.anzeigen();
        }
    }

    @Override
    public Iterator<Artikel> iterator() {
        return artikelListe.iterator();
    }
}
