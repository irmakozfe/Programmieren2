package de.thws.l15uebung.quiz;

public class MultipleChoiceFragen extends Question {
String[] choices;
    public MultipleChoiceFragen(String text, String[] choices){
        super(text);
        this.choices = choices;
    }

    @Override
    public void generateQuestion() {
        String[] alp = {"A: " , "B: " , "C: " , "D: ", "E: "};
        System.out.println(text);
        System.out.println("Multiple choices:");
        for(int i = 0 ; i < choices.length ; i++){
            System.out.println(alp[i] + choices[i]);
        }
    }
}
