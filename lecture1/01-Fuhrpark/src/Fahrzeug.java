public class Fahrzeug {
    private String Kennzeichen, Marke;
    private int PS, kmStand;
    private boolean istVermietet;

    Fahrzeug(String kennzeichen, String marke, int ps, int km, boolean vermietet) {
        this.Kennzeichen = kennzeichen;
        this.Marke = marke;
        this.PS = ps;
        this.kmStand = km;
        this.istVermietet = vermietet;
    }

    public void setKennzeichen(String kennzeichen) {
        this.Kennzeichen = kennzeichen;
    }

    public String getKennzeichen() {
        return this.Kennzeichen;
    }

    public void setMarke(String marke) {
        this.Marke = marke;
    }

    public String getMarke() {
        return this.Marke;
    }

    public void setPS(int ps) {
        this.PS = ps;
    }

    public int getPS() {
        return this.PS;
    }

    public void setKmStand(int km) {
        this.kmStand = km;
    }

    public int getKmStand() {
        return this.kmStand;
    }

    public void setMietstatus(boolean m) {
        this.istVermietet = m;
    }

    public boolean getMietstatus() {
        return this.istVermietet;
    }
    public void printStatus() {
        if (this.istVermietet == true) {
            System.out.println("Das Fahrzeug mit dem Kennzeichen: " + this.Kennzeichen + " ist vermietet");
        } else {
            System.out.println("Das Fahrzeug mit dem Kennzeichen: " + this.Kennzeichen + " ist nicht vermietet.");
        }
    }
}
