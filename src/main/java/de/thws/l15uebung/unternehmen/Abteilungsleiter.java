package de.thws.l15uebung.unternehmen;

public class Abteilungsleiter extends Angestellter {

    public Abteilungsleiter( String nachname, String vorname, String id, String geburtsdatum, double grundgehalt){
        super(nachname, vorname, id, geburtsdatum, grundgehalt);
        this.gehaltsfaktor = 2.0;
    }
    public void befoerdern(Angestellter ang){
        ang.gehaltsfaktor  *= 1.10;
        System.out.println(ang + "wurde befoerdert!");
    }

}
