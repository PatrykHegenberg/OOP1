import java.lang.Math;

public class BmiRechner {
    public static void main(String[] args) {
        double weight = 0;
        double height = 0;
        System.out.println("BMI Rechner");
        // Eingabe der Körpergröße mit abfangen falls die Eingabe keine Zahl ist
        System.out.println("Geben Sie Ihren Körpergröße in m ein");
        boolean weiter = true;
        while(weiter){
            try {
                height = Double.parseDouble(System.console().readLine());
                weiter = false;
            } catch (NumberFormatException e) {
                System.out.println("Bitte geben Sie eine Zahl ein");
                continue;
            }
        }
        // Eingabe der Gewicht mit abfangen falls die Eingabe keine Zahl ist
        weiter = true;
        while(weiter){
            System.out.println("Geben Sie Ihren Gewicht in kg ein");
            try {
                weight = Double.parseDouble(System.console().readLine());
                weiter = false;
            } catch (NumberFormatException e) {
                System.out.println("Bitte geben Sie eine Zahl ein");
                continue;
            }
        }
        double bmi = weight / Math.pow(height, 2);
        if(bmi < 20){
            System.out.println("Untergewicht");
        }
        else if(bmi < 25){
            System.out.println("Normalgewicht");
        }
        else if(bmi < 35){
            System.out.println("Übergewicht");
        }
        else{
            System.out.println("Extremes Übergewicht");
        }
        // Ausgabe mit Switch
        int switchTest = 0;
        if (bmi < 20){
            switchTest = 1;
        } else if (bmi < 25){
            switchTest = 2;
        } else if (bmi < 35){
            switchTest = 3;
        }
        switch(switchTest){
            case 1:
                System.out.println("Untergewicht");
                break;
            case 2:
                System.out.println("Normalgewicht");
                break;
            case 3:
                System.out.println("Übergewicht");
                break;
            default:
                System.out.println("Extremes ßbergewicht");
        }
    }
}