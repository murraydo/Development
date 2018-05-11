package lambdas;

/**
 *
 * @author Murat Vatandas
 */
public class Klasse implements Interface{
    
    public void abstrakteMethode(){
        System.out.println("Implementierung der abstrakten Methode");
    }
    public static void main(String[] args){
        Interface.statischeMethode();
        Klasse klasse = new Klasse();
        klasse.abstrakteMethode();
        klasse.defaultMethode();
    }

}
