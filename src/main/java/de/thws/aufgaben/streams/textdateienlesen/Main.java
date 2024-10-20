package de.thws.aufgaben.streams.textdateienlesen;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
      String result =  TextLesen.textLesen("C:\\Users\\Irmak\\Desktop\\textdeneme.txt");
      System.out.println(result);

      String string = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren,";
      TextSchreiben.textSchreiben(string, "C:\\Users\\Irmak\\Desktop\\textdeneme.txt");
    }
}
