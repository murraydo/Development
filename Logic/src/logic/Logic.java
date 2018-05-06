package logic;

/**
 *
 * @author Murat Vatandas
 */
public class Logic {

    /**
     * @param args the command line arguments
     */
   String wuff = "";

    
    public static void main(String...data) {
        
        String[] test = data;
         
      
        String wuff="";
        boolean b=wuff.equals(null);
        
        //System.out.println(12+6*3%(1+1));//12
        
        System.out.println("mit eins");
        wuff("eins");
        
        System.out.println("mit sound");
        wuff ("sound");
        
        System.out.println("mit logic");
        wuff ("logic");
        
        System.out.println("mit sound 2 args");
        wuff ("sound","zwei args");
        
        System.out.println("mit logic 2args");
        wuff ("logic", "zwei args");
        
        System.out.println("gar keine argumente");
        wuff();
        
    }
    
    private static void wuff(String... data){
        System.out.println("---Aufruf---");
        if (data.length>=1 && (data[0].equals("sound")  ||  data[0].equals("logic"))
                && data.length<2){
            
            System.out.println(data[0]);
        }
        System.out.println("Ich wurde aufgerufen!");
    }

}

