/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schleifen;

import java.util.Scanner;

/**
 *
 * @author Sanne
 */
public class SpezialBloecke extends Bloecke{
    public static final int sechzehn;
    public static final String rolle;
    static{
        //System.out.println("Statische Block aus der Kindklasse: sechtzehn ist: "+sechzehn);
        sechzehn= new Scanner(System.in).nextInt();
        System.out.println("Statische Block aus der Kindklasse: sechtzehn ist: "+sechzehn);
        //Test mit username und passwort:
        rolle="Gast";
    }
    public SpezialBloecke(){
        System.out.println("Konstruktor der erbenden Klasse");
        //sechzehn=16;
    }
    {
        System.out.println("Spezialblock1");
    }
    {
        System.out.println("Spezialblock2");
    }
    {
        System.out.println("Spezialblock3");
    }
}
