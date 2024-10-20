package de.thws.aufgaben.streams.textdateienlesen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextSchreiben {

    public static void textSchreiben(String text, String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(text);

        bw.close();
    }
}
