public class Kunde {
    
    /*class Kunde {
        - kundennummer: int
        - name: String
        - vorname: String
        - telefonnummer: String
        - anschrift: String
        + Kunde(kundennummer: int, name: String, vorname: String, telefonnummer: String)
        + toString(): String
    }*/
    private int kundennummer;
    private String name;
    private String vorname;
    private String telefonnummer;
    private String anschrift;
    private boolean aktiv;

    public Kunde(int kundennummer, String name, String vorname, String telefonnummer, String anschrift) {
        this.kundennummer = kundennummer;
        this.name = name;
        this.vorname = vorname;
        this.telefonnummer = telefonnummer;
        this.anschrift = anschrift;
        this.aktiv = true;
    }
    public Kunde(int kundennummer, String name, String vorname, String telefonnummer) {
        this.kundennummer = kundennummer;
        this.name = name;
        this.vorname = vorname;
        this.telefonnummer = telefonnummer;
        this.aktiv = true;
    }

    public Kunde(int kundennummer, String telefonnummer, String anschrift) {
        this.kundennummer = kundennummer;
        this.telefonnummer = telefonnummer;
        this.anschrift = anschrift;
        this.aktiv = true;
    }

    private void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    private void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    private void setVorname(String vorname) {
        this.vorname = vorname;
    }

    private void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public String getAnschrift() {
        return anschrift;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public void changeKundenDaten(int kn, String n, String vn, String tn, String anschrift) {
        setKundennummer(kn);
        setName(n);
        setVorname(vn);
        setTelefonnummer(tn);
        setAnschrift(anschrift);
    }

    @Override
    public String toString() {
        return "Kunde{" + "kundennummer=" + kundennummer + ", name=" + name + ", vorname=" + vorname + ", telefonnummer=" + telefonnummer + ", anschrift=" + anschrift + "status= " + aktiv +'}';
    }

}
