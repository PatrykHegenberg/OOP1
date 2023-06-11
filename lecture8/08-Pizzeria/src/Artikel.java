import java.util.ArrayList;
import java.util.List;

abstract class Artikel {
    private String name;
    private double preis;

    public Artikel(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public void anzeigen() {
        System.out.println("Name: " + name);
        System.out.println("Preis: " + preis);
    }
}

class Pizza extends Artikel {
    private List<String> groessen;

    public Pizza(String name, double preis, List<String> groessen) {
        super(name, preis);
        this.groessen = groessen;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Größen: " + String.join(", ", groessen));
    }
}

class Salat extends Artikel {
    private List<String> groessen;
    private List<String> dressings;

    public Salat(String name, double preis, List<String> groessen, List<String> dressings) {
        super(name, preis);
        this.groessen = groessen;
        this.dressings = dressings;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Größen: " + String.join(", ", groessen));
        System.out.println("Dressings: " + String.join(", ", dressings));
    }
}

class Sortiment {
    private List<Artikel> artikel;

    public Sortiment() {
        this.artikel = new ArrayList<>();
    }

    public void sortiment_laden() {
        // Hier könnten die Daten aus einer Datei oder Datenbank geladen werden
        Pizza pizza1 = new Pizza("Margherita", 5.99, List.of("klein", "mittel", "groß", "familie"));
        Pizza pizza2 = new Pizza("Salami", 6.99, List.of("klein", "mittel", "groß"));
        Salat salat1 = new Salat("Gemischter Salat", 4.99, List.of("klein", "groß"), List.of("Joghurt-Dressing", "Balsamico-Dressing", "French-Dressing"));
        Salat salat2 = new Salat("Caesar Salad", 5.99, List.of("klein", "groß"), List.of("Caesar-Dressing"));

        artikel.add(pizza1);
        artikel.add(pizza2);
        artikel.add(salat1);
        artikel.add(salat2);
    }

    public void anzeigen(String artikelart) {
        System.out.println("--- " + artikelart + " ---");
        if (artikelart.equals("Pizza")) {
            for (Artikel artikel : artikel) {
                if (artikel instanceof Pizza) {
                    artikel.anzeigen();
                    System.out.println();
                }
            }
        } else if (artikelart.equals("Salat")) {
            for (Artikel artikel : artikel) {
                if (artikel instanceof Salat) {
                    artikel.anzeigen();
                    System.out.println();
                }
            }
        } else {
            System.out.println("Ungültige Artikelart.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Sortiment sortiment = new Sortiment();
        sortiment.sortiment_laden();
        sortiment.anzeigen("Pizza");
        sortiment.anzeigen("Salat");
    }
}