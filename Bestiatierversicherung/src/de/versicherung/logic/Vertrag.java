package de.versicherung.logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Murat Vatandas Datumsformat wird auf "dd.MM.yyyy" gesetzt private
 * Person personDaten private string vsnr private string date private boolean
 * statusVertrag = false; private Tier versichertesTier; private boolean
 * abgeschlossen = flase
 */
public class Vertrag {
    private Person personDaten;
    private int vertragsId; // VertragsId wird automatisch erstellt
    private long personenId =  (long) Math.random() ; // Per random erzeugte Versicherungsnummer, die dem Vertrag hinzugefügt wird
    private Tier versichertesTier;
    private List<Schaden> alleSchaeden = new ArrayList<>();

    public Vertrag() {
    }
    /**
     * Vertrag soll beeinhalten folgende Daten:
     * personenDaten -> Vorname, Nachname -> die Daten werden dem Vertrag hinzugefügt
     * fortlaufende Versicherungsnummer -> inkrementell hochgezählt VertragsId (wird bei der Erstellung des Vertrages im VertragsService automatisch erzeugt);
     * personenId -> wird bei der Erstellung des Vertrages automatsich erzeugt
     * versicherte Tier
    */
    public Vertrag(Person personenDaten, long personenId, Tier versichertesTier) {
        this.personDaten = personDaten;
        this.personenId = personenId;
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
    
    public long getPersonenId() {
        return personenId;
    }

    public void setPersonenId(long personenId) {
        this.personenId = personenId;
    }
    
    public Tier getVersichertesTier() {
        return versichertesTier;
    }

    public void setVersichertesTier(Tier vertrag) {
        this.versichertesTier = vertrag;
    }
    


    @Override
    public String toString() {
        return personDaten + "\n" + "Personen-Identifikationsnummer " + getPersonenId() + "\n"  
                + "Vertragsnummer: " + getVertragsId() + " \n" + "zu versicherndes Tier: " + versichertesTier;

    }
}
