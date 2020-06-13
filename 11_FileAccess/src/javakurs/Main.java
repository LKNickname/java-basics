/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package javakurs;

import java.nio.file.*;
import java.nio.charset.*;
import java.io.*;

/**
 * @author Alexander Mack (github.com/alxmck)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            // Vgl Java SE Std Bib S. 612
            
            // Lesen
            
            BufferedReader oReader = Files.newBufferedReader(Paths.get("MeineDatei.txt"),
                                                                StandardCharsets.UTF_8);
            
            String sLine;
            while((sLine = oReader.readLine()) != null) {
                System.out.println(sLine);
            }
            
            oReader = Files.newBufferedReader(Paths.get("MeineDatei.txt"),
                                                                StandardCharsets.ISO_8859_1);
            
            for(String sZeile; (sZeile = oReader.readLine()) != null;) {
                System.out.println(sZeile);
            }
            
            // Schreiben
            
            Writer oWriterObj = Files.newBufferedWriter(Paths.get("NeueDatei.txt"), StandardCharsets.UTF_8);
            
            oWriterObj.write("Eine neue Datei!");
            oWriterObj.write("\n");
            oWriterObj.write("\t\tTextinhalt schreiben");
            oWriterObj.write("\tTextinhalt schreiben;1;2;3");
            oWriterObj.write("\n");
            
            oWriterObj.close();
            
            
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
        
        
    }
    
}
