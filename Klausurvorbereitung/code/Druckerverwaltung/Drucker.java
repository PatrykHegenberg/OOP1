public class Drucker { 
    public String marke; 
    //private String bezeichnung; 
    public String bezeichnung; 
    double preis; 

    Drucker(){  
        marke = "unbekannt"; 
        bezeichnung = "unbekannt"; 
        preis = 999; 
    } 
 
    void print() { 
        System.out.println(marke + "//" + bezeichnung + "//" + preis);  
    } 
}