package de.thws.aufgaben.streams.basisdatentypen;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class BasisdatenLesen {
    public double[] doubleLesen(String filename) throws IOException, EOFException {
        double[] array = new double[100];

        try(
                FileInputStream fis = new FileInputStream(filename);
                DataInputStream dis = new DataInputStream(fis);
        ){
            for(int i = 0; i < array.length ; i++){
               array[i]= dis.readDouble();
            }
        }
        return array;
    }
}
