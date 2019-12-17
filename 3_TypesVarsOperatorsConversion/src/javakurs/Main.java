/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package javakurs;

/**
 * @author Alexander Mack (github.com/alxmck)
 */
public class Main {

    public static void main(String[] args) {
        
        // Variablen sind "Container", in denen Werte gespeichert werden koennen:
        
        String sTextVariable = "Uh ist heute ein schoener Tag!";
        
        // Anschliessend kann die Variable z.B. an die println Funktion weitergegeben werden:
        
        System.out.println("Hier ist der Variableninhalt:");
        System.out.println(sTextVariable);
        System.out.println("-------");
        
        // Das ganze geht auch in einer Zeile:
        
        System.out.println("Hier ist der Variableninhalt (2):\n" + sTextVariable + "\n-----");
        
        // Einige Basistypen sind:
        
        // boolean: Koennen die Werte true (= wahr) oder false (= falsch) enthalten
        boolean bBoolVariable = true;
        
        System.out.println("Die boolean Variable hat den Wert: " + bBoolVariable);
        
        // float: Werden zum Speichern von Fliesskommazahlen verwendet. 
        float fFloatVariable = 0.80f; // Achtung: wird hier ein Wert zugewiesen, ist ein "f" an die Zahl anzuhaengen!
                                      
        System.out.println("Die float Variable hat den Wert: " + fFloatVariable);
        
        // int: Integer sind Variablen fuer das Speichern von Ganzzahlen mit Werten zwischen -2147483648 to 2147483647
        int iIntVariable = 16;
        
        System.out.println("Die int Variable hat den Wert: " + iIntVariable);
        
        // Natuerlich koennen die Werte sich auch veraendern:
        
        iIntVariable = -50; // int kann auch negative Zahlenwerte speichern. 
        
        System.out.println("Huch, der int hat sich veraendert: " + iIntVariable);
        
        
        // long: Speichern genauso Ganzzahlen. Nur mit einem groesseren Wertebereich:  -9223372036854775807 and 9223372036854775808 
        long lLongVariable = 65;
        
        System.out.println("Die long Variable hat den Wert: " + lLongVariable); 
        
        // Das ist noch nicht alles. 
        // Variablen sind haeufig Teil von Berechnungen bzw. werden in Algorithmen verwendet.
        
        int iLaenge = 3;
        int iBreite = 3;
        int iFlaeche = iLaenge * iBreite;
        
        System.out.println("Die Quadratmeter der Wohnung sind " + iFlaeche + "qm. Koennte eng werden...");
        
        // Arithmetischen Operatoren werden fuer Berechnungen eingesetzt:
        
        int iDiff = 3 - 30; // Substrahieren
        System.out.println("Differenz: " + iDiff);
        
        int iSum = 3 + 30; // Addieren
        System.out.println("Summe: " + iSum);
        
        int iProd = 3 * 30; // Multiplizieren
        System.out.println("Produkt: " + iProd);
        
        int iQuot = 30 / 3; // Dividieren
        System.out.println("Quotient: " + iQuot);
        
        int iMod = 12 % 5; // Modulo Operator
        System.out.println("Restwert: " + iMod);
        
        
        // Und man kann Variablen auch umwandeln, d.h. konvertieren:
        
        String sIntToString = String.valueOf(iMod);
        System.out.println("Die Variable iMod wurde in eine String Variable konvertiert: " + sIntToString);
        
        // Es gibt auch andere Moeglichkeiten Variablen zu konvertieren.
        // z.B. int zu string
        sIntToString = Integer.toString(iMod);
        System.out.println("Die Variable iMod wurde in eine String Variable konvertiert (2): " + sIntToString);
        
        // oder long zu string
        String sLongToString = Long.toString(lLongVariable);
        System.out.println("Wert von sLongToString: " + sLongToString);
        
        // oder float zu string
        String sFloatToString = Float.toString(fFloatVariable);
        System.out.println("Wert von sFloatToString: " + sFloatToString);
        
        // Das geht auch in die andere Richtung:
        
        // einen string in einen int
        iMod = Integer.parseInt(sIntToString);
        System.out.println("Wert von iMod: " + iMod);
        
        // einen string in einen long
        lLongVariable = Long.parseLong(sLongToString);
        System.out.println("Wert von lLongVariable: " + lLongVariable);
        
        // einen string in einen float
        fFloatVariable = Float.parseFloat(sFloatToString);
        System.out.println("Wert von fFloatVariable: " + fFloatVariable);
        
        
    }
    
}
