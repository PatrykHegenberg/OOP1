import java.util.Scanner;

public class Verzweigung {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Geben Sie bitte eine Ganzzahl ein: ");
        int eingabe = scanner.nextInt();
        if(eingabe % 2 == 0) {
            System.out.println(eingabe + " ist durch 2 teilbar.");
        } else if(eingabe % 3 == 0) {
            System.out.println(eingabe + " ist durch 3 teilbar.");
        } else {
            System.out.println(eingabe + " ist nicht durch 2 oder 3 teilbar.");
        }
        boolean run = true;
        while(run) {
            System.out.println("Wenn wollen Sie erreichen?");
            System.out.println(" --- ---------------------");
            System.out.println("| 1 | Agrarwissenschaften |");
            System.out.println("| 2 | Biologie            |");
            System.out.println("| 3 | Chemie              |");
            System.out.println("| 4 | Deutsch             |");
            System.out.println("| 5 | Englisch            |");
            System.out.println("| 6 | Französisch         |");
            System.out.println("| 7 | Germanistik         |");
            System.out.println("| 8 | Hauswirtschaft      |");
            System.out.println("| 0 | ABBRUCH             |");
            System.out.println(" --- ---------------------");
            eingabe = scanner.nextInt();
            switch (eingabe) {
                case 0: {run = false; break;}
                case 1: {System.out.println("Herr Müller"); break;}
                case 2: {System.out.println("Herr Müller"); break;}
                case 3: {System.out.println("Frau Meier"); break;}
                case 4: {System.out.println("Frau Meier"); break;}
                case 5: {System.out.println("Frau Meier"); break;}
                case 6: {System.out.println("Herr Müller"); break;}
                case 7: {System.out.println("Frau Schulze"); break;}
                case 8: {System.out.println("Frau Schulze"); break;}
                default:
                    System.out.println("Steht nicht zur Auswahl.");
            }
        }
    }
}