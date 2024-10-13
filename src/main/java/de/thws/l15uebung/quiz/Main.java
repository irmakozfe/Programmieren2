package de.thws.l15uebung.quiz;

public class Main {
    public static void main(String[] args){

        Question q1 = new TextFragen("Was ist die Hauptstadt von Deutschland?");
        String[] s = {"4", "2", "1", "0"};
        Question q2 = new MultipleChoiceFragen("Wie viele Protonen hat ein Wasserstoff-Atom?", s );
        Question[]  questions = {q1, q2};
        Quiz quiz = new Quiz(questions);
        quiz.printQuiz();

    }
}
