/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package javakurs;

import java.util.regex.Pattern;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String sEingabe = "123";
        if (Pattern.matches("[0-9]+", sEingabe)) {
            System.out.println("Matches");
        } else {
            System.out.println("Not matching");
        }
        
        String sTexteingabe = null;
        try {
            System.out.println("Stringlaenge: " + sTexteingabe.length());
        } catch (Exception e) {
            System.out.println("Fehler: " + e.toString());
        }
        
        int iZahl = 2;
        
        try {
            
            if (iZahl == 0) {
                System.out.println("Stringlaenge: " + sTexteingabe.length());
            } else {
                throw new TestException();
            }
            
        } catch (TestException e) {
            System.out.println("Fehler: " + e.toString());
        } catch (Exception e) {
            System.out.println("Fehler: " + e.toString());
        }
        
        try {
            
            System.out.println("Vor Exception..");
            System.out.println("Stringlaenge: " + sTexteingabe.length());
            System.out.println("Nach Exception..");
            
            
        } catch (Exception e) {
            System.out.println("Fehler: " + e.toString());
        } finally {
            System.out.println("Finally Anweisungen");
        }
        
    }
    
}
