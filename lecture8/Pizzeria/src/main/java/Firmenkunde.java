public class Firmenkunde extends Kunde {
    protected String firmenname;
    protected String umsatzsteuer_id;
    protected String rechnungsanschrift;

    public Firmenkunde(int kundennummer, String name, String vorname, String telefonnummer,
                       String firmenname, String umsatzsteuer_id, String rechnungsanschrift) {
        super(kundennummer, name, vorname, telefonnummer, rechnungsanschrift);
        this.firmenname = firmenname;
        setUmsatzsteuer_id(umsatzsteuer_id);
        this.rechnungsanschrift = super.getAnschrift();
    }

    public void setUmsatzsteuer_id(String umsatzsteuer_id) {
        boolean matches = umsatzsteuer_id.matches("[A-Z]{2}\\d+");
        if (matches) {
            this.umsatzsteuer_id = umsatzsteuer_id;
        } else {
            this.umsatzsteuer_id = "";
        }

    }

    public String getRechnungsanschrift() {
        return rechnungsanschrift;
    }

    public void setRechnungsanschrift(String rechnungsanschrift) {
        this.rechnungsanschrift = rechnungsanschrift;
    }

    @Override
    public String toString() {
        return "Firmenkunde{" +
                "firmenname='" + firmenname + '\'' +
                ", umsatzsteuer_id='" + umsatzsteuer_id + '\'' +
                ", rechnungsanschrift='" + rechnungsanschrift + '\'' +
                '}';
    }
}
