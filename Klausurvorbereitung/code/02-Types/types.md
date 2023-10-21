# Aufgabe A
## Aufgabe A1
```java
public class VariablenTest { 
 
public static void main(String[] args) { 
// Variablen, Datentypen, ... 
int i1;  // Deklaration
i1 = 100; // Initialisierung
int i2 = 200;  // Deklaration und Initialisierung
i3 = 300; // Initialisierung -> Fehler -> Compilezeit
int i4; // Deklaration
int i5 = 500.00;  // Deklaration und Initialisierung
i1 = i1 * i2; // Zuweisung
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
i1 = i1 * i2; 
i1 = 100; 
System.out.println(i1 + 0); 
System.out.println(i1 - 0); 
System.out.println(i1 * 0); 
System.out.println(i1 / 0); // -> Fehler -> Laufzeit
double d1 = 100.00; // Deklaration und Initialisierung
double d2 = 200; // Deklaration und Initialisierung
char c1 = 'a';  // Deklaration und Initialisierung
System.out.println(c1);  
char c2 = '\n'; // Deklaration und Initialisierung
System.out.println(c2); 
char c3 = "a"; // Deklaration und Initialisierung -> Fehler -> CompileZeit
System.out.println(c3); 
char c4 = 'ab'; // Deklaration und Initialsierung -> Fehler -> CompileZeit
System.out.println(c4); 
char c5 = 'a' + 'b'; // Deklaration und Initialisierung
System.out.println(c5); 
i1 = 'a' + 'b'; // Zuweisung
System.out.println(i1); 
boolean b1 = true; // Deklaration und Initialisierung
boolean b2 = 2==4;  // Deklaration und Initialsierung
boolean b3 = 0;  // Deklaration und Initialiserung -> Fehler -> CompileZeit
boolean b4 = b1 & b2; // Deklaration und Initialiserung
boolean b5 = b1 + b2; // Deklaration und Initialisierung -> Fehler -> CompileZeit
}
```
## Aufgabe A2
- Ich würde long verwenden wenn ich bereits zur Entwicklungszeit weiß, dass die in der Variable gespeicherten Werte die Gültigkeitsbereiche von int übersteigen
- wenn ich exttrem kleine Werte speichern möchte, oder direkt auf bit-ebene operieren möchte
- wenn ich mit kommastellen arbeiten möchte
- wenn ich ein einzelnes Zeichen speichern möchte

