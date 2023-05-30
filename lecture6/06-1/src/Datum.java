public class Datum {
    //Attribute
    private int tag;
    private int monat;
    private int jahr;

    // Konstruktoren
    Datum(int t, int m, int j) {
        setTag(t);
        setMonat(m);
        setJahr(j);
    }

    // Methoden
    public int getTag() {
        return tag;
    }

    public int getMonat() {
        return monat;
    }

    public int getJahr() {
        return jahr;
    }

    private void setTag(int t) {
        if (t < 1 || t > 31) {
            System.out.println("Tag muss zwischen 1 und 31 liegen");
        } else if(t > maxTageImMonat(monat)) {
            System.out.println("Tag muss zwischen 1 und " + maxTageImMonat(this.monat) + " liegen");
        } else {
            this.tag = t;
        }
    }

    private void setMonat(int m) {
        this.monat = m;
    }

    private void setJahr(int j) {
        this.jahr = j;
    }

    public void setDatum(int t, int m, int j) {
        setTag(t);
        setMonat(m);
        setJahr(j);
    }

    private int maxTageImMonat(int m) {
        // This method returns the number of days in the month

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            return 31;
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }
        return istSchaltjahr(this.jahr) ? 29 : 28;
    }

    public boolean istSchaltjahr(int j) {
        // This method returns true if the year is a leap year
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public String datumZuString(boolean lang) {
        String sTag = "";
        if(lang) {
            if(tag < 10) {
                sTag = "0" + tag;
            } else {
                sTag = "" + tag;
            }
            return sTag + "." + getMonatsname(monat, lang) + ". im Jahr" + jahr;
        } else {
            return sTag + "." + getMonatsname(monat, lang) + "." + jahr;

        }
    }

    public Datum getFolgeTag() {
        return new Datum(tag + 1, monat, jahr);
    }

    public int datumZuInt() {
        int[] tageImMonat = {31, 28 + (istSchaltjahr(jahr) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int anzahlTage = (jahr - 1900) * 365 + anzahlSchaltjahreSeit1900(jahr);

        for (int i = 0; i < monat - 1; i++) {
            anzahlTage += tageImMonat[i];
        }

        anzahlTage += tag;
        return anzahlTage;
    }

    private static int anzahlSchaltjahreSeit1900(int j) {
        int anzahlSchaltjahre = (j - 1900) / 4;
        anzahlSchaltjahre -= (j - 1900) / 100;
        anzahlSchaltjahre += (j - 1900) / 400;
        return anzahlSchaltjahre;
    }

    public String getWochentag() {
        //this methods returns the day of the week
        String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        return wochentage[datumZuInt() % 7];

    }

    private String getMonatsname(int m, boolean lang) {
        String[] monateLang = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        String[] monateKurz = {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"};
        if(lang) {
            return monateLang[m - 1];
        } else {
            return monateKurz[m - 1];
        }
    }
}
