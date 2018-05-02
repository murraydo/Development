package de.versicherung.logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Murat Vatandas
 * Datumsformat wird auf "dd.MM.yyyy" gesetzt
 * private Person personDaten
 * private string vsnr
 * private string date
 * private boolean statusVertrag = false;
 * private Tier versichertesTier;
 * private boolean abgeschlossen = flase
 */

public class Vertrag {

    LocalDate now = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    String formatDateTime = now.format(formatter);
    private Person personDaten;
    private int vertragsId;
    private String vsnr = "123456789";               // Versicherungsnummer
    private String date;   // Beginn des Vertrages
    //private String endeVertrag;     // Ende des Vertrages
    //private double deckungVertrag;  // Welche Art der Versicherung wurde hier ausgewählt( Ohne Selbstbeteiligung, mit 50% Selbsbeteiligung oder mit einer Selbstbeteiligung von 25%)
    private boolean statusVertrag = false;  // Ist der Vertrag aktiv
    //private double praemie;
    private Tier versichertesTier;
    private boolean abgeschlossen = false;
    
    public Vertrag(){
        
    }

    public Vertrag(String vsnr, String beginnVertrag, boolean statusVertrag, Tier versichertesTier) {
        this.personDaten = personDaten;
        this.vsnr = vsnr;
        this.date = beginnVertrag;
        this.versichertesTier = versichertesTier;
    }

    public int getVertragsId() {
        return vertragsId;
    }

    public void setVertragsId(int vertragsId) {
        this.vertragsId = vertragsId;
    }

    
    
    public Person getPersonDaten() {
        return personDaten;
    }

    public void setPersonDaten(Person personDaten) {
        this.personDaten = personDaten;
    }
    
    

    public LocalDate getNow() {
        return now;
    }

    public void setNow(LocalDate now) {
        this.now = now;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public String getFormatDateTime() {
        return formatDateTime;
    }

    public void setFormatDateTime(String formatDateTime) {
        this.formatDateTime = formatDateTime;
    }

    public String getVsnr() {
        return vsnr;
    }

    public void setVsnr(String vsnr) {
        this.vsnr = vsnr;
    }

    public String getBeginnVertrag() {
        return date;
    }

    public void setBeginnVertrag(String beginnVertrag) {
        this.date = beginnVertrag;
    }

    public String getEndeVertrag() {
        return date;
    }

    public void setEndeVertrag(String endeVertrag) {
        this.date = endeVertrag;
    }

    public boolean isStatusVertrag() {
        return statusVertrag;
    }

    public void setStatusVertrag(boolean statusVertrag) {
        this.statusVertrag = statusVertrag;
    }

    public Tier getVersichertesTier() {
        return versichertesTier;
    }

    public void setVersichertesTier(Tier vertrag) {
        this.versichertesTier = vertrag;
    }

    public boolean isAbgeschlossen() {
        return abgeschlossen;
    }

    public void setAbgeschlossen(boolean abgeschlossen) {
        this.abgeschlossen = abgeschlossen;
    }
    @Override
    public String toString(){
        return personDaten + "\n" + "Versicherungsnummer: " + getVsnr() + "\n" + "Vertragsnummer: " + getVertragsId() + " \n" + "zu versicherndes Tier: " + versichertesTier;
        
    }
}
