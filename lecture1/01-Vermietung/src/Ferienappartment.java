public class Ferienappartment {
    private int Zimmer, Betten;
    private String Bezeichung;
    private double Preis;
    private boolean vermietet;

    Ferienappartment(String b, int z, int be, double p, boolean v) {
        this.Bezeichung = b;
        this.Zimmer = z;
        this.Betten = be;
        this.Preis = p;
        this.vermietet = v;
    }

    public void setBezeichnug(String b) {
        this.Bezeichung = b;
    }
    public void setZimmer(int z) {
        this.Zimmer = z;
    }
    public void setBetten(int b) {
        this.Betten = b;
    }
    public void setPreis(double p) {
        this.Preis = p;
    }
    public void setVermietet(boolean v) {
        this.vermietet = v;
    }

    public String getBezeichnung() {
        return this.Bezeichung;
    }
    public int getZimmer() {
        return this.Zimmer;
    }
    public int getBetten() {
        return this.Betten;
    }
    public double getPreis() {
        return this.Preis;
    }
    public boolean getVermietet() {
        return this.vermietet;
    }

    public void printStatus() {
        String status;
        if (this.vermietet) {
            status = "vermietet";
        } else {
            status = "nicht vermietet";
        }

        System.out.println("Das Appartment " + this.Bezeichung + " kostet: " + this.Preis + " und ist derzeit " + status);
    }
}
