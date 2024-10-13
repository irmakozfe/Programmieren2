package de.thws.l16uebung.deneme.schach;

import de.thws.l16uebung.schach.Brett;
import de.thws.l16uebung.schach.LaeuferImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrettTest {

    @Test
    public void testBrett() {
        Brett brett1 = new LaeuferImpl(3, 5).gibErlaubteFelder();
        Brett brett2 = new LaeuferImpl(6, 7).gibErlaubteFelder();

        Brett kombiniert = brett1.kombiniere(brett2);

        int[][] control = {
                {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}, {7, 8},
                {5,8}, {6,7},{7,6},{8,5},
                {1,7},{2,6},{3,5},{4,4},{5,3},{6,2},{7,1},
                {1,3},{2,4},{3,5},{4,6},{5,7},{6,8}


        };

        Brett exp = new Brett();
        for (int i = 0; i < control.length; i++){
            exp.markiereFeld(control[i][0], control[i][1]);
        }

        for(int i=1 ; i <=8 ; i++){
            for(int j= 1; j <= 8; j++){
                assertEquals(exp.gibFeld(i,j), kombiniert.gibFeld(i,j));
            }
        }
    }
}



