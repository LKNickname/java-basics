/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package javakurs.util.invoice;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class SteuerCalc {
    
    /**
     * Berechnet die MwSt basierend auf dem Nettopreis
     * @param iNettoPreis 
     */
    public static int getTaxByNetPrice(int iNettoPreis) {
        
        double dErgebnis = iNettoPreis * 0.19;
        int iErgebnis = (int) dErgebnis;
        return iErgebnis;
                 
    } 
    
    
}
