package de.thws.aufgaben.interfaces;

public class Dog extends Animal {

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
    @Override
    public String sound(){
        return "bark bark";
    }

}
