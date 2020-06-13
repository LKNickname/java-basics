/*
 *  Written by Alexander Mack (github.com/alxmck). Have fun using the code where ever you want.
 */
package javakurs;

/**
 *
 * @author Alexander Mack (github.com/alxmck)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Anwendung "cmd"
        
        // Rechte Maustaste auf Projekt -> Properties -> Sources -> Project Folder
        // in cmd -> cd C:\Users\NAME\Desktop\java-basics\12_CommandLineStart
        
        // "dir" zum Anzeigen der Dateien
        // cd src
        // bis Order von Namespace (hier javakurs) verfuegbar ist
        
        // Weitere cmd-Konsole oeffnen und pruefen, welche Java-Versionen verfuegbar
        // C:\Program Files\Java\
        // dir
        // Testen:
        // "C:\Program Files\Java\jdk1.8.0_111\bin\javac.exe" -version
        
        // Programm compilieren
        // "C:\Program Files\Java\jdk1.8.0_111\bin\javac.exe" javakurs\Main.java
        // Mit "dir javakurs" ueberpruefen, ob .class vorhanden ist
        
        // Jar-File erstellen:
        // "C:\Program Files\Java\jdk1.8.0_111\bin\jar.exe" cmvf ManuManifest.fm MeinProg.jar javakurs\*.class
        
        // Ausfuehren:
        // java -jar MeinProg.jar
        
        // Temporaere Dateien: Main.class und MeinProg.jar 
        
        // Achtung: 
        // - Im Manifest letzte Zeile leer lassen
        // - Es kann nicht "im" Namespace / Package Ordner compiliert werden (im Verzeichnis javakurs und *.class funktioniert nicht)
        
        // .jar = Zip-File aller benoetigten Klassen inkl. Einstiegspunkt. Ist einfacher auszuliefern und zu starten
        // .class = Bytecode, kann auch direkt ausgefuehrt werden (man muss im Verzeichnis "src" sein):
        //          java javakurs.Main a b c
        
        // Ubuntu
        // via cd ins Verzeichnis
        // "ls -l" zum Anzeigen der Dateien
        // javac Main.java zum compilieren
        // java Main zum ausfuehren
        
        System.out.println("Hallo, das ist ein kleines Testprogramm!");
        
        for (int ii = 0; ii < args.length; ii++) {
            System.out.println(args[ii]);
        } 
        
        
    }
    
}
