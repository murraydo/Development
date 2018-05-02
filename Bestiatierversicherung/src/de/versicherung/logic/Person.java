package de.versicherung.logic;

/**
 *
 * @author Murat Vatandas
 */
public class Person {
    private int personId;
    private String vorname;
    private String nachname;
    private String strasse;
    private String plz;
    private String ort;
    private String telefon;
    private int hatAgbGelesen;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    public int getHatAgbGelesen() {
        return hatAgbGelesen;
    }

    public void setHatAgbGelesen(int hatAgbGelesen) {
        this.hatAgbGelesen = hatAgbGelesen;
    }
    
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
     @Override
    public String toString(){
        return "######################## Bestia Tierversicherung ##################################################" +"\n"
                + "Vorname: " + this.getVorname() + "\n"
                + "Nachname " + this.getNachname() + "\n" 
                + "Strasse: " + this.getStrasse() + "\n"
                + "Wohnort: " + this.getOrt() + "\n"
                + "Telefonnummer: " + this.getTelefon()+ "\n"
                + "Einverständiserklärung AGB" + this.hatAgbGelesen;
    }
}
