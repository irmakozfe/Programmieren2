package de.thws.l15uebung.person;

public class Professor extends Person{

    public Professor(String fach){
        super(fach);
    }

    @Override
    public String gibTaetigkeitAus(){
        return "Der Professor unterrichtet das Fach " + fach + ".";
    }
}
