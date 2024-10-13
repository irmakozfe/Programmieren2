package de.thws.aufgaben;

import java.util.Scanner;

public class SwitchAusdruckMitEnum {
    public enum Woche{

            Montag, Diesnstag, Mittwoch, Donnerstag, Freitag, Samstag, Sonntag

    }
    public static boolean istWochenende(Woche tag){
        return switch(tag){
            case Montag, Diesnstag, Mittwoch, Donnerstag, Freitag -> false;
            case Samstag, Sonntag -> true ;
        };
    }

    public static void main(String[] args){
        String eingabe = new Scanner(System.in).nextLine();
        Woche w = Woche.valueOf(eingabe);
        System.out.println(istWochenende(w));

    }
}
