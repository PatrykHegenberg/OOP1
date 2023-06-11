public class Firmenkunde extends Kunde {
   /*
    class Firmenkunde {
        - firmenname: String
        - umsatzsteuer_id: String
        - rechnungsanschrift: String
        + Firmenkunde(kundennummer: int, name: String, vorname: String, telefonnummer: String,
                     firmenname: String, umsatzsteuer_id: String, rechnungsanschrift: String)*/
    private String firmenname;
    private String umsatzsteuer_id;
    private String rechnungsanschrift;

    public Firmenkunde(int kundennummer, String name, String vorname, String telefonnummer, String firmenname, String umsatzsteuer_id, String rechnungsanschrift) {
        super(kundennummer, telefonnummer, rechnungsanschrift);
        this.firmenname = firmenname;
        this.umsatzsteuer_id = umsatzsteuer_id;
    }

    public String getFirmenname() {
        return firmenname;
    }

    public String getUmsatzsteuer_id() {
        return umsatzsteuer_id;
    }

    public String getRechnungsanschrift() {
        return rechnungsanschrift;
    }

    private void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    private void setUmsatzsteuer_id(String umsatzsteuer_id) {
        // Setzten der Umsatzsteuer-id inklusive einer Prüfung ob diese plausibel ist

        this.umsatzsteuer_id = umsatzsteuer_id;
    }

    private void setRechnungsanschrift(String rechnungsanschrift) {
        // Eine Erweiterung der Anschrift der Klase Kunde
        this.rechnungsanschrift = rechnungsanschrift;
    }


}
