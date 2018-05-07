/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

/**
 *
 * @author Sanne
 */
public interface Maus {
    void klaut();
    default void dasKlapptSo(){
        System.out.println("Hier spricht dein Interface");
    }
    
}
