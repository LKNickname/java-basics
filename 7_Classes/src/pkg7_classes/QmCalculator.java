/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package pkg7_classes;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class QmCalculator {
    
    private int miLaenge;
    private int miBreite;
    
    QmCalculator() {
        // Defaultwerte im Konstruktor setzen
        miLaenge = 10;
        miBreite = 10;
    }
    
    // Getter / Setter zum Aendern der Member
    public void setLaenge(int iLaenge) {
        miLaenge = iLaenge;
    }
    
    public int getLaenge() {
        return miLaenge;
    }
    
    public void setBreite(int iBreite) {
        miBreite = iBreite;
    }
    
    public int getBreite() {
        return miBreite;
    }
    
    public String getQuadratmeterTextInfo() {
        String sErgebnis = "Anzahl der Quadratmeter: " + calculateQm(miLaenge, miBreite);
        return sErgebnis;
    }
    
    
    // Statische Methoden
    /**
     * Kommentar fuer die Methode
     * @param iLaenge Beschreibung Parameter iLaenge
     * @param iBreite Beschreibung Parameter iBreite
     * @return Beschreibung Ergebnis
     */
    private static int calculateQm(int iLaenge, int iBreite) {
        return iLaenge * iLaenge;
    }
    
    
    
    
    
}
