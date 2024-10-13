package de.thws.l15uebung.quiz;

public class TextFragen extends Question {
    public TextFragen(String text){
        super(text);
    }

    @Override
    public void generateQuestion() {
        System.out.println(text);
        System.out.println("Antwort:" + "\n\n");
    }
}
