//public class Laserdrucker extends Drucker extends KannFaxen{ 
public class Laserdrucker extends Drucker implements KannFaxen{ 
 
    String tonerTyp; 
    //Laserdrucker(String marke, String bezeichnung, int preis, String tonerTyp){ 
    Laserdrucker(String marke, String bezeichnung, double preis, String tonerTyp){ 
        //super(marke, bezeichnung, preis); 
        this.marke = marke; 
        this.bezeichnung = bezeichnung; 
        this.preis = preis; 
        this.tonerTyp = tonerTyp; 
    } 
 
    public String getTonerTyp() {return tonerTyp; } 
    public void versendeFax(int nummer) { System.out.println("Noch nicht implementiert");} 
    public void empfangeFax(int nummer) { System.out.println("Noch nicht implementiert");} 
} 