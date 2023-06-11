import java.util.*;

public class Wochenbericht {
    private int kalenderwoche;
    private int jahr;
    private List<Bestellung> bestellungen;

    public Wochenbericht(int kalenderwoche, int jahr, List<Bestellung> bestellungen) {
        this.kalenderwoche = kalenderwoche;
        this.jahr = jahr;
        this.bestellungen = bestellungen;
    }

    public void anzeigen() {
        System.out.println("Wochenbericht für KW " + kalenderwoche + "/" + jahr);
        System.out.println("Anzahl der Bestellungen: " + bestellungen.size());
        System.out.println("Gesamtumsatz: " + ermittleGesamtumsatz() + " Euro");
        System.out.println("Umsatz pro Wochentag:");
        Map<String, Double> umsatzProTag = ermittleUmsatzProWochentag();
        for (Map.Entry<String, Double> entry : umsatzProTag.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " Euro");
        }
        System.out.println("Umsatz pro Artikelart:");
        Map<String, Double> umsatzProArtikelart = ermittleUmsatzProArtikelart();
        for (Map.Entry<String, Double> entry : umsatzProArtikelart.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " Euro");
        }
        System.out.println("Top 10 Artikel nach Umsatz:");
        List<Bestellposition> bestellpositionen = ermittleTop10Artikel();
        for (Bestellposition position : bestellpositionen) {
            System.out.println(position.getArtikel().getName() + ": " + position.getArtikel().getPreis() + " Euro");
        }
    }

    private double ermittleGesamtumsatz() {
        double gesamtumsatz = 0;
        for (Bestellung bestellung : bestellungen) {
            gesamtumsatz += bestellung.gesamtpreisBerechnen();
        }
        return gesamtumsatz;
    }

    private Map<String, Double> ermittleUmsatzProWochentag() {
        Map<String, Double> umsatzProTag = new HashMap<>();
        for (Bestellung bestellung : bestellungen) {
            String wochentag = ermittleWochentag(bestellung.getBestelldatum());
            if (umsatzProTag.containsKey(wochentag)) {
                double umsatz = umsatzProTag.get(wochentag);
                umsatzProTag.put(wochentag, umsatz + bestellung.gesamtpreisBerechnen());
            } else {
                umsatzProTag.put(wochentag, bestellung.gesamtpreisBerechnen());
            }
        }
        return umsatzProTag;
    }

    private String ermittleWochentag(Date datum) {
        Calendar kalender = Calendar.getInstance();
        kalender.setTime(datum);
        int tag = kalender.get(Calendar.DAY_OF_WEEK);
        switch (tag) {
            case Calendar.MONDAY:
                return "Montag";
            case Calendar.TUESDAY:
                return "Dienstag";
            case Calendar.WEDNESDAY:
                return "Mittwoch";
            case Calendar.THURSDAY:
                return "Donnerstag";
            case Calendar.FRIDAY:
                return "Freitag";
            case Calendar.SATURDAY:
                return "Samstag";
            case Calendar.SUNDAY:
                return "Sonntag";
                default:
                return "";
        }
    }

    private Map<String, Double> ermittleUmsatzProArtikelart() {
        Map<String, Double> umsatzProArtikelart = new HashMap<>();
        for (Bestellung bestellung : bestellungen) {
            for (Bestellposition position : bestellung.getArtikelListe()) {
                String artikelart = position.getArtikel().getClass().getSimpleName();
                if (umsatzProArtikelart.containsKey(artikelart)) {
                    double umsatz = umsatzProArtikelart.get(artikelart);
                    umsatzProArtikelart.put(artikelart, umsatz + position.getArtikel().getPreis());
                } else {
                    umsatzProArtikelart.put(artikelart, position.getArtikel().getPreis());
                }
            }
        }
        return umsatzProArtikelart;
    }

    private List<Bestellposition> ermittleTop10Artikel() {
        List<Bestellposition> allePositionen = new ArrayList<>();
        for (Bestellung bestellung : bestellungen) {
            allePositionen.addAll(bestellung.getArtikelListe());
        }
        Collections.sort(allePositionen, new Comparator<Bestellposition>() {
            @Override
            public int compare(Bestellposition p1, Bestellposition p2) {
                return Double.compare(p2.getArtikel().getPreis(), p1.getArtikel().getPreis());
            }
        });
        return allePositionen.subList(0, Math.min(10, allePositionen.size()));
    }
}
