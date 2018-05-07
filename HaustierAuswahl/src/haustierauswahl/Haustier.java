/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haustierauswahl;

/**
 *
 * @author Sanne
 */
public class Haustier {
    private String name;
    private int alter;
    private String art;
    private boolean magTomate;

    public Haustier(String name, int alter, String art, boolean magTomate) {
        this.name = name;
        this.alter = alter;
        this.art = art;
        this.magTomate = magTomate;
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

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public boolean isMagTomate() {
        return magTomate;
    }

    public void setMagTomate(boolean magTomate) {
        this.magTomate = magTomate;
    }

    @Override
    public String toString() {
        return "Haustier{" + "name=" + name + ", alter=" + alter + ", art=" + art + ", magTomate=" + magTomate + '}';
    }
    
    
}
