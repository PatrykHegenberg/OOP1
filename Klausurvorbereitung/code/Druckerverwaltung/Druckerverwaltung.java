public class Druckerverwaltung { 
 
    public static void main(String[] args) { 
        //Drucker d1 = new Drucker("Canon", "abc100", 199); 
        Drucker d1 = new Drucker(); 
        Laserdrucker d2 = new Laserdrucker("HP", "L 1001", 119.95, "xyz-Toner"); 
        Drucker d3 = new Laserdrucker("Brother", "B 2002", 99, "abc-Toner"); 
 
        //System.out.println(d1.getTonerTyp()); 
        System.out.println(d2.getTonerTyp()); 
        //System.out.println(d3.getTonerTyp()); 
 
        d2.versendeFax(+4912345); 
 
} 
}