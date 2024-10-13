package de.thws.l15uebung.unternehmen;

public class Angestellter {
    String nachname, vorname, id,geburtsdatum;
    double grundgehalt, gehaltsfaktor, gehalt;

    public Angestellter( String nachname, String vorname, String id, String geburtsdatum, double grundgehalt){
        this.nachname=nachname;
        this.vorname=vorname;
        this.id=id;
        this.geburtsdatum=geburtsdatum;
        this.grundgehalt=grundgehalt;
        this.gehaltsfaktor=1.0;
        this.gehalt = this.grundgehalt * this.gehaltsfaktor;
    }

    public double getGehaltsfaktor(){
        return this.gehaltsfaktor;
    }

    public void setGehaltsfaktor(){
        this.gehaltsfaktor=gehaltsfaktor;
    }

}
