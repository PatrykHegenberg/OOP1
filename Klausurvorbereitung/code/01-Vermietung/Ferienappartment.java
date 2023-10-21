public class Ferienappartment {
    private int betten;
    private double preis;
    private String name;
    private boolean istVermietet;

    public Ferienappartment(){
        this.betten = 0;
        this.preis = 0.0;
        this.name = "";
        this.istVermietet = false;
    }

    public Ferienappartment(String name, int betten, double preis, boolean istVermietet) {
        this.betten = betten;
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
        String msg = "Das " + getClass().getSimpleName() + " " + this.name + " kostet " + this.preis + "€ pro Nacht, hat " + this.betten + " Betten und ist derzeit ";
        msg += (istVermietet)? " belegt": "frei";
        System.out.println(msg);
    }
}