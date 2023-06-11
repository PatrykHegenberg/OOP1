import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Kundenkartei implements Iterable<Kunde> {
    private List<Kunde> kundenkartei;

    public Kundenkartei() {
        kundenkartei = new ArrayList<>();
    }

    public void kundeAnlegen(Kunde kunde) {
        kundenkartei.add(kunde);
    }

    public void kundenDatenAendern(int kundennummer, String name, String vorname, String telefonnummer) {
        for (Kunde kunde : kundenkartei) {
            if (kunde.getKundennummer() == kundennummer) {
                kunde.setName(name);
                kunde.setVorname(vorname);
                kunde.setTelefonnummer(telefonnummer);
                return;
            }
        }
    }

    public int getKundenanzahl() {
        return kundenkartei.size();
    }

    public void kundeDeaktivieren(int kundennummer) {
        kundenkartei.removeIf(kunde -> kunde.getKundennummer() == kundennummer);
    }

    public void firmenkundeAnlegen(Firmenkunde firmenkunde) {
        kundenkartei.add(firmenkunde);
    }

    public List<Kunde> kundenkarteiLaden() {
        return kundenkartei;
    }

    public Kunde kundeSuchen(int kundennummer) {
        for (Kunde kunde : kundenkartei) {
            if (kunde.getKundennummer() == kundennummer) {
                return kunde;
            }
        }
        return null;
    }

    public List<Kunde> kundenSuchen(String name) {
        List<Kunde> ergebnis = new ArrayList<>();
        for (Kunde kunde : kundenkartei) {
            if (kunde.getName().equals(name)) {
                ergebnis.add(kunde);
            }
        }
        return ergebnis;
    }

    @Override
    public Iterator<Kunde> iterator() {
        return kundenkartei.iterator();
    }
}

