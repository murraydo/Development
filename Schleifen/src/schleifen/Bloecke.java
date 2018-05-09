/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schleifen;

/**
 *
 * @author Sanne
 */
public class Bloecke {
    {
        System.out.println("Wann wird denn das gezeigt?-->Steht oberhalb des Konbstruktors");
      
    }
    
    int i =0;
    public Bloecke(){
        System.out.println("Hier spricht dein Konstruktor");
        System.out.println("Konstruktor: i->"+i);
    }
    {
        System.out.println("Wann wird denn das gezeigt?-->Steht unterhalb des Konbstruktors");
        System.out.println("In i steht noch "+i+"drin");
        i=17;
        System.out.println("In i steht noch "+i+"drin");
    }
    public void methode(){
        System.out.println("Und auch hier mal ein Piiiips");
    }
    
    
    static{
        System.out.println("Auch ein statischer Block wird ausgeführt(Aus Elternklasse)");
    }
}
