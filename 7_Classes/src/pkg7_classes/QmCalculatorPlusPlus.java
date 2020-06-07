/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package pkg7_classes;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class QmCalculatorPlusPlus extends QmCalculatorPlus implements Schnittstelle {
    
    QmCalculatorPlusPlus() {
        
    }
    
    public int getVolumenInCm() {
        
        // 1 mtr = 100cm
        int iHoeheCm = getHoehe() * 100;
        int iBreiteCm = getBreite() * 100;
        int iLaengeCm = getHoehe() * 100;
        
        int iVolCm = iHoeheCm * iBreiteCm * iLaengeCm;
        
        return iVolCm;
        
    }
    
}
