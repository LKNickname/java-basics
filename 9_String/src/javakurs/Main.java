/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package javakurs;

import java.util.*;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String sText = " Mit Sturm ist da nichts einzunehmen; Wir müssen uns zur List bequemen. "; // Vgl. Goethe in Faust erster Teil.
        
        // Ausgabe:
        System.out.println("Text: " + sText);
        
        // Laenge abfragen:
        System.out.println("Laenge: " + sText.length());
        
        // Leerzeichen am Anfang und Ende entfernen:
        sText = sText.trim();
        System.out.println("Laenge: " + sText.length());
        
        // Einzelne Zeichen ausgeben:
        for(int ii = 0; ii < sText.length(); ii++) {
            System.out.println("Zeichen an Position " + ii + ": " + sText.charAt(ii));
            if (ii == 5) break;
        }
        
        // Text ersetzen
        sText = "a,b,c,d";
        
        // in eine ArrayList wandeln / splitten
        List<String> aElements = Arrays.asList(sText.split(","));
        
        for(int ii = 0; ii < aElements.size(); ii++) {
            System.out.println("Element: " + aElements.get(ii));
        }
        
        // Teilstring "ausschneiden"
        System.out.println("Vorher: " + sText);
        // Starte bei Position 1 und laenge - 1
        // Achtung: Bei anderen Programmiersprachen zweiter Parameter auch manchmal Laenge des Strings
        sText = sText.substring(1,sText.length() - 1);
        System.out.println("Nachher: " + sText);
        
        sText = "Hallo!";
        System.out.println("Normal: " + sText);
        System.out.println("leise: " + sText.toLowerCase());
        System.out.println("LAUT: " + sText.toUpperCase());
        
        // Text von Konsole einlesen:
        
        System.out.println("Bitte etwas eingeben und mit Enter bestätigen:");
        
        Scanner scanner = new Scanner(System.in);
        String sInput = scanner.nextLine();
        
        System.out.println("Eingabe: " + sInput);
        
    }
    
}
