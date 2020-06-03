/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package javakurs;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class Main {

    public static void main(String[] args) {
       
        // In den bisherigen Projekten wurde ausschliesslich mit 
        // Variablen gearbeitet, die *einen* Wert enthalten.
        
        // Beispiel: 
        
        int iVar = 42;
        
        System.out.println("Der Inhalt von iVar ist: " + iVar);
        
        // Haeufig muessen jedoch mehrere Werte "dynamisch" verarbeitet werden.
        // Um mehrere Werte flexibel verarbeiten bzw. fuer den Programmablauf 
        // verwalten zu koennen, bieten sich Arrays an.
        
        // Arrays sind im Prinzip Variablen, in denen mehrere Werte gespeichert werden koennen.
        // Die Deklaration von Arrays aehnelt der Deklaration von Variablen. Zusaetzlich
        // zum Datentyp muessen nur eckige Klammern beim Datentyp "angehaengt" werden:
        
        int[] aWerte; // Das Programm "weiss" jetzt, dass die Variable aWerte ein Array 
                      // mit int-Werten ist.
                     
        // Wir muessen Java jetzt noch mitteilen, wie viele Elemente wir in diesem Array speichern moechten.
        // Das geschieht mithilfe des new Operators.
        
        aWerte = new int[5]; // Das Schluesselwort "new" wird spaeter noch ausfuehrlicher besprochen.
                             // Vorerst reicht es, sich zu merken, dass ein Array-Zugriff ohne vorheriges new 
                             // zu einem Programmabbruch fuehrt. :-)
                             
        // Wenn das Array angelegt und die Groesse festgelegt wurde, koennen wir mithilfe der 
        // eckigen Klammern Werte schreiben oder lesen. Der Index (die Zaehlung) beginnt mit 0.
        aWerte[0] = 11; // Erster Wert (Index = 0)
        aWerte[1] = 22; // Zweiter Wert (Index = 1)
        aWerte[2] = 33; // Dritter Wert ...
        aWerte[3] = 44; // Vierter Wert ...
        aWerte[4] = 55; // Fuenfter Wert (Index = 4)
        
        // Das Auslesen erfolgt ebenfalls mithilfe der eckigen Klammern:
        System.out.println("Wert im dritten Feld: " + aWerte[2]);
        
        // Wenn die Werte schon beim Deklarieren des Arrays bekannt sind, koennen diese auch 
        // gleich belegt werden. Achtung: hier arbeitet man nicht mit eckigen, sondern mit
        // geschweiften Klammern bei der Zuweisung!
        
        int[] aVorbelegt = {101,202,303,404,505}; 
        
        // Der Zugriff erfolgt wieder ueber die eckigen Klammern:
        System.out.println("Wert im vierten Feld: " + aVorbelegt[3]);
        
        // Ueber das Feld "length" kann die Laenge eines Arrays ueberprueft werden. 
        // Was ein Feld genau ist, wird ebenfalls spaeter noch besprochen. Vorerst
        // reicht es zu verstehen, dass man ueber "length" die Anzahl der Elemente
        // eines Arrays abfragen kann.
        
        System.out.println("Das Array aVorbelegt hat uebrigens " + aVorbelegt.length + " Elemente.");
        
        // Mit dieser Information koennen wir die Inhalte bereits mithilfe einer Schleife ausgeben:
        
        for(int ii = 0; ii < aVorbelegt.length; ii++) {
            System.out.println("Vorbelegt Wert auf Index " + ii + ": " + aVorbelegt[ii]);
        }
        
        // Uebrigens gibt es seit Java 5 eine verkuerzte for-Schleife zum Durchlaufen von Arrays.
        // Diese besondere Form der for-Schleife ist die for-each-Schleife.
        // Innerhalb der for-Schleife wird dann nur der Datentyp und der Name der Variable 
        // festgelegt, der die Werte aus dem Array innerhalb der Schleife repraesentiert.
        // Nach einem Doppelpunkt folgt der Name des Arrays.
        
        for(int iBezeichner : aVorbelegt) {
            System.out.println("Wert im Array: " + iBezeichner);
        }
        
        
        // Die bisher besprochenen Arrays (d.h. Arrays als "Datentyp") haben den Nachteil,
        // dass schon beim Programmieren klar sein muss, wie viele Elemente 
        // das entsprechende Array enthalten soll.
        
        // Flexibler sind ArrayList und HashMap. Diese werden spaeter besprochen - wenn klar ist, was Klassen und Methoden sind.
        
        
        
    }
    
}
