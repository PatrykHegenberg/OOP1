public class Kunde {
    protected int kundennummer;
    protected String name;
    protected String vorname;
    protected String telefonnummer;
    protected String anschrift;
    protected boolean aktiv;

    public Kunde(int kundennummer, String name, String vorname, String telefonnummer, String anschrift) {
        this.kundennummer = kundennummer;
        this.name = name;
        this.vorname = vorname;
        this.telefonnummer = telefonnummer;
        this.anschrift = anschrift;
        aktiv = true;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getVorname() {
        return vorname;
    }

    protected void setVorname(String vorname) {
        this.vorname = vorname;
    }

    protected void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    protected String getAnschrift() {
        return anschrift;
    }

    protected void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    protected boolean isAktiv() {
        return aktiv;
    }

    protected void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "kundennummer=" + kundennummer +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", anschrift='" + anschrift + '\'' +
                '}';
    }
}
