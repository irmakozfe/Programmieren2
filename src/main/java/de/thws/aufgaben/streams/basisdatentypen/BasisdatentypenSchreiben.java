package de.thws.aufgaben.streams.basisdatentypen;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.*;

public class BasisdatentypenSchreiben {
public void doubleSchreiben(double[] doublee, String filename) throws IOException {

    try(
    FileOutputStream fos = new FileOutputStream(filename);
    DataOutputStream dos = new DataOutputStream(fos);
    ) {
        for (int i = 0; i < doublee.length; i++) {
            dos.writeDouble(doublee[i]);
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }

}
}
