package de.thws.l15uebung.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Student s = new Student("Programmieren");
    Professor pr= new Professor("Programmieren");

    @Test
    public void testFach(){
        assertEquals("Programmieren", s.fach );
        assertEquals("Programmieren", pr.fach );
    }

    @Test
    public void gibTaetigkeitAus(){
        assertEquals("Der Student besucht das Fach " + s.fach + ".", s.gibTaetigkeitAus());
        assertEquals("Der Professor unterrichtet das Fach " + pr.fach + ".", pr.gibTaetigkeitAus());
    }

    @Test
    public void testMain(){
        Person[] person = new Person[3];
        person[1]= new Professor("Programmieren");
        person[2] = new Student("Programmieren");
        String exp1= "Der Student besucht das Fach Programmieren.";
        String exp2= "Der Professor unterrichtet das Fach Programmieren.";

        assertEquals(exp1, person[2].gibTaetigkeitAus());
        assertEquals(exp2, person[1].gibTaetigkeitAus());



    }



}