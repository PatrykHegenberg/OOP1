import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Bestellung {
    private Kunde kunde;
    private Date bestelldatum;
    private Lieferart lieferart;
    private Zahlungsart zahlungsart;
    private List<Bestellposition> bestellpositionen;
    private String anmerkungen;
    private double gesamtpreis;
    private String kassenbon;

    public Bestellung(Kunde kunde, Date bestelldatum, Lieferart lieferart, Zahlungsart zahlungsart) {
        this.kunde = kunde;
        this.bestelldatum = bestelldatum;
        this.lieferart = lieferart;
        this.zahlungsart = zahlungsart;
        this.bestellpositionen = new ArrayList<>();
        this.anmerkungen = "";
        this.gesamtpreis = 0.0;
        this.kassenbon = "";
    }

    public void hinzufuegenBestellposition(Bestellposition position) {
        bestellpositionen.add(position);
    }

    public void entfernenBestellposition(Bestellposition position) {
        bestellpositionen.remove(position);
    }

    public void aendernBestellposition(Bestellposition position) {
        // Implementiere Änderungen an der Bestellposition
    }

    public void ermittleGesamtpreis() {
        gesamtpreis = 0.0;
        for (Bestellposition position : bestellpositionen) {
            gesamtpreis += position.getPreis();
        }
    }

    public void erstelleKassenbon() {
        // Implementiere Erstellung des Kassenbons
    }
}

class Bestellposition {
    private int anzahl;
    private Artikel artikel;
    private String groesseDressing;
    private double preis;

    public Bestellposition(int anzahl, Artikel artikel, String groesseDressing, double preis) {
        this.anzahl = anzahl;
        this.artikel = artikel;
        this.groesseDressing = groesseDressing;
        this.preis = preis;
    }

    // Getter und Setter hier implementieren
}

class Kunde {
    private String kundennummer;
    private String name;
    private String adresse;
    private boolean istFirmenkunde;
    private String rechnungsadresse;

    public Kunde(String kundennummer, String name, String adresse, boolean istFirmenkunde, String rechnungsadresse) {
        this.kundennummer = kundennummer;
        this.name = name;
        this.adresse = adresse;
        this.istFirmenkunde = istFirmenkunde;
        this.rechnungsadresse = rechnungsadresse;
    }

    // Getter und Setter hier implementieren
}

enum Lieferart {
    LIEFERN,
    ABHOLEN
}

enum Zahlungsart {
    BAR,
    RECHNUNG
}

class Artikel {
    private String name;
    private double preis;

    public Artikel(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    // Getter und Setter hier implementieren
}

public class Main {
    public static void main(String[] args) {
        // Beispiel für die Verwendung der Klassen
        // Kunde erstellen
        Kunde kunde = new Kunde("K123", "Max Mustermann", "Musterstraße 123", false, "");

        // Bestelldatum setzen
        Date bestelldatum = new Date();

        // Bestellung erstellen
        Bestellung bestellung = new Bestellung(kunde, bestelldatum, Lieferart.LIEFERN, Zahlungsart.BAR);

        // Bestellpositionen hinzufügen
        Artikel artikel1 = new Artikel("Pizza Margherita", 5.99);
        Bestellposition position1 = new Bestellposition(2, artikel1, "groß", 11.98);
        bestellung.hinzufuegenBestellposition(position1);

        Artikel artikel2 = new Artikel("Salat Caesar", 4.99);
        Bestellposition position2 = new Bestellposition(1, artikel2, "klein", 4.99);
        bestellung.hinzufuegenBestellposition(position2);

        // Gesamtpreis ermitteln
        bestellung.ermittleGesamtpreis();

        // Kassenbon erstellen
        bestellung.erstelleKassenbon();
    }
}