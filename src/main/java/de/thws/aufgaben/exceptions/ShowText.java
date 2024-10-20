package de.thws.aufgaben.exceptions;

public class ShowText {
    public static void showText(String text) throws MyException{
        if(text.contains("final")){
            throw new MyException("Java is watching you!");
        }else{
            System.out.print(text);
        }
    }
}
