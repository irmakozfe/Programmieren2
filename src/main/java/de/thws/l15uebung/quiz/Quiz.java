package de.thws.l15uebung.quiz;

public class Quiz {
        Question[] question;

        public Quiz(Question[] question){
            this.question = question;
        }

        public void printQuiz(){
            for(int i = 0; i < question.length ; i++){
                question[i].generateQuestion();
            }
        }
}
