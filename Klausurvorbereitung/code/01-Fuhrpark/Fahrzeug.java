public class Fahrzeug{
    private String kennzeichen;
    private String marke;
    private int ps;
    private int km_stand;
    private boolean istVermietet;

    public Fahrzeug(){
        this.istVermietet = false;
        this.kennzeichen = "";
        this.km_stand = 0;
        this.marke = "";
        this.ps = 0;
    }

    public Fahrzeug(String kennzeichen, String marke, int ps, int km_stand, boolean istVermietet){
        this.istVermietet = istVermietet;
        this.kennzeichen = kennzeichen;
        this.km_stand = km_stand;
        this.marke = marke;
        this.ps = ps;
    }

    public String getMarke() {
        return this.marke;
    }

    public String getKennzeichen() {
        return this.kennzeichen;
    }

    public int getPs() {
        return this.ps;
    }

    public int getKm_stand() {
        return this.km_stand;
    }

    public boolean getIstVermietet() {
        return this.istVermietet;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setKm_stand(int km_stand) {
        this.km_stand = km_stand;
    }

    public void setIstVermietet(boolean istVermietet) {
        this.istVermietet = istVermietet;
    }

    public void getInfo() {
        String txt = "Das Fahrzeug mit dem Kennzeichen: " + this.kennzeichen + " ist ";
        txt += (this.istVermietet)? "vermietet": "nicht vermietet";
        System.out.println(txt);
    }
}