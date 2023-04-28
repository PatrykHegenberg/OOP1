import java.io.Console;

public class VerzweigungUndSchleifen {
    public static void main(String[] args) {
        boolean run = true;
        int zahl;
        while (run) {
            System.out.println("Zu welchem Themengebiet haben Sie fragen?");
            printAnsprechpartner();
            zahl = Integer.parseInt(System.console().readLine());
            if (zahl == 0) {
                run = false;
            }
        }
    }
    
    public static void printAnsprechpartner() {
        System.out.println("| Nr | Themengebiet        | Ansprechpartner |");
        System.out.println("| 1  | Agrarwissenschaften | Herr Müller     |");
        System.out.println("| 2  | Biologie            | Herr Müller     |");
        System.out.println("| 3  | Chemie              | Frau Meier      |");
        System.out.println("| 4  | Deutsch             | Frau Meier      |");
        System.out.println("| 5  | Englisch            | Frau Meier      |");
        System.out.println("| 6  | Französisch         | Herr Müller     |");
        System.out.println("| 7  | Germanistik         | Frau Schulze    |");
        System.out.println("| 8  | Hauswirtschaft      | Frau Schulze    |");
        System.out.println("| 0  | ABBRUCH             |                 |");
    }
}