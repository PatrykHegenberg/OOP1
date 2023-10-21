import java.util.Scanner;
import java.lang.Math;

public class Bmi {
    static Scanner scanner = new Scanner(System.in);

    public static void primZahlen(){
        int start = 50;
        int ende = 100;
        boolean isPrime = false;
        for (int i = start; i <= ende; i++){
            for(int j = 1; j < ende * 2; j++){
                if(i % j == 0 && i != j && j != 1){
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if(isPrime){
                System.out.println(i + " ist eine Primzahl");
            }
        }
    }
    public static void main(String[] args) {
        double gewicht = 0;
        double groesse = 0;
        System.out.println("Dies ist ein Bmi-Rechner");
        System.out.println("Geben Sie ihr Gewicht in Kilogramm ein.");
        gewicht = scanner.nextDouble();
        System.out.println("Geben Sie ihre Größe in Metern ein.");
        groesse = scanner.nextDouble();
        double bmi = gewicht / Math.pow(groesse, 2);
        if(bmi < 20) {
            System.out.println("Untergewicht");
        } else if(bmi < 25) {
            System.out.println("Normalgewicht");
        } else if (bmi < 35) {
            System.out.println("Übergewicht");
        } else {
            System.out.println("Extremes Übergewicht");
        }
        primZahlen();
    }
}