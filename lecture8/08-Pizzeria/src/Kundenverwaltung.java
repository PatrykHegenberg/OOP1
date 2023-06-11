import java.util.List;
import java.util.ArrayList;

public class Kundenverwaltung {
    
    /*class Kundenverwaltung {
        - kundenkartei: List<Kunde>
        + kundeAnlegen(kunde: Kunde): void
        + kundenDatenAendern(kundennummer: int, name: String, vorname: String, telefonnummer: String): void
        + kundeDeaktivieren(kundennummer: int): void
        + firmenkundeAnlegen(kunde: Firmenkunde): void
        + kundenkarteiLaden(): List<Kunde>
        + kundeSuchen(kundennummer: int): Kunde*/
    private List<Kunde> kundenkartei;

    public Kundenverwaltung() {
        this.kundenkartei = new ArrayList<Kunde>();    
    }

    public Kundenverwaltung(List<Kunde> kundenkartei) {
        this.kundenkartei = kundenkartei;
    }

    public void kundeAnlegen(Kunde kunde) {
        kunde.changeKundenDaten(kundenkartei.size() + 1, kunde.getName(), kunde.getVorname(), kunde.getTelefonnummer(), kunde.getAnschrift());
        kundenkartei.add(kunde);
    }

    public void kundenDatenAendern(int kundennummer, String name, String vorname, String telefonnummer, String anschrift) {
        for (Kunde kunde : kundenkartei) {
            if (kunde.getKundennummer() == kundennummer) {
                kunde.changeKundenDaten(kundennummer, name, vorname, telefonnummer, anschrift);
            }
        }
    }

    public void kundeDeaktivieren(int kundennummer) {
        for (Kunde kunde : kundenkartei) {
            if (kunde.getKundennummer() == kundennummer) {
                kunde.setAktiv(false);
            }
        }
    }

    public void printKunden() {
        for (Kunde kunde : kundenkartei) {
            System.out.println(kunde.toString());
        }
    }
}
