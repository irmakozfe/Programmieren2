package de.thws.aufgaben.interfaces;

public class Zoo {
    public static void main(String[] args){
        Bird bird =new Bird();
        bird.eat();
        System.out.println(bird.sound());
        bird.fly();

        Dog dog = new Dog();
        dog.eat();
        System.out.println(dog.sound());
    }
}
