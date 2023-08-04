public class Auto {
	// Attribute
    private int raeder;
	private String name;
    private int sitze;
    private int kmStand;
	// Konstruktoren
	Auto(int r, String n, int s, int k) {
		setKmStand(k);
		setName(n);
		setRaeder(r);
		setSitze(s);
	}
	// Getter und Setter
    public int getRaeder() {
		return raeder;
	}
	public void setRaeder(int raeder) {
		this.raeder = raeder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSitze() {
		return sitze;
	}
	public void setSitze(int sitze) {
		this.sitze = sitze;
	}
	public int getKmStand() {
		return kmStand;
	}
	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}

	// Methoden
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.kmStand);
		System.out.println(this.raeder);
		System.out.println(this.sitze);
	}
}
