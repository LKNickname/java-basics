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
        
        // In Programmen kommt es häufig vor, dass der gleiche Teil an Anweisungen mehrmals ausgeführt werden muss.
        // Der Programmierer könnte natürlich einfach den entsprechenden Quellcode mehrmals in die Anwendung aufnehmen (Copy&Paste).
        // Das würde jedoch die Wart- und Erweiterbarkeit des Programms zum einen stark einschränken, weil jede Änderung immer in mehreren 
        // Quellcodezeilen durchgeführt werden müsste.
        // Zum anderen weiß der Programmierer beim Entwickeln der Anwendung häufig noch gar nicht, wie oft der entsprechende Code ausgeführt
        // werden muss, um den Zweck der Anwendung zu erfüllen.
        
        // Abhilfe schaffen hier Schleifen. Schleifen sind Teil von Programmiersprachen und ermöglichen es dem Programmierer, 
        // einen bestimmten Teil der Anwendung immer wieder auszuführen. So lange, bis eine Abbruchbedingung erfüllt ist.
        
        // Die beiden "Klassiker" unter den Schleifen sind die for- und die while-Schleife.
        
        // Jede while Schleife beginnt mit dem Schlüsselwort while. Dann folgt eine Bedingungen in Klammern. Die Schleife wird solange ausgeführt, wie diese Bedingung
        // ein "true" liefert. D.h. solange diese Bedingung wahr ist. 
        // Die Anweisungen, die mehrmals ausgeführt werden sollen, folgen dann in geschweiften Klammern:
        
        // Beispiel: Wir erstellen eine Variable und weisen ihr den Wert 1 zu:
        int iZahl = 1;
        
        // Dann möchten wir bestimmte Anweisungen ausführen, solange der Wert der Variable
        // kleiner 5 ist:
        
        System.out.println("Anweisungen vor der While-Schleife..");
        
        while(iZahl < 5) {
            
            // Die Anweisung soll hier nur die Ausgabe des Zahlenwerts sein:
            System.out.println("Zahl: " + iZahl);
            
            // Achtung: Wir müssen den Wert der Variable natürlich so ändern, dass die Bedingung 
            // der Schleife irgendwann erfüllt ist. Sonst würde die Schleife endlos lange laufen - und das Programm eventuell zum Absturz bringen.
            iZahl = iZahl + 1;
            
        }
        
        System.out.println("Anweisungen nach der While-Schleife..");
        
        
        
        // Eine weitere häufig verwendete Schleife ist die for-Schleife.
        
        // Eine for-Schleife beginnt mit dem Schlüsselwort for. Anstatt einer Bedingungen folgen innerhalb 
        // der Klammern die Initialisierung der Schleife, die Bedingung der Schleife und ein "Fortschaltausdruck" um die Zählervariable zu verändern.
        // Am besten versteht man eine for-Schleife anhand eines kleinen Beispiels:
        
        System.out.println("Anweisungen vor der for-Schleife..");
        
        for(int ii = 0; ii < 4; ii++) {
            
            // Erklärung zu den Teilen innerhalb der Klammern:
            // - Die Teile werden durch ein Semikolon (;) voneinander getrennt 
            // - Die Initialisierung ist hier "int ii = 0". Vor Beginn der Schleife wird dieser Teil ausgeführt. Hier wird eine Variable mit dem 
            //   Namen ii erstellt und der Wert 0 zugewiesen.
            // - Anschließend wird die Bedingung der Schleife festgelegt. Hier lautet diese "ii < 4". Das bedeutet, dass die Anweisungen innerhalb +
            //   der geschweiften Klammern ausgeführt werden sollen, solange die Variable einen Wert kleiner 4 hat.
            // - Der dritte Teil ist der Fortschaltausdruck. Im Beispiel ist dieser "ii++". Dieser führt dazu, dass die Variable ii *nach* jedem 
            //   Durchlauf um 1 erhöht wird. Achtung: Die for-Schleife beginnt immer mit dem Wert, der in der Initialisierung angegeben wurde.
            
            System.out.println("Der Wert von ii: " + ii);
            
        }
        
        // Eine kleine Anmerkung zu den Zählervariablen für die for-Schleife:
        // Die Namen der Variablen können natürlich frei gewählt werden. Für die Funktionalitaet spielt es keine Rolle
        // ob die Variable i, ii oder hallodasisteinsprechendervariablenname genannt wird.
        // Mit dem Ziel der besseren Lesbarkeit hat es sich jedoch als "Quasi-Standard" durchgesetzt, für die äußerste Schleife i oder ii zu verwenden.
        // Zur Verschachtelung später mehr. Hier nur der Hinweis, dass dann für jede weitere Schleife dem Alphabet gefolgt wird: j bzw jj, k bzw. kk, l bzw. ll, usw.
        // In Lehrbüchern findet man meist die einfache Version (i, j, k, usw.)
        // In der Praxis hat es sich jedoch bewährt, mit doppelten Buchstaben zu arbeiten (ii, jj, kk, usw.). Das hat zum einen den Vorteil, dass 
        // man sofort sieht, dass es sich um die Zählervariable einer for-Schleife handelt. Zum anderen kann man besser nach Variablen suchen. 
        // Einfach mal ausprobieren und diesen Text nach "i" oder "ii" durchsuchen :-)
        
        System.out.println("Anweisungen nach der for-Schleife..");
        
        
        
        // Eine weitere Form der while-Schleife ist die do-while-Schleife. Diese funktioniert genauso wie die while-Schleife - nur kommt hier die
        // Schleifenbedingung erst am Ende. Die Anweisungen innerhalb der Schleife werden immer mindestens einmal ausgeführt!
        
        System.out.println("Anweisungen vor der do-while-Schleife..");
        do {
            System.out.println("do-while Ausgabe.. Obwohl 10 nicht größer als 100 ist.");
        } while (10 > 100);
        System.out.println("Anweisungen nach der do-while-Schleife..");
        
        
        
        // Wie weiter oben bereits angedeutet, können Schleifen auch verschachtelt werden.
        // Bei verschachteltem Quellcode ist auf ein sauberes Einrücken der Zeilen zu achten um den Quellcode lesbar zu halten. 
        
        for(int ii = 0; ii < 5; ii++) {
            
            System.out.println("for ii ausgabe: " + ii);
            
            for(int jj = 0; jj < 5; jj++) {
            
                System.out.println("for jj ausgabe: " + jj);
                
                int iZaehler = 0; 
                while(iZaehler < 3) {
                    
                    System.out.println("while ausgabe: " + iZaehler);
                    iZaehler++; // Achtung: bei der while-Schleife darauf achten, dass die
                                // Schleife irgendwann beendet wird.
                    
                }
                
            }
            
        } // <-- wenn die Einrückung passt, kann man schnell sehen, dass 
          // hier das Ende des Anweisungsblocks der äußersten for-Schleife ist. 
        
        
        // Das Verhalten von Schleifen kann auch innerhalb der Schleifen beeinflusst werden.
        // Mithilfe von "continue" können die restlichen Anweisungen im aktuellen Schleifendurchlauf übersprungen werden. "break" beendet die Schleife. 
        
        // Beispiel für continue:
        
        for(int ii = 0; ii < 10; ii++) {
            if (ii == 3) { 
                // Wenn die Zaehlvariable ii den Wert 3 enthaelt, sollen die Anweisungen in der Schleife
                // fuer diesen Durchlauf nicht ausgefuehrt werden.
                continue;
            }
            
            // Eine kuerzere Schreibweise:
            if (ii == 5) continue; // Wenn nach der Bedingung nur eine Anweisung folgt, kann auf die geschweiften Klammern {} verzichtet werden.
            
            System.out.println("Bsp. continue: " + ii);
            
        }
        
        
        // Beispiel für break:
          
        for(int ii = 0; ii < 10; ii++) {
            
            if (ii == 3) {
                // Sobald die Variable ii den Wert 3 enthaelt
                // moechten wir die Schleife beenden.
                break;
            }
            
            System.out.println("Bsp. break: " + ii);
        }
          
    }
    
}
