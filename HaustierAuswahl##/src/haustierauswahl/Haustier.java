package haustierauswahl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mvatandas
 */
public class Haustier {
    
    private String name;
    private int alter;
    private int anzahl;
    private String art;
    private boolean magTomaten;

   
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    Haustier(String string, Integer integer, String string0, boolean nextBoolean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

  

    public boolean isMagTomaten() {
        return magTomaten;
    }

    public void setMagTomaten(boolean magTomaten) {
        this.magTomaten = magTomaten;
    }


}
