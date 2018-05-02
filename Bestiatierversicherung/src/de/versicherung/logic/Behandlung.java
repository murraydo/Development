package de.versicherung.logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Murat Vatandas
 */
public class Behandlung {

    LocalDate now = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    String formatDateTime = now.format(formatter);
    protected int vsnr;
    protected boolean behandlungArt; // stationär oder ambulant
    protected double behandlungKosten; // Kosten der Behandlung, die der Veersicherungsnehmer erstattet bekommen möchte
    protected boolean belegVorhanden; // Sind alle Belege eingereicht worden

}
