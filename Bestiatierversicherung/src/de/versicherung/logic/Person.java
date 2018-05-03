package de.versicherung.logic;

/**
 *
 * @author Murat Vatandas
 */
public class Person {
    private int personenId;
    private String vorname;
    private String nachname;
    private String strasse;
    private String plz;
    private String ort;
    private String telefon;
    private boolean hatAgbGelesen;
    
    // Getter und Setter 

    public int getPersonenId() {
        return personenId;
    }

    public void setPersonenId(int personenId) {
        this.personenId = personenId;
    }

    
    
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
    
    public boolean getHatAgbGelesen() {
        return hatAgbGelesen;
    }

    public void setHatAgbGelesen(boolean hatAgbGelesen) {
        this.hatAgbGelesen = hatAgbGelesen;
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
