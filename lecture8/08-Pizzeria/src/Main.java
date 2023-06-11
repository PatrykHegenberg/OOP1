import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Kunde {
    private static int anzahlKunden = 0;
    private int kundennummer;
    private String name;
    private String vorname;
    private String adresse;
    private String telefonnummer;
    private boolean istAktiv;

    public Kunde(String name, String vorname, String adresse, String telefonnummer) {
        this.kundennummer = ++anzahlKunden;
        this.name = name;
        this.vorname = vorname;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
        this.istAktiv = true;
    }

    public void anzeigen() {
        System.out.println("Kundennummer: " + kundennummer);
        System.out.println("Name: " + name);
        System.out.println("Vorname: " + vorname);
        System.out.println("Adresse: " + adresse);
        System.out.println("Telefonnummer: " + telefonnummer);
        System.out.println("Aktiv: " + istAktiv);
    }

    public void aendernKundendaten(String name, String vorname, String adresse, String telefonnummer) {
        this.name = name;
        this.vorname = vorname;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
    }

    public void deaktivierenKunde() {
        this.istAktiv = false;
    }

    public static int getAnzahlKunden() {
        return anzahlKunden;
    }
}

class Firmenkunde extends Kunde {
    private String firmenname;
    private String umsatzsteuerID;
    private String rechnungsanschrift;

    public Firmenkunde(String name, String vorname, String adresse, String telefonnummer, String firmenname,
            String umsatzsteuerID, String rechnungsanschrift) {
        super(name, vorname, adresse, telefonnummer);
        this.firmenname = firmenname;
        this.umsatzsteuerID = umsatzsteuerID;
        this.rechnungsanschrift = rechnungsanschrift;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Firmenname: " + firmenname);
        System.out.println("Umsatzsteuer-ID: " + umsatzsteuerID);
        System.out.println("Rechnungsanschrift: " + rechnungsanschrift);
    }

    public void rechnungsanschriftUebernehmen() {
        setRechnungsanschrift(getAdresse());
    }

    public void pruefeUmsatzsteuerID() {
        // Implementiere Prüfung der Umsatzsteuer-ID
    }

    public String getFirmenname() {
        return firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    public String getUmsatzsteuerID() {
        return umsatzsteuerID;
    }

    public void setUmsatzsteuerID(String umsatzsteuerID) {
        this.umsatzsteuerID = umsatzsteuerID;
    }

    public String getRechnungsanschrift() {
        return rechnungsanschrift;
    }

    public void setRechnungsanschrift(String rechnungsanschrift) {
        this.rechnungsanschrift = rechnungsanschrift;
    }
}

public class Kundenverwaltung {
    private List<Kunde> kundenListe;

    public Kundenverwaltung() {
        this.kundenListe = new ArrayList<>();
    }

    public void kundeHinzufuegen(Kunde kunde) {
        if (kundenListe.size() >= 1000) {
            System.out.println("Maximale Anzahl an Kunden erreicht.");
        } else {
            kundenListe.add(kunde);
        }
    }

    public int anzahlKundenErrechnen() {
        return kundenListe.size();
    }

    public void bestandskundenLaden() {
        // Hier können die Bestandskunden aus den Tabellen geladen werden
        // Beispiel:
        Kunde kunde1 = new Kunde("Adler", "Alfred", "30111 Hannover, Aegidienplatz 10", "511/11111111");
        Kunde kunde2 = new Kunde("Baier", "Berta", "30112 Hannover, Breitestraße 20", "511/22222222");
        // ...

        kundenListe.add(kunde1);
        kundenListe.add(kunde2);
        // ...
    }

    public Kunde kundeSuchen(int kundennummer) {
        for (Kunde kunde : kundenListe) {
            if (kunde.getKundennummer() == kundennummer) {
                return kunde;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Kundenverwaltung kundenverwaltung = new Kundenverwaltung();
        kundenverwaltung.bestandskundenLaden();

        // Beispiel für die Verwendung der Kundenverwaltung:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kundennummer eingeben: ");
        int kundennummer = scanner.nextInt();
        scanner.nextLine(); // Leere Zeile einlesen

        Kunde kunde = kundenverwaltung.kundeSuchen(kundennummer);

        if (kunde != null) {
            System.out.println("Kunde gefunden:");
            kunde.anzeigen();
        } else {
            System.out.println("Kunde nicht gefunden.");
        }

        scanner.close();
    }
}