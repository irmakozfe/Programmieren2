package de.thws.l15uebung.quiz;

public abstract class Question {
    String text;

    public Question(String text){

        this.text = text;
    }

    public abstract void generateQuestion();
}
