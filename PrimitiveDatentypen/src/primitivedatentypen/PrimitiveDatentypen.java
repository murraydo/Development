package primitivedatentypen;

/**
 *
 * @author Murat Vatandas
 */
public class PrimitiveDatentypen {

    private String stringArtithmetisch = "Arithmetische Typen";
    private String stringWahrheitswert = "Wahrheitswerte";
    
    byte b = (byte)200; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrimitiveDatentypen primData = new PrimitiveDatentypen();
        System.out.println("Es gibt zwei Arten von primitiven Datentypen: arithmetische Typen:");
        System.out.println("1." + primData.stringArtithmetisch.toUpperCase() + " und für die Zustände wahr oder falsch die " + primData.stringWahrheitswert.toUpperCase());
        System.out.println("##################################################################\n");
        System.out.println(primData.stringArtithmetisch);
        // Bytes
        System.out.println("1. Der prim. Datentyp \"byte\" hat 8 Bit und beginnt bei " + Byte.MIN_VALUE + " und endet bei: " + Byte.MAX_VALUE); // 8 Bit 
//        System.out.println("------------------------------------------------------");
        //Short
        System.out.println("2. Der prim. Datentyp \'short\' hat 16 Bits und beginnt bei: " + Short.MAX_VALUE + " und endet bei: " + Short.MIN_VALUE);
//        System.out.println("-------------------------------------------------------");
        // Int
        System.out.println("3. Der prim. Datentyp \'int\' hat 32 Bits und beginnt bei: " + Integer.MIN_VALUE + " und geht bis: " + Integer.MAX_VALUE);
//        System.out.println("--------------------------------------------------------");
        // Long
        System.out.println("4. Der prim. Datentyp \'long\' hat 64 Bits und beginnt bei: " + Long.MIN_VALUE + " und endet bei: " + Long.MAX_VALUE);
        System.out.println("Damit ergibt sich folgende Reihenfolge in Bit Angaben: byte(8) < short(16) < int(32) < long(64)");
        System.out.println("\n");

        System.out.println("Die prim. Datentypen \'float\' und \'double\' gehören zu den Fließkommazahlen");

        System.out.println("---------------------------------------------------------");
        // Flaot
        System.out.println("Der prim. Datentyp \'float\' hat 4 Byte beginnt bei: " + Float.MIN_VALUE + " und endet bei: " + Float.MAX_VALUE);
        // Double
        System.out.println("Der prim. Datentyp \'double\' hat 8 Byte beginnt bei: " + Double.MIN_VALUE + " endet bei: " + Double.MAX_VALUE);

        System.out.println("Für die Fließkommazahlen ergibt sich folgende Reihenfolge in Bytes: float(4) < double(8)\n");
        System.out.println("Weitere Datentypen: char und boolean");
        System.out.println("----------------------------------------------------------");
        // Char
        System.out.println("Der alphanumerische Datentyp char hat 2 Byte beginnt bei: " + (Character.MIN_VALUE + 0) + " endet bei: " + (Character.MAX_VALUE + 0));
        System.out.println("Der char verwendet das 16-Bit-Unicode-Zeichensystem, welches in dem Wertebereich 0x0000 bis 0xFFFF liegt.\n");
//        for (int i = 0; i < 256; i++) {
//            System.out.println(i + " = " + (char) i);  // Ausgabe z.B. 50 = a
//        }
        System.out.println("Der prim. Datentyp \'boolean\' beschreibt die Wahrheitszustände true oder false");
        System.out.println("Der \'boolean\' kennt nur die beiden Zustaände true oder false");
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Examples");
        System.out.println("Der Versuch die Zahl 123456789012345 auszugeben scheitert, da hier kein int ausreicht sondern ein long her muss.");
        System.out.println("Ausgabe als long: " + 123456789012345L + "L");
        System.out.println("Ausgabe als double: " + 0123456789012345D + "D");
        System.out.println("Der Wertebereich des byte liegt bei: " + Byte.MIN_VALUE + " -> " + Byte.MAX_VALUE);
        System.out.println("Byte mit negativem Vorzeichen: " + primData.b);
        
        
    }

}

































