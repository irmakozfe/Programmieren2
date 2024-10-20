package de.thws.aufgaben.streams.textdateienlesen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextLesen {

    public static String textLesen(String filename) throws IOException {
        String ergebnis= "";
        //try {
           FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null){
                ergebnis += line + "\n";
            }
            br.close();

        /*}catch(Exception e){
            System.out.println("Fehler: " + e.getMessage() );
        }
        */
        return ergebnis;
    }
}
