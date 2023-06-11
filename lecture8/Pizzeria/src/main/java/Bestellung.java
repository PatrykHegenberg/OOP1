import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class Bestellung {
    private int bestellnummer;
    private Date bestelldatum;
    private List<Bestellposition> artikelListe;
    private Kunde kunde;
    private String lieferadresse;
    private boolean lieferung;
    private double lieferkosten;

    public Bestellung(int bestellnummer, Date bestelldatum, Kunde kunde) {
        this.bestellnummer = bestellnummer;
        this.bestelldatum = bestelldatum;
        this.kunde = kunde;
        artikelListe = new ArrayList<>();
    }
    public Bestellung(int bestellnummer, Date bestelldatum, Kunde kunde,  boolean lieferung) {
        this.bestellnummer = bestellnummer;
        this.bestelldatum = bestelldatum;
        this.kunde = kunde;
        this.lieferadresse = kunde.getAnschrift();
        this.lieferung = lieferung;
        this.lieferkosten = 0.0;
        artikelListe = new ArrayList<>();

        if (lieferung) {
            double entfernung = berechneEntfernung(lieferadresse, "Siemensstraße 10, 30173 Hannover");
            if (entfernung > 20) {
                lieferkosten = 5.0;
            } else if (entfernung > 5) {
                lieferkosten = 2.5;
            }
        }
    }

    public void artikelHinzufuegen(Bestellposition artikel) {
        artikelListe.add(artikel);
    }

    public void artikelEntfernen(Bestellposition artikel) {
        artikelListe.remove(artikel);
    }

    public Date getBestelldatum() {
        return bestelldatum;
    }

    public List<Bestellposition> getArtikelListe() {
        return artikelListe;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public String getLieferadresse() {
        return lieferadresse;
    }

    public boolean isLieferung() {
        return lieferung;
    }

    public double getLieferkosten() {
        return lieferkosten;
    }

    public double gesamtpreisBerechnen() {
        double gesamtpreis = 0.0;
        for (Bestellposition artikel : artikelListe) {
            gesamtpreis += artikel.getGesamtpreis();
        }
        return gesamtpreis;
    }

    private double berechneEntfernung(String adresse1, String adresse2) {
        double entfernung = 0.0;
        try {
            String url = "https://router.project-osrm.org/route/v1/driving/"
                    + URLEncoder.encode(adresse1, "UTF-8") + ";" + URLEncoder.encode(adresse2, "UTF-8") + "?overview=false";
            URLConnection connection = new URL(url).openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            JSONObject json = new JSONObject(builder.toString());
            if (json.getString("code").equals("Ok")) {
                JSONArray routes = json.getJSONArray("routes");
                JSONObject route = routes.getJSONObject(0);
                entfernung = route.getDouble("distance") / 1000.0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entfernung;
    }

    public void anzeigen() {
        System.out.println("Bestellnummer: " + bestellnummer);
        System.out.println("Bestelldatum: " + bestelldatum.toString());
        System.out.println("Kunde: " + kunde.getName() + " " + kunde.getVorname());
        System.out.println("Artikel:");
        for (Bestellposition artikel : artikelListe) {
            artikel.anzeigen();
        }
        System.out.println("Gesamtpreis: " + gesamtpreisBerechnen());
        if(lieferung) {
            System.out.println("Lieferkosten: " + lieferkosten);
        }
    }
}

