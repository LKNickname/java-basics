/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package pkg7_classes;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */

public class Main {

    public static void main(String[] args) {
        
        // "Evolution" der Quellcode Organisation
        
        // 1) Einfache Ausgabe
        
        int iHoehe = 10;
        int iBreite = 20;
        int iQm = iHoehe * iBreite;
        System.out.println("Quadratmeter: " + iQm);
        
        // 2) Copy und Paste
        
        int iHoeheA = 11;
        int iBreiteA = 21;
        int iQmA = iHoeheA * iBreiteA;
        System.out.println("QuadratmeterA: " + iQmA);
        
        int iHoeheB = 12;
        int iBreiteB = 22;
        int iQmB = iHoeheB * iBreiteB;
        System.out.println("QuadratmeterB: " + iQmB);
        
        // 3) Funktionen / Methoden:
        System.out.println(calcQm(13,23));
        System.out.println(calcQm(14,24));
        
        // 4) Methoden + Kontext = Klassen 
        // Zugriffsrechte vgl. http://openbook.rheinwerk-verlag.de/javainsel9/javainsel_08_001.htm
        // Naming Convetions vgl. https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
        
        QmCalculator oCalculator = new QmCalculator();
        oCalculator.setBreite(22);
        oCalculator.setLaenge(40);
        System.out.println(oCalculator.getQuadratmeterTextInfo());
        
        oCalculator.setLaenge(55);
        System.out.println(oCalculator.getQuadratmeterTextInfo());
        
        // 5) Vererbung:
        
        QmCalculatorPlus oCalculatorPlus = new QmCalculatorPlus();
        oCalculatorPlus.setBreite(10);
        oCalculatorPlus.setLaenge(10);
        oCalculatorPlus.setHoehe(10);
        System.out.println(oCalculatorPlus.getVolumnenInfo());
        
        // 6) Schnittstellen:
        
        QmCalculatorPlusPlus oCalculatorPlusPlus = new QmCalculatorPlusPlus();
        oCalculatorPlusPlus.setBreite(10);
        oCalculatorPlusPlus.setLaenge(10);
        oCalculatorPlusPlus.setHoehe(10);
        System.out.println("Volumen in Kubikzentimeter: " + oCalculatorPlusPlus.getVolumenInCm());
        
    }
    
    /**
     * Methode zum Berechnen der Quadratmeter einer Wohnung
     * @param iLaenge Laenge der Flaeche auf dem Plan
     * @param iBreite Breite der Flaeche auf dem Plan
     * @return Infotext mit Quadratmeter Information
     */
    private static String calcQm(int iLaenge, int iBreite) {
        
        int iQm = iLaenge * iBreite;
        String sErgebnis = "Quadratmeter: " + iQm;
        return sErgebnis;
        
    }
    
}
