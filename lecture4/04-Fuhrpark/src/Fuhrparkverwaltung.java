public class Fuhrparkverwaltung {

	public static void main(String[] args) {
		// Musterlösung zu Tag 01 - Aufgabe C.1

		// Variablen für Fahrzeuge
		Fahrzeug fzg1, fzg2, fzg3;

		// Fahrzeug 1 anlegen
		fzg1 = new Fahrzeug();
		fzg1.setKennzeichen("H-XY 123");
		fzg1.setMarke("VW");
		fzg1.setPs(140);
		fzg1.setKmStand(23456);
		fzg1.setMietStatus("vermietet");

		// Fahrzeug 2 anlegen
		fzg2 = new Fahrzeug();
		fzg2.setKennzeichen("H-XY 654");
		fzg2.setMarke("Audi");
		fzg2.setPs(220);
		fzg2.setKmStand(66222);
		fzg2.setMietStatus("vermietet");

		// Fahrzeug 3 anlegen
		fzg3 = new Fahrzeug();
		fzg3.setKennzeichen("H-XY 999");
		fzg3.setMarke("BMW");
		fzg3.setPs(245);
		fzg3.setKmStand(100001);
		fzg3.setMietStatus("nicht vermietet");
		
		// Konsolenausgabe
		System.out.println("Das Fahrzeug mit dem Kennzeichen " + fzg1.getKennzeichen() + " ist " + fzg1.getMietStatus() );
		System.out.println("Das Fahrzeug mit dem Kennzeichen " + fzg2.getKennzeichen() + " ist " + fzg2.getMietStatus() );
		System.out.println("Das Fahrzeug mit dem Kennzeichen " + fzg3.getKennzeichen() + " ist " + fzg3.getMietStatus() );

		Datum heuteDatum;
		heuteDatum = new Datum(17, 4, 2023);
		System.out.println(heuteDatum.datumZuInt());	
		System.out.println(heuteDatum.getWochentag());
		
		Standort zentrale, nord, sued;

		zentrale = new Standort(1, "Zentrale", "34567", "Mittelhausen", "Hauptstraße", "1", 6, 3);
		nord = new Standort(2, "Nord", "12345", "Sielstadt", "Am Kanal", "2", 4);
		sued = new Standort(3, "Sued", "89012", "Joddeldorf", "Kirchweg", "17b", 2);
		
		System.out.println(zentrale.getInfo());
		System.out.println(nord.getInfo());
		System.out.println(sued.getInfo());

		nord.addFahrzeug(zentrale);
		sued.addFahrzeug(zentrale);

		System.out.println(zentrale.getInfo());
		System.out.println(nord.getInfo());
		System.out.println(sued.getInfo());

		nord.addFahrzeug(zentrale);
		sued.addFahrzeug(zentrale);

		System.out.println(zentrale.getInfo());
		System.out.println(nord.getInfo());
		System.out.println(sued.getInfo());

		nord.addFahrzeug(zentrale);
		sued.addFahrzeug(zentrale);

		System.out.println(zentrale.getInfo());
		System.out.println(nord.getInfo());
		System.out.println(sued.getInfo());
	}

}
