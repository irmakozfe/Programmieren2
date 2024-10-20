package de.thws.aufgaben.streams;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.*;

public class CFileWriter implements Closeable, Flushable {
    private BufferedWriter writer;

    public CFileWriter(String path) throws IOException{
        this.writer = new BufferedWriter(new FileWriter(path));
    }

    public void writeLine(String line) throws IOException{
        writer.write(line);
        writer.newLine();
    }

    @Override
    public void flush() throws IOException{
        writer.flush();
    }

    @Override
    public void close() throws IOException{
        if(writer != null){
            writer.close();
        }
    }



}
