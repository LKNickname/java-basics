/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package javakurs;

import javakurs.util.invoice.*;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ohne import
        System.out.println("Mehrwertsteuer basierend auf Nettopreis: " + javakurs.util.invoice.SteuerCalc.getTaxByNetPrice(100));
        
        // Mit import
        System.out.println("Mehrwertsteuer basierend auf Nettopreis: " + SteuerCalc.getTaxByNetPrice(100));
        
    }
    
}
