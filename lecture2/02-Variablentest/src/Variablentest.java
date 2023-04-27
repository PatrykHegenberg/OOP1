public class Variablentest {
    public static void main(String[] args) {
        //Variablen, Datentypen, ...
        int i1;
        i1 = 100;
        int i2 = 200;
        int i3 = 300; //hier ist ein Fehler
        int i4;
        int i5 = 500; //hier ist ein Fehler

        i1 = i1 * i2;
        System.out.println(i1);
        i1 = i1 * i2;
        System.out.println(i1);
        i1 = i1 * i2;
        System.out.println(i1);
        i1 = i1 * i2;
        System.out.println(i1);
        i1 = i1 * i2;
        System.out.println(i1);
        i1 = i1 * i2;
        System.out.println(i1);
        i1 = i1 * i2;
        System.out.println(i1);

        i1 = 100;
        System.out.println(i1+0);
        System.out.println(i1-0);
        System.out.println(i1*0);
        //System.out.println(i1/0); // Das ist ein Fehler

        double d1 = 100.00;
        double d2 = 200;

        char c1 = 'a';
        System.out.println(c1);
        char c2 = '\n';
        System.out.println(c2);
        char c3 = 'a'; //hier ist ein Fehler
        System.out.println(c3);
        //char c4 = 'ab'; // Das ist ein Fehler
        //System.out.println(c4);
        char c5 = 'a' + 'b';
        System.out.println(c5);
        i1 = 'a' + 'b';
        System.out.println(i1);

        boolean b1 = true;
        boolean b2 = 2 == 4;
        //boolean b3 = 0; // Das ist ein Fehler
        boolean b4 = b1 & b2;
        //boolean b5 = b1 + b2; // Das ist ein Fehler
    }
}