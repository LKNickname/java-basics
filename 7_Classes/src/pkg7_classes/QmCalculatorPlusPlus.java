/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package pkg7_classes;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class QmCalculatorPlusPlus extends QmCalculatorPlus implements Schnittstelle {
    
    // Konstanten:
    // (public/private) static final TYPE NAME = VALUE;
    
    public static final int FAKTOR_CM_M = 100;
    
    QmCalculatorPlusPlus() {
        
    }
    
    public int getVolumenInCm() {
        
        // 1 mtr = 100cm
        int iHoeheCm = getHoehe() * FAKTOR_CM_M;
        int iBreiteCm = getBreite() * FAKTOR_CM_M;
        int iLaengeCm = getHoehe() * FAKTOR_CM_M;
        
        int iVolCm = iHoeheCm * iBreiteCm * iLaengeCm;
        
        return iVolCm;
        
    }
    
}
