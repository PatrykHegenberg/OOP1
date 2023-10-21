public class Ferienhaus{
    private int betten, zimmer;
    private double preis;
    private String name;
    private boolean istVermietet;

    public Ferienhaus(){
        this.betten = 0;
        this.zimmer = 0;
        this.preis = 0.0;
        this.name = "";
        this.istVermietet = false;
    }

    public Ferienhaus(String name, int betten, int zimmer, double preis, boolean istVermietet) {
        this.betten = betten;
        this.zimmer = zimmer;
        this.preis = preis;
        this.name = name;
        this.istVermietet = istVermietet;
    }

    public boolean getStatus() {
        return this.istVermietet;
    }

    public void mieten(){
        this.istVermietet = (!istVermietet)? true: false;
    }

    public void getInfo() {
        String msg = "Das " + getClass().getSimpleName() + " " + this.name + " kostet " + this.preis + "€ pro Nacht, hat " + this.betten + " Betten in " + this.zimmer + " Zimmern und ist derzeit ";
        msg += (istVermietet)? " belegt": "frei";
        System.out.println(msg);
    }
}