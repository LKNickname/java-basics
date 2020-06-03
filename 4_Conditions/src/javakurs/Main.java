/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package javakurs;

/**
 * @author Alexander Mack (github.com/alxmck)
 */
public class Main {

    public static void main(String[] args) {
        
        // In den Projekten 1 bis 3 wurden folgende Themen beschrieben:
        // - Textausgabe
        // - Kommentare
        // - Variablen, Datentypen und Konvertierung
        
        // In diesem Abschnitt sollen die Programme ihre ersten Logikelemente enthalten: Bedingungen!
        // Mit Bedingungen koennen Programmablaeufe gesteuert werden:
        
        int iAutoMax = 30;
                
        System.out.println("Die maximale Geschwindkeit ist...");
        if (iAutoMax == 30) { 
            // Wenn iAutoMax den Wert 30 hat, dann fuehre die
            // Anweisungen im Codeblock zwischen den {} aus..
            System.out.println("sehr langsam. :-/");
        } 
        
        
        // Bedingungen koennen auch die Struktur wenn.. dann.. sonst.. haben
        if (iAutoMax == 350) {
            System.out.println("sehr schnell!");
        } else {
            System.out.println("Nein. Leider immer noch nicht schnell genug.");
        }
        
        // Bedingungen werden typischerweise mit relationalen Operatoren ueberprueft:
        
        // if (a == b) {..       Prüft ob die Werte von a und b gleich sind
        // if (a != b) {..       Prüft ob die Werte von a und b ungleich sind
        // if (a > b) {..       Prüft ob der Wert von a groesser b ist
        // if (a < b) {..       Prüft ob der Wert von a kleiner b ist
        // if (a >= b) {..       Prüft ob der Wert von a groesser gleich b ist
        // if (a <= b) {..       Prüft ob der Wert von a kleiner gleich b ist
        
        // Zudem koennen Bedingungen noch weiter verschachtelt werden:
        
        int iAlter = 30;
        if (iAlter < 18) {
            System.out.println("Oh, da darf jemand offziell noch kein Auto fahren.");
        } else if (iAlter > 65) { // Hier wurde eine zweite Bedingung eingebaut. Sie wird nur geprueft, wenn die erste nicht (!) zutrifft.
            System.out.println("Rente ich komme!");
        } else { // Treffen alle vorherigen Bedingungen nicht (!) zu, greift die else. 
            
            System.out.println("Irgendwas zwischen 18 und 65...");
            
            // Innerhalb der geschweiften Klammern der else {....}
            // Koennen weitere Bedinungen ueberprueft und die Ausfuehrung von Quellcode gesteuert werden...
            if (iAlter < 50) {
                
                System.out.println("Oh. Kleiner 50. Wir kommen naeher!");
                
                // Das kann man seeeehr weit treiben.
                // Aber Achtung: je tiefer verschachtelt wird, desto schlechter ist die Lesbarkeit vom Quellcode.
                if (iAlter < 31) {
                    System.out.println("Zwischen 18 und 30. Sehr fein.");
                } else {
                    System.out.println("Offensichtlich zwischen 31 und 49.");
                }
                
            } else {
                System.out.println("Jetzt muss es zwischen 50 und 65 sein.");
            }
            
        }
        
        // Etwas in dieser Richtung funktioniert auch:
        if (iAlter < 90) {
            if (iAlter < 80) {
                if (iAlter < 70) {
                    if (iAlter < 60) {
                        // .... 
                        // Man kann schon sehen, das wuerde Programmierer auf Dauer in den Wahnsinn treiben. 
                    }
                }
            }
        }
        
        // Sinnvoller ist es, die Bedingungen mit logischen Operatoren zu kombinieren:
        
        // a && b   Logisches UND: Bedingung a UND Bedingung b muessen wahr sein
        // a || b   Logisches ODER: Bedingung a ODER Bedingung b muss wahr sein (oder beide)
        // !a   Logisches NOT: Dreht eine Bedingung um (!Falsch == Wahr)
        
        if (iAlter > 10 && iAlter < 40) {
            System.out.println("Das Alter liegt zwischen 10 und 40");
        }
        
        if (iAlter == 30 || iAlter == 40) {
            System.out.println("Das Alter ist 30 oder 40.");
        }
        
        if (!(iAlter == 60)) { // Die Bedingung wurde nochmal geklammert. Damit versteht Java, worauf das ! bezogen ist.
            System.out.println("Das Alter ist NICHT 60.");
        }
        
        // Kombinationen sind ebenfalls denkbar:
        
        if ((!(iAlter == 60)) && // pruefen ob nicht 60 UND
                iAlter < 50 && // Alter < 50 UND
                ((iAlter < 40 && iAlter > 20) // liegt zwischen 39 und 21 ODER 
                ||
                (iAlter < 30 && iAlter > 10)) // zwischen 29 und 11
                ) {
            System.out.println("Das Alter ist nicht 60, ist kleiner als 50 und liegt entweder zwischen 39 und 21 oder zwischen 29 und 11.");
        }
        
        
        // Es gibt noch eine weitere Moeglichkeit Werte zu pruefen:
        
        switch(iAlter) { // Dem switch Befehl wird ein Parameter uebergeben
            case 10: // Dieser Parameter wird dann mit den "case" Befehlen typischerweise auf einen
                        // konkreten Wert ueberprueft. Hier auf 10..
                // Wenn der Wert 10 ist, werden die Befehle bis zum naechsten break; ausgefuert.
                System.out.println("Das Alter ist 10.");
                break;
            case 20:
                System.out.println("Das Alter ist 20.");
                break;
            case 30:
                System.out.println("Das Alter ist 30.");
                break;  
            default:
                // Trifft keiner der case-Pruefungen zu,
                // werden die Anwendungen nach dem "default:" ausgefuehrt.
                System.out.println("Das Alter ist irgendwas anderes.");
        }
        
        
    }
    
}
