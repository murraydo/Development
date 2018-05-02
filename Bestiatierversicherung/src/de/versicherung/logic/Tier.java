package de.versicherung.logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Murat Vatandas
 */
public class Tier {
	
	List<Krankheiten> krankheitsListe = new ArrayList<>();
	
		public void addKrankheiten(Krankheiten neueKrankheit) {
	
		if(neueKrankheit.getTyp().equals(this.getClass().getName())  ) {
		krankheitsListe.add(neueKrankheit);
		}
	}

    LocalDate now = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    String formatDateTime = now.format(formatter);
    private String date;
    private String tierArt;
    private String rasse;
    private String haltungsArt;

    public Tier() {
    }
    

    public Tier(String tierArt, String geburtsDatum, String rasse, String haltungsArt) {
        this.tierArt = tierArt;
        this.date = geburtsDatum;
        this.rasse = rasse;
        this.haltungsArt = haltungsArt;
    }

    public String getTierArt() {
        return tierArt;
    }

    public void setTierArt(String tierArt) {
        this.tierArt = tierArt;
    }
    
    public String getGeburtsDatum() {
        return date;
    }

    public void setGeburtsDatum(String geburtsDatum) {
        this.date = geburtsDatum;
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    public String getHaltungsArt() {
        return haltungsArt;
    }

    public void setHaltungsArt(String haltungsArt) {
        this.haltungsArt = haltungsArt;
    }
    
    
    @Override
    public String toString() {
        return (tierArt.toUpperCase());
    }

}
