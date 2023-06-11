import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Kundenkartei kundenkartei = new Kundenkartei();
    private static Sortiment sortiment = new Sortiment();
    private static List<Bestellung> bestellungen = new ArrayList<>();
    private static int bestellnummer = 1;

    public static void main(String[] args) {
        // Die Bestandskunden hinzufügen:
        kundenkartei
                .kundeAnlegen(new Kunde(1001, "Adler", "Alfred", "0511/11111111", "30111 Hannover, Aegidienplatz 1"));
        kundenkartei.kundeAnlegen(new Kunde(1002, "Baier", "Berta", "0511/22222222", "30112 Hannover, Breitestraße 2"));
        kundenkartei.kundeAnlegen(
                new Kunde(1003, "Baier", "Bertram", "0511/33333333", "30113 Hannover, Braunschweiger Straße 3"));
        kundenkartei.kundeAnlegen(
                new Kunde(1004, "Christensen", "Clayton", "0511/44444444", "30111 Hannover, Charlottenweg 4"));
        kundenkartei.kundeAnlegen(new Kunde(1005, "Demirkan", "", "0511/55555555", "30112 Hannover, Deisterweg 5"));
        kundenkartei.firmenkundeAnlegen(new Firmenkunde(1006, "Eckl", "Alfons", "0511/66666666", "Eckl Steuerberatung",
                "DE123456789", "30111 Hannover, Essener Str. 6"));
        kundenkartei.firmenkundeAnlegen(new Firmenkunde(1007, "", "", "0511/77777777", "Fritz Fertigbau",
                "DE01234567830112", "Hannover, Frankfurter Allee 7"));

        // Dem Sortiment Artikel hinzufügen
        sortiment.artikelHinzufuegen(new Pizza("Pizza Margherita", 3.20, "S"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Margherita", 5.40, "M"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Margherita", 6.40, "Calzone"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Margherita", 16.00, "XL"));

        sortiment.artikelHinzufuegen(new Pizza("Pizza Salame", 3.90, "S"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Salame", 6.40, "M"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Salame", 7.40, "Calzone"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Salame", 19.00, "XL"));

        sortiment.artikelHinzufuegen(new Pizza("Pizza Casa", 3.90, "S"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Casa", 6.40, "M"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Casa", 7.40, "Calzone"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Casa", 18.00, "XL"));

        sortiment.artikelHinzufuegen(new Pizza("Pizza Hawai", 4.30, "S"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Hawai", 7.40, "M"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Hawai", 8.40, "Calzone"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Hawai", 22.00, "XL"));

        sortiment.artikelHinzufuegen(new Pizza("Pizza Tonno", 4.30, "S"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Tonno", 7.40, "M"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Tonno", 8.40, "Calzone"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Tonno", 22.00, "XL"));

        sortiment.artikelHinzufuegen(new Pizza("Pizza Bomba", 4.30, "S"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Bomba", 7.40, "M"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Bomba", 8.40, "Calzone"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Bomba", 22.00, "XL"));

        sortiment.artikelHinzufuegen(new Pizza("Pizza 4 Formaggi", 4.30, "S"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza 4 Formaggi", 7.40, "M"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza 4 Formaggi", 8.40, "Calzone"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza 4 Formaggi", 22.00, "XL"));

        sortiment.artikelHinzufuegen(new Pizza("Pizza 4 Stagioni", 4.30, "S"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza 4 Stagioni", 7.40, "M"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza 4 Stagioni", 8.40, "Calzone"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza 4 Stagioni", 22.00, "XL"));

        sortiment.artikelHinzufuegen(new Pizza("Pizza Torino", 4.30, "S"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Torino", 7.40, "M"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Torino", 8.40, "Calzone"));
        sortiment.artikelHinzufuegen(new Pizza("Pizza Torino", 22.00, "XL"));

        sortiment.artikelHinzufuegen(new Salat("Salat kleier Beilagensalat", 1.90, "klein"));
        sortiment.artikelHinzufuegen(new Salat("Salat Chefsalat", 4.20, "klein"));
        sortiment.artikelHinzufuegen(new Salat("Salat Chefsalat", 6.90, "groß"));
        sortiment.artikelHinzufuegen(new Salat("Chefsalat", 4.20, "klein"));
        sortiment.artikelHinzufuegen(new Salat("Chefsalat", 6.90, "groß"));
        sortiment.artikelHinzufuegen(new Salat("Lavinia Salat", 4.20, "klein"));
        sortiment.artikelHinzufuegen(new Salat("Lavinia Salat", 6.90, "groß"));
        sortiment.artikelHinzufuegen(new Salat("Putensalat", 4.20, "klein"));
        sortiment.artikelHinzufuegen(new Salat("Putensalat", 6.20, "groß"));
        sortiment.artikelHinzufuegen(new Salat("Haussalat Eisbergsalat", 4.20, "klein"));
        sortiment.artikelHinzufuegen(new Salat("Haussalat Eisbergsalat", 6.20, "groß"));
        sortiment.artikelHinzufuegen(new Salat("Vitaminsalat", 4.20, "klein"));
        sortiment.artikelHinzufuegen(new Salat("Vitaminsalat", 6.20, "groß"));
        sortiment.artikelHinzufuegen(new Salat("Tomatensalat", 4.20, "klein"));
        sortiment.artikelHinzufuegen(new Salat("Tomatensalat", 6.20, "groß"));
        sortiment.artikelHinzufuegen(new Salat("Gurkensalat", 4.20, "klein"));
        sortiment.artikelHinzufuegen(new Salat("Gurkensalat", 6.20, "groß"));

        while (true) {
            System.out.println("Willkommen bei der Pizzeria!");
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1 - Kundenkartei");
            System.out.println("2 - Sortiment");
            System.out.println("3 - Bestellung aufgeben");
            System.out.println("4 - Bestellungen anzeigen");
            System.out.println("5 - Wochenbericht anzeigen");
            System.out.println("0 - Beenden");

            int auswahl = scanner.nextInt();
            scanner.nextLine(); // Clear Scanner buffer

            switch (auswahl) {
                case 0:
                    System.out.println("Auf Wiedersehen!");
                    System.exit(0);
                case 1:
                    kundenkarteiMenue();
                    break;
                case 2:
                    sortimentMenue();
                    break;
                case 3:
                    bestellungAufgeben();
                    break;
                case 4:
                    bestellungenAnzeigen();
                    break;
                case 5:
                    wochenberichtAnzeigen();
                default:
                    System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
                    break;
            }
        }
    }
    private static void wochenberichtAnzeigen() {
        System.out.println("Wochenbericht:");
        System.out.println("Für welche Woche soll der Bericht angezeigt werden? ");
        int woche = scanner.nextInt();
        System.out.println("In welchem Jahr? ");
        int jahr = scanner.nextInt();
        Wochenbericht wochenbericht = new Wochenbericht(woche, jahr, bestellungen);
        wochenbericht.anzeigen();
    }

    private static void kundenkarteiMenue() {
        while (true) {
            System.out.println("Kundenkartei");
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1 - Kunde anlegen");
            System.out.println("2 - Kundendaten ändern");
            System.out.println("3 - Kunde deaktivieren");
            System.out.println("4 - Firmenkunde anlegen");
            System.out.println("5 - Kundenkartei anzeigen");
            System.out.println("0 - Zurück");

            int auswahl = scanner.nextInt();
            scanner.nextLine(); // Clear Scanner buffer

            switch (auswahl) {
                case 0:
                    return;
                case 1:
                    kundeAnlegen();
                    break;
                case 2:
                    kundendatenAendern();
                    break;
                case 3:
                    kundeDeaktivieren();
                    break;
                case 4:
                    firmenkundeAnlegen();
                    break;
                case 5:
                    kundenkarteiAnzeigen();
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
                    break;
            }
        }
    }

    private static void sortimentMenue() {
        while (true) {
            System.out.println("Sortiment");
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1 - Artikel hinzufügen");
            System.out.println("2 - Artikel entfernen");
            System.out.println("3 - Sortiment anzeigen");
            System.out.println("0 - Zurück");

            int auswahl = scanner.nextInt();
            scanner.nextLine(); // Clear Scanner buffer

            switch (auswahl) {
                case 0:
                    return;
                case 1:
                    artikelHinzufuegen();
                    break;
                case 2:
                    artikelEntfernen();
                    break;
                case 3:
                    sortimentAnzeigen();
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
                    break;
            }
        }
    }

    private static void bestellungAufgeben() {
        boolean lieferung = false;
        System.out.println("Bestellung liefern (j/n)");
        String eingabe = scanner.nextLine();

        System.out.println("Bitte wählen Sie einen Kunden aus der Kundenkartei:");
        Kunde kunde = kundenkarteiKundeAuswaehlen();
        if (kunde == null) {
            return;
        }
        if (eingabe.equals("j")) {
           lieferung = true;
        }
        Bestellung bestellung = new Bestellung(bestellnummer++, new Date(), kunde, lieferung);

        while (true) {
            System.out.println("Bitte wählen Sie einen Artikel aus dem Sortiment:");
            Artikel artikel = sortimentArtikelAuswaehlen();
            if (artikel == null) {
                break;
            }

            System.out.println("Bitte geben Sie die Menge ein:");
            int menge = scanner.nextInt();
            scanner.nextLine(); // Clear Scanner buffer

            Bestellposition bestellposition = new Bestellposition(artikel, menge);
            bestellung.artikelHinzufuegen(bestellposition);

            System.out.println("Artikel wurde zur Bestellung hinzugefügt.");
            System.out.println("Möchten Sie weitere Artikel hinzufügen? (j/n)");
            String antwort = scanner.nextLine();
            if (!antwort.equalsIgnoreCase("j")) {
                break;
            }
        }

        bestellungen.add(bestellung);
        System.out.println("Bestellung wurde aufgegeben:");
        bestellung.anzeigen();
    }

    private static void bestellungenAnzeigen() {
        if (bestellungen.isEmpty()) {
            System.out.println("Es sind keine Bestellungen vorhanden.");
            return;
        }

        System.out.println("Bestellungen:");
        for (Bestellung bestellung : bestellungen) {
            bestellung.anzeigen();
        }
    }

    private static void kundeAnlegen() {
        System.out.println("Bitte geben Sie den Vornamen des Kunden ein:");
        String vorname = scanner.nextLine();

        System.out.println("Bitte geben Sie den Nachnamen des Kunden ein:");
        String nachname = scanner.nextLine();

        System.out.println("Bitte geben Sie die Adresse des Kunden ein:");
        String adresse = scanner.nextLine();

        System.out.println("Bitte geben Sie die Telefonnummer des Kunden ein:");
        String telefonnummer = scanner.nextLine();

        Kunde kunde = new Kunde(kundenkartei.getKundenanzahl() + 1001, nachname, vorname, telefonnummer, adresse);
        kundenkartei.kundeAnlegen(kunde);
        System.out.println("Kunde wurde angelegt:");
        System.out.println(kunde.toString());
    }

    private static void kundendatenAendern() {
        System.out.println("Bitte wählen Sie einen Kunden aus der Kundenkartei:");
        Kunde kunde = kundenkarteiKundeAuswaehlen();
        if (kunde == null) {
            return;
        }

        System.out.println("Bitte geben Sie den neuen Vornamen ein (oder 'x' zum Überspringen):");
        String vorname = scanner.nextLine();
        if (!vorname.equalsIgnoreCase("x")) {
            kunde.setVorname(vorname);
        }

        System.out.println("Bitte geben Sie den neuen Nachnamen ein (oder 'x' zum Überspringen):");
        String nachname = scanner.nextLine();
        if (!nachname.equalsIgnoreCase("x")) {
            kunde.setName(nachname);
        }

        System.out.println("Bitte geben Sie die neue Adresse ein (oder 'x' zum Überspringen):");
        String adresse = scanner.nextLine();
        if (!adresse.equalsIgnoreCase("x")) {
            kunde.setAnschrift(adresse);
        }

        System.out.println("Bitte geben Sie die neue Telefonnummer ein (oder 'x' zum Überspringen):");
        String telefonnummer = scanner.nextLine();
        if (!telefonnummer.equalsIgnoreCase("x")) {
            kunde.setTelefonnummer(telefonnummer);
        }

        System.out.println("Kundendaten wurden geändert:");
        kunde.toString();
    }

    private static void kundeDeaktivieren() {
        System.out.println("Bitte wählen Sie einen Kunden aus der Kundenkartei:");
        Kunde kunde = kundenkarteiKundeAuswaehlen();
        if (kunde == null) {
            return;
        }

        kunde.setAktiv(false);
        System.out.println("Kunde wurde deaktiviert:");
        kunde.toString();
    }

    private static void firmenkundeAnlegen() {
        System.out.println("Bitte geben Sie den Firmennamen ein:");
        String firmenname = scanner.nextLine();

        System.out.println("Bitte geben Sie den Ansprechpartner ein:");
        String ansprechpartner = scanner.nextLine();

        System.out.println("Bitte geben Sie die Adresse ein:");
        String adresse = scanner.nextLine();

        System.out.println("Bitte geben Sie die Telefonnummer ein:");
        String telefonnummer = scanner.nextLine();

        Firmenkunde firmenkunde = new Firmenkunde(kundenkartei.getKundenanzahl() + 1000, null, null, firmenname,
                ansprechpartner, adresse, telefonnummer);
        kundenkartei.firmenkundeAnlegen(firmenkunde);
        System.out.println("Firmenkunde wurde angelegt:");
        firmenkunde.toString();
    }

    private static void kundenkarteiAnzeigen() {
        if (kundenkartei.getKundenanzahl() == 0) {
            System.out.println("Es sind keine Kunden vorhanden.");
            return;
        }

        System.out.println("Kundenkartei:");
        for (Kunde kunde : kundenkartei) {
            System.out.println(kunde.toString());
        }
    }

    private static void artikelHinzufuegen() {
        System.out.println("Bitte geben Sie den Namen des Artikels ein:");
        String name = scanner.nextLine();

        System.out.println("Bitte geben Sie den Preis des Artikels ein:");
        double preis = scanner.nextDouble();
        scanner.nextLine(); // Clear Scanner buffer

        Artikel artikel = new Artikel(name, preis);
        sortiment.artikelHinzufuegen(artikel);
        System.out.println("Artikel wurde hinzugefügt:");
        artikel.anzeigen();
    }

    private static void artikelEntfernen() {
        System.out.println("Bitte wählen Sie einen Artikel aus dem Sortiment:");
        Artikel artikel = sortimentArtikelAuswaehlen();
        if (artikel == null) {
            return;
        }

        sortiment.artikelEntfernen(artikel);
        System.out.println("Artikel wurde entfernt.");
    }

    private static void sortimentAnzeigen() {
        sortiment.anzeigen();
    }

    private static Kunde kundenkarteiKundeAuswaehlen() {
        if (kundenkartei.getKundenanzahl() == 0) {
            System.out.println("Es sind keine Kunden vorhanden.");
            return null;
        }

        System.out.println("Bitte geben Sie den Nachnamen des Kunden ein:");
        String nachname = scanner.nextLine();

        List<Kunde> passendeKunden = new ArrayList<>();
        for (Kunde kunde : kundenkartei) {
            if (kunde.getName().equalsIgnoreCase(nachname) && kunde.isAktiv()) {
                passendeKunden.add(kunde);
            }
        }

        if (passendeKunden.isEmpty()) {
            System.out.println("Kein passender Kunde gefunden.");
            return null;
        }

        if (passendeKunden.size() == 1) {
            return passendeKunden.get(0);
        }

        System.out.println("Mehrere passende Kunden gefunden. Bitte wählen Sie einen aus:");
        for (int i = 0; i < passendeKunden.size(); i++) {
            System.out.printf("%d - %s%n", i + 1, passendeKunden.get(i).toString());
        }

        int auswahl = scanner.nextInt();
        scanner.nextLine(); // Clear Scanner buffer
        return passendeKunden.get(auswahl - 1);
    }

    private static Artikel sortimentArtikelAuswaehlen() {
        if (sortiment.getArtikelAnzahl() == 0) {
            System.out.println("Das Sortiment ist leer.");
            return null;
        }

        System.out.println("Bitte geben Sie den Namen des Artikels ein:");
        String name = scanner.nextLine();

        List<Artikel> passendeArtikel = new ArrayList<>();
        for (Artikel artikel : sortiment) {
            if (artikel.getName().equalsIgnoreCase(name)) {
                passendeArtikel.add(artikel);
            }
        }

        if (passendeArtikel.isEmpty()) {
            System.out.println("Kein passender Artikel gefunden.");
            return null;
        }

        if (passendeArtikel.size() == 1) {
            return passendeArtikel.get(0);
        }

        System.out.println("Mehrere passende Artikel gefunden. Bitte wählen Sie einen aus:");
        for (int i = 0; i < passendeArtikel.size(); i++) {
            System.out.printf("%d - %s%n", i + 1, passendeArtikel.get(i).getName());
        }

        int auswahl = scanner.nextInt();
        scanner.nextLine(); // Clear Scanner buffer
        return passendeArtikel.get(auswahl - 1);
    }
}