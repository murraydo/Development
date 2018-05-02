package de.versicherung.gui;


import de.versicherung.logic.Katze;
import de.versicherung.logic.Krankheiten;
import de.versicherung.logic.Person;
import de.versicherung.logic.Tier;
import de.versicherung.logic.Vertrag;
import de.versicherung.logic.VertragsService;
import de.versicherung.logic.ZuVersicherndeTiere;

import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author Murat Vatandas
 */
public class Konsole {

    // Methoden
    private VertragsService vs;
    public static Scanner eingabe;
    public static final String ls = System.getProperty("line.separator");  

    public Konsole(VertragsService vs) {
        this.vs = vs;
        eingabe = new Scanner(System.in);
        navigation();
    }

    private void navigation() {
        System.out.println("**************Willkommen, was k�nnen wir f�r Sie tun??********************" + ls
                + "******1*******: Versicherung abschliessen" + ls
                + "******2*******: Schaden melden" + ls
                + "******3*******: Beitragsrechner" + ls
                + "******4*******: Beenden des Programms mit jeder anderen Zahl" + ls);
        

        int auswahl = eingabe.nextInt();
        switch (auswahl) {
            case 1:
                versicherungAbschliessen();
                break;
            case 2:
                schadenMelden();
                break;
            case 3:
                beitragsRechner();
                break;
            default:
                System.out.println("Vielen Dank, dass Sie über unseren Service gebucht haben");
                return;
        }
        navigation();
    }

    private void versicherungAbschliessen() {
        Vertrag vertrag = new Vertrag();
        Person person = new Person();
        Tier tier = new Tier();
        System.out.println("Bitte geben Sie Ihren Vornamen ein: ");
        person.setVorname(eingabe.nextLine());
        System.out.println("Bitte geben Sie Ihren Nachnamen ein");
        person.setNachname(eingabe.nextLine());
        System.out.println("Bitte geben Sie die Strasse ein");
        person.setPlz(eingabe.nextLine());
        System.out.println("Bitte geben Sie Ihren Wohnort ein");
        person.setOrt(eingabe.nextLine());
        System.out.println("Bitte geben Sie Ihre Telefonnummer ein");
        person.setTelefon(eingabe.nextLine());
        System.out.println("Bitte geben Sie die Tierart an, die Sie versichern m�chten");
        
        for (ZuVersicherndeTiere zVT : ZuVersicherndeTiere.values()) {
            System.out.println(zVT);
        }
        tier.setTierArt(eingabe.nextLine());
        System.out.println("Bitte bestat�tigen Sie mit der Eingabe der Ziffer 1, dass Sie die ABG gelesen haben und einverstanden sind. "
                + "Mit der Eingabe der Ziffer 2 brechen Sie den Vorgang ab " + "\n");
        int x = 1;
        do {
            if (eingabe.nextInt() == 1) {
                System.out.println("######################## Bestia Tierversicherung ##################################################" + ls + ls
                        + "Vielen Dank, dass Sie Ihr Einversndnis erteilt haben. " + "\n"
                        + "Bitte �berpr�fen Sie Ihre Angaben auf Vollst�ndigkeit. " + " \n"
                        + "Vorname: " + person.getVorname() + ls
                        + "Nachname: " + person.getNachname() + ls
                        + "Strasse: " + person.getStrasse() + ls
                        + "Wohnort: " + person.getOrt() + ls
                        + "Telefonnummer: " + person.getTelefon() + ls
                        + "Zu versicherndes Tier: " + tier.getTierArt() + ls
                        + "AGB gelesen: " + person.getHatAgbGelesen());
                System.out.println("Bitte best�tigen Sie die Vollst�ndigkeit Ihrer Angaben mit der Eingabe der Ziffer 1" + ls);
                if (eingabe.nextInt() == 1) {
                    x = 2;
                    vs.anlegen(person, vertrag, tier);
                    for (Vertrag vertragsDaten : vs.getAlleVertraege()) {
                        System.out.println(vertragsDaten.toString());
                    }
                }
            } else {
                System.out.println("Sorry aber ohne die Best�tigung k�nnen wir Ihnen keine Versicherunug anbieten");
                navigation();
            }
        } while (x == 1);
    }

    private void schadenMelden() {
       
    }

    /**
     * private String date (Geburtsdatum);
     * private String tierArt;
     * private String rasse;
     * private String haltungsArt;
     */
    private void beitragsRechner() {
        Tier tierBeitragRechner = new Tier();
        System.out.println("Bitte geben Sie die Tierart an, die Sie versichern m�chten");
        for (ZuVersicherndeTiere zVT : ZuVersicherndeTiere.values()) {
            System.out.println(zVT);
        }
        tierBeitragRechner.setTierArt(eingabe.nextLine());
        System.out.println("Bitte geben Sie die Rasse des zu versichernden Tieres an");
        tierBeitragRechner.setRasse(eingabe.nextLine());
        System.out.println("Bitte geben Sie das Geburtsdatum des zu versichernden Tieres an");
        tierBeitragRechner.setGeburtsDatum(eingabe.nextLine());
        System.out.println("Bitte geben Sie die Art der Haltung des zu versichernden Tieres an");
        tierBeitragRechner.setHaltungsArt(eingabe.nextLine());
        
    }
}

















