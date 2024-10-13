package de.thws.l15uebung.person;

public abstract class Person {
    String fach;

    public Person(String fach){
        this.fach="Programmieren";
    }

    public abstract String gibTaetigkeitAus();

}
