
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Murat Vatandas
 */
public class DateiManager {

    public static void main(String[] args) {

        try{
        File datei = new File( /*System.getProperty("java.io.tmpdir" + )*/ "C://Users//CC-Student//NetBeansProjects//Kunden.txt"); // If you use tmp
        Scanner scanner = new Scanner(datei);
        
        while(scanner.hasNextLine()){
            String kunden = scanner.nextLine();
            System.out.print(kunden);
            System.out.println(" (" + kunden.length() + ")");
            
        }
        
        scanner.close();
        
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
//        try {
//        File datei = new File("C://Users//CC-Student//NetBeansProjects//Datenbank.dat");
//        datei.createNewFile();
//        // datei.delete(); zum löschen der Datei
//        
//        PrintWriter pw = new PrintWriter(datei);
//        pw.println("Hugo Hamster Hugostrasse 15 20000 HugoStadt");
//        pw.flush();
//        pw.close();
//        
//        
//        } catch(Exception e){
//            e.printStackTrace();
//        } 
//        Datenbank db = new Datenbank("Test", 38);

//        try {
//            File datei = new File("C://Users//CC-Student//NetBeansProjects//Kunden.txt");
//
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(datei));
//            Object rawObject = ois.readObject();
//            ois.close();
//
//            if (rawObject instanceof Datenbank) {
//
//                Datenbank gelesenDB = (Datenbank) rawObject;
//                System.out.println(gelesenDB.getName() + " , " + gelesenDB.getAlter());
//                //System.out.println(gelesenDB.getTiere());
//            } else {
//                System.err.println("In der Datei war leider nichts");
//            }
//
////        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(datei));
////        oos.writeObject(db);
////        oos.flush();
////        oos.close();
//            }catch (Exception e) {
//            e.printStackTrace();
//        }
//        }

    }
}
