/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 *  Attention: used 3rd party lib - see details http://www.java2s.com/Code/Jar/j/Downloadjsonsimple11jar.htm
 */
package javakurs;

import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 
  
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 

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
            // https://www.geeksforgeeks.org/parse-json-java/
            // http://www.java2s.com/Code/Jar/j/Downloadjsonsimple11jar.htm

            String sJson = "{\"name\":\"Max\",\"alter\":99, \"wohnort\" : {\"plz\":\"89898\", \"name\":\"Wunschburg\"}}";

            // parsing file "JSONExample.json" 
            Object oObj = new JSONParser().parse(sJson); 

            // typecasting obj to JSONObject 
            JSONObject oJsonObj = (JSONObject) oObj; 

            // getting firstName and lastName 
            String sName = (String) oJsonObj.get("name"); 
            System.out.println("name: " + sName);
            
            Map aWohnort = ((Map)oJsonObj.get("wohnort")); 
            System.out.println("name: " + aWohnort.get("name"));
            
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
        
    }
    
}
