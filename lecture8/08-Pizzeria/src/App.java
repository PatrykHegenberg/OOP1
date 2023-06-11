import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            Kundenverwaltung kundenverwaltung = new Kundenverwaltung();
            // Ein Dialog zum anlegen eines neuen Kunden
            // cli application to add a new Kunde
            System.out.println("################################################################################");
            System.out.println("#                        Die Kundenverwaltung der Pizzeria ...                 #");
            System.out.println("################################################################################");
            System.out.println("#                             Was wollen Sie tun?                              #");
            System.out.println("#                             1: Kunden anlegen                                #");
            System.out.println("#                             2: Kunden ändern                                 #");
            System.out.println("#                             3: Kunden deaktivieren                           #");
            System.out.println("#                             4: Kunden ausgeben                               #");
            System.out.println("#                             5: Kunden aus einer Datei einlesen               #");
            System.out.println("#                             6: Gerichte verwalten                            #");
            System.out.println("#                             0: Beenden                                       #");
            System.out.println("################################################################################");
            int auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1: {
                    String name = scanner.next("Name des Kunden: ");
                    String vorname = scanner.next("Vorname des Kunden: ");
                    String telefonnummer = scanner.next("Telefonnummer des Kunden: ");
                    String anschrift = scanner.next("Anschrift des Kunden: ");
                    kundenverwaltung.kundeAnlegen(new kunde(name, vorname, telefonnummer, anschrift));
                    break;
                }
                case 2: {
                    int kundennummer = scanner.nextInt("Kundennummer: ");
                    if (kundenverwaltung.kundeSuchen(kundennummer) != null) {
                        kundenverwaltung.kundeAendern(kundenverwaltung.kundeSuchen(kundennummer));
                    } else {
                        System.out.println("Kunde nicht gefunden");
                    }
                    break;
                }
                case 3: {
                    int kundennummer = scanner.nextInt("Kundennummer: ");
                    if (kundenverwaltung.kundeSuchen(kundennummer) != null) {
                        kundenverwaltung.kundeDeaktivieren(kundennummer);
                    } else {
                        System.out.println("Kunde nicht gefunden");
                    }
                    break;
                }
                case 4: {
                    kundenverwaltung.printKunden();
                    break;
                }
                case 5: {
                    readBestandsKundenverwaltung();
                    break;
                }
                case 6: {
                    break;
                }
                case 0: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Ungültige Eingabe");
                }
            }
        }
    }

    public Kundenverwaltung readBestandsKundenverwaltung() {
        // This functions reads Kunden from a file and adds them to the kundenkartei
        // the path to the file is read from the command line
        Kundenverwaltung kundenverwaltung = new Kundenverwaltung();
        while (true) {
            System.out.println("Einlesen von Bestandskunden: ");
            System.out.println("Wollen Sie Privatkunden(1) oder Firmenkunden(2) einlesen?");
            int auswahlPF = scanner.nextInt();

            switch (auswahlPF) {
                case 1: {
                    System.out.println("Einlesen von Privatkunden: ");
                    break;
                }
                case 2: {
                    System.out.println("Einlesen von Firmenkunden: ");
                    break;
                }
                default: {
                    System.out.println("Ungültige Eingabe");
                    break;
                }
            }
            String path = "kunden.txt";
        }
        return kundenverwaltun;
    }

    String dateipfad = "pfad/zur/datei.txt";

}
