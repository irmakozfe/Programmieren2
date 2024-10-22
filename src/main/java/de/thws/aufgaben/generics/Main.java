package de.thws.aufgaben.generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> printer2 = new Printer<>(23.2);
        printer2.print();

        Printer<String> printer3 =new Printer<>("Java");
        printer3.print();

        shout(4, "uppss");



    }
    private static <T,V> void shout(T thing,V otherthing){
        System.out.println(thing + "!!! " + otherthing);
    }
}
