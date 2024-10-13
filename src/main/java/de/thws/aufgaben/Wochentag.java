package de.thws.aufgaben;

public class Wochentag {

    public enum Wochentage{
        Montag, Diesnstag, Mittwoch, Donnerstag, Freitag, Samstag, Sonntag
    }

    public static void main(String[]  args){
        Wochentage tag = Wochentage.Freitag;
        System.out.println(Wochentage.values()[(tag.ordinal() + 5) % 7]);

        for(Wochentage tag1 : Wochentage.values()){
        System.out.println(tag1);
    }}
}
