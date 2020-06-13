/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package javakurs;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
        
            // Vgl. StdBib S. 800ff.

            String sJson = "{'name':'Max','Alter':99, 'Wohnort' : {'PLZ':'89898', 'name':'Wunschburg'}}";

            // JavaScript Code erstellen
            String sJsCode = "oObj = " + sJson + ";";

            // JS Code ausfuehren
            ScriptEngine oJsEngine = new ScriptEngineManager().getEngineByName("JavaScript");
            oJsEngine.eval(sJsCode);
        
            // Object laden
            JSObject oJsObj = (JSObject) oJsEngine.get("oObj");
            
            
            
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
        
    }
    
}
