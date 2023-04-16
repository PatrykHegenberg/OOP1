public class Ferienhaus {
    private String Bezeichnung;
    private int Zimmer, Stockwerke, Betten, Baeder;
    private boolean vermietet;
    private double Preis;

    Ferienhaus(String bezeichnung, int zimmer, int Stockwerke, int betten, int baeder, double preis, boolean vermietet) {
        this.Bezeichnung = bezeichnung;
        this.Zimmer = zimmer;
        this.Stockwerke = Stockwerke;
        this.Betten = betten;
        this.Baeder = baeder;
        this.Preis = preis;
        this.vermietet = vermietet;
    }

    public void setBezeichnug(String b){
        this.Bezeichnung = b;
    }

    public String getBezeichnung() {
        return this.Bezeichnung;
    }

    public void setZimmer(int z) {
        this.Zimmer = z;
    }

    public int getZimmer() {
        return this.Zimmer;
    }

    public void setStockwerke(int s) {
        this.Stockwerke = s;
    }

    public int getStockwerke() {
        return this.Stockwerke;
    }

    public void setBetten(int b) {
        this.Betten = b;
    }

    public int getBetten() {
        return this.Betten;
    }

    public void setBader(int b) {
        this.Baeder = b;
    }

    public int getBaeder() {
        return this.Baeder;
    }

    public void setVermietet(boolean v) {
        this.vermietet = v;
    }

    public boolean getVermietet() {
        return this.vermietet;
    }

    public void setPreis(double p) {
        this.Preis = p;
    }

    public double getPreis() {
        return this.Preis;
    }

    public void printInfo() {
        if (this.vermietet) {
            System.out.println("Das Ferienhaus " + this.Bezeichnung + " kostet: " + this.Preis + " und ist derzeit vermietet");
        } else {
            System.out.println("Das Ferienhaus " + this.Bezeichnung + " kostet: " + this.Preis + " und ist derzeit frei");
        }
    }
}
