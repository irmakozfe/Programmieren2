package de.thws.aufgaben.interfaces;

public class Bird extends Animal implements Flyable{
    @Override
    public void fly(){
        System.out.println("Bird is flying"); // flyable interfaceini kullanarak icine govde ekledik
    }

    @Override
    public String sound(){
        return "cikcik"; //soyut metotu extend edip icine govde ekledik

    }

    @Override
    public void eat(){
        System.out.println("Bird is eating");
    }


}
