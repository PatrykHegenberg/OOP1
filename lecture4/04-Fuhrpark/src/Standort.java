public class Standort {
    private int id;
    private String name;
    private String plz;
    private String Ort;
    private String strasse;
    private String hausnummer;
    private int maxPlaetze;
    private int freiePlaetze;
    private int belegtePlaetze;

    public Standort(int id, String name, String plz, String Ort, String strasse, String hausnummer, int maxPlaetze) {
        this.id = id;
        this.name = name;
        this.plz = plz;
        this.Ort = Ort;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.maxPlaetze = maxPlaetze;
        this.freiePlaetze = maxPlaetze;
        this.belegtePlaetze = 0;
    }

    public Standort(int id, String name, String plz, String Ort, String strasse, String hausnummer, int maxPlaetze, int belegtePlaetze) {
        this.id = id;
        this.name = name;
        this.plz = plz;
        this.Ort = Ort;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.maxPlaetze = maxPlaetze;
        this.freiePlaetze = maxPlaetze - belegtePlaetze;
        this.belegtePlaetze = belegtePlaetze;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getAdresse() {
        return plz + " " + Ort + " " + strasse + " " + hausnummer;
    }

    public void setAdresse(String p, String o, String s, String h) {
        this.plz = p;
        this.Ort = o;
        this.strasse = s;
        this.hausnummer = h;
    }

    public int getMaxPlaetze() {
        return maxPlaetze;
    }

    public void setMaxPlaetze(int m) {
        this.maxPlaetze = m;
    }

    public int getFreiePlaetze() {
        return freiePlaetze;
    }

    public int getBelegtePlaetze() {
        return belegtePlaetze;
    }

    public void addFahrzeug(Standort z) {
        if(this.freiePlaetze > 0 && this.belegtePlaetze < this.maxPlaetze) {
            this.freiePlaetze--;
            this.belegtePlaetze++;
            z.delFahrzeug();
        } else {
            System.out.println("Maximale Plätze erreicht");
        }
    }
    public void delFahrzeug() {
        if(this.freiePlaetze <= this.maxPlaetze && this.belegtePlaetze > 0) {
            this.freiePlaetze++;
            this.belegtePlaetze--;
        } else {
            System.out.println("Keine Fahrzeuge vorhanden");
        }
        
    }

    public String getInfo() {
        return "|" + this.id + " | " + this.name + " | " + this.plz + " | " + this.Ort + 
        " | " + this.strasse + " | " + this.hausnummer + " | " + this.maxPlaetze + " | " 
        + this.freiePlaetze + " | " + this.belegtePlaetze + " |";
    }
}
