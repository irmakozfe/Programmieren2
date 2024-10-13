package de.thws.l15uebung.person;

public class Main {
    public static void main(String[] args){

    Person[] person = new Person[100];

    for(int i = 0; i < person.length ; i++) {
        if(i % 2 == 0){
            person[i] = new Student("Programmieren");
            System.out.println(person[i].gibTaetigkeitAus());
        }else{
            person[i]= new Professor("Programmieren");
            System.out.println(person[i].gibTaetigkeitAus());
        }
    }
    }

}
