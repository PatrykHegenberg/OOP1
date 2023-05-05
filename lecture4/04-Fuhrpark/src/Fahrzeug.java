//import java.sql.Date;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Fahrzeug {
	// Attribute
	private String kennzeichen;
	private String marke;
	private int ps;
	private int kmStand;
	private String mietStatus;
	private Datum inspektionsDatum;
	
	// Konstruktoren - noch keine
	
	// Methoden
	
	public String getKennzeichen() {
		return kennzeichen;
	}
	public void setKennzeichen(String k) {
		kennzeichen = k;
	}
	public String getMarke() {
		return marke;
	}
	public void setMarke(String m) {
		marke = m;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int p) {
		ps = p;
	}
	public int getKmStand() {
		return kmStand;
	}
	public void setKmStand(int k) {
		kmStand = k;
        Date datum = new Date();
        
        Calendar kalender = Calendar.getInstance();
        kalender.setTime(datum);
        
        kalender.add(Calendar.MONTH, 1);
        
        kalender.set(Calendar.DATE, 1);
        
        int fTag = kalender.get(Calendar.DATE);
        int fMonat = kalender.get(Calendar.MONTH) + 1;
        int fJahr = kalender.get(Calendar.YEAR);
        
		if(kmStand % 10000 >= 2000) {
			this.inspektionsDatum = new Datum(1, 7, 2023);
		} else {
			this.inspektionsDatum = new Datum(fTag, (int) fMonat, fJahr);
		}
	}
	public String getMietStatus() {
		return mietStatus;
	}
	public void setMietStatus(String m) {
		mietStatus = m;
	}
	public Datum getInspektionsDatum() {
		return inspektionsDatum;
	}

}
