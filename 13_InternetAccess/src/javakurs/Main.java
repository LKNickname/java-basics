/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package javakurs;

import java.net.*;
import java.nio.charset.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Vgl. StdBib S. 811ff.
        // Vgl. StdBib S. 818ff.
        
        try {
            
            // HTTP ohne Parameter
            URL oHttpAnfrage = new URL("http://www.alxmck.de/");

            Scanner oHttpScanner = new Scanner(oHttpAnfrage.openStream(), 
                                                StandardCharsets.UTF_8.name());
            
            // System.out.println(oGetScanner.useDelimiter("\\z").next());
            
            String sLine;
            while(oHttpScanner.useDelimiter("\\n").hasNext()) {
                sLine = oHttpScanner.useDelimiter("\\n").next();
                System.out.println("..." + sLine);
            }
            
            // GET Parameter
            
            String sValue = URLEncoder.encode("encoded parameter = toll", StandardCharsets.UTF_8.name());
            String sGetURL = "http://www.alxmck.de/?key=" + sValue;
            
            System.out.println("URL: " + sGetURL);
            
            URL oGetAnfrage = new URL(sGetURL);

            Scanner oGetScanner = new Scanner(oGetAnfrage.openStream(), 
                                                StandardCharsets.UTF_8.name());
            
            // System.out.println(oGetScanner.useDelimiter("\\z").next());
            
            while(oGetScanner.useDelimiter("\\n").hasNext()) {
                sLine = oGetScanner.useDelimiter("\\n").next();
                System.out.println("..." + sLine);
            }
            
            // POST
            
            String sPostParamter = "keyA=" + URLEncoder.encode("1", StandardCharsets.UTF_8.name()) + 
                                    "&" + "keyB=" + URLEncoder.encode("abc", StandardCharsets.UTF_8.name());
            
            URL oPostAnfrage = new URL("http://www.alxmck.de/");
            
            HttpURLConnection oPostConnection = (HttpURLConnection) oPostAnfrage.openConnection();
            
            oPostConnection.setRequestMethod("POST");
            oPostConnection.setDoInput(true);
            oPostConnection.setDoOutput(true);
            oPostConnection.setUseCaches(false);
            oPostConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            oPostConnection.setRequestProperty("Content-Length", String.valueOf(sPostParamter.length()));
            
            // Anfrage senden
            Writer oWriter = new OutputStreamWriter(oPostConnection.getOutputStream());
            oWriter.write(sPostParamter);
            oWriter.flush();
            
            // Antwort laden
            Scanner oPostScanner = new Scanner(oPostConnection.getInputStream());
            
            // System.out.println(oPostScanner.useDelimiter("\\z").next());
            
            while(oPostScanner.useDelimiter("\\n").hasNext()) {
                sLine = oPostScanner.useDelimiter("\\n").next();
                System.out.println("post " + sLine);
            }
                    
        } catch (Exception e) {
            System.out.println("Ups. Fehler: " + e.getMessage());
        }
    }
    
}
