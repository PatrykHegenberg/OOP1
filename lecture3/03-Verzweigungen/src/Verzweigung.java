public class Verzweigung {
    public static void main(String[] args) {
        // Integerr von der Konsole einlesen
        System.out.println("Geben Sie eine Zahl ein: ");
        int zahl = Integer.parseInt(System.console().readLine());
        if(zahl%2==0){
            System.out.println(zahl + " ist durch 2 teilbar");
        }
        else if(zahl%3==0){
            System.out.println(zahl + " ist durch 3 teilbar");
        } else {
            System.out.println(zahl + " ist nicht durch 2 oder 3 teilbar");
        }
    }
}