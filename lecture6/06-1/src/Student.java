public class Student {
  // Attribute
  private int mnr;
  private String name;
  private Datum gebdatum;
  private Fach fach;
  private Vorlesung[] vorlesungen;

  // Konstruktoren
  Student(int m, String n, Datum d) {
    setMnr(m);
    setName(n);
    setGebdatum(d);
  }

  Student(int m, String n, Datum d, Fach f) {
    setMnr(m);
    setName(n);
    setGebdatum(d);
    setFach(f);
  }

  // Getter und Setter
  public void setMnr(int mnr) { this.mnr = mnr; }

  public void setGebdatum(Datum gebdatum) { this.gebdatum = gebdatum; }

  public void setName(String name) { this.name = name; }

  public Datum getGebdatum() { return gebdatum; }

  public int getMnr() { return mnr; }

  public String getName() { return name; }

  public void setFach(Fach fach) { this.fach = fach; }

  public Fach getFach() { return fach; }

  // Methoden
  public void fachWechseln() {}
}
