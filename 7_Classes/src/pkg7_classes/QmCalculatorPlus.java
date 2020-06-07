/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package pkg7_classes;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class QmCalculatorPlus extends QmCalculator {
    
    private int miHoehe;
    
    QmCalculatorPlus() {
        miHoehe = 10;
    }
    
    public void setHoehe(int iHoehe) {
        miHoehe = iHoehe;
    }
    
    public int getHoehe() {
        return miHoehe;
    }
    
    public String getVolumnenInfo() {
        
        int iKubikMtr = getLaenge() * getBreite() * miHoehe;
        return "Volumen in Kubikmeter: " + iKubikMtr;
        
    }
    
}
