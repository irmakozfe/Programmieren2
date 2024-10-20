package de.thws.aufgaben.streams.textdateienlesen;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
      String result =  TextLesen.textLesen("C:\\Users\\Irmak\\Desktop\\textdeneme.txt");
      System.out.println(result);
    }
}
