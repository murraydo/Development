package exceptionHandling;



/**
 * @author Murat Vatandas Differences, similiarities between checked exceptions, RuntimeExceptions and Erros;
 * -- Checked Exception -> java.lang.Exception und seine Unterklasse außer die RuntimeExeption und seine Unterklassen. Checcked
 *  Exceptions werden zur Compilierzeit gecheckt
 *
 * -- RuntimeException -> java.lang.RuntimeException und seine Unterklassen
 * (Unchecked Exeption) * NullPointerException, ArrayIndexOutOfBoundsException,
 * ClassCastCastExeption -- Errors -> java.lang.Error
 *
 * Unchecked Exception: Alle exceptionHandling, die von Exception erben und
 * nicht Kinder von Runtime sind unchecked exceptionHandling
 */
class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    void teachClass() throws BookNotFoundException {
        
        boolean bookFound = locateBook();
        
        if(!bookFound){
            throw new BookNotFoundException();
        } else{
            readBook();
            explainContens();
        } 
    }

    public static void main(String[] args) {

    }

    private boolean locateBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void readBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void explainContens() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
