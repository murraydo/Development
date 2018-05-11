package dateandtimelocatedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Murat Vatandas
 */
public class DateAndTimeLocatedate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Date
        Date java8ReleaseAlsDate = new Date(2018,3,15);
        System.out.println(java8ReleaseAlsDate);
        Date java8ReleaseAlsDate1 = new Date(114,2,18);
        System.out.println(java8ReleaseAlsDate1);
        // Calender
        Calendar javaReleaseAlsCalendar = new GregorianCalendar(2018, 3, 15);
        System.out.println(javaReleaseAlsCalendar.getTime());
        Calendar javaReleaseAlsCalendar1 = new GregorianCalendar(2018, 2, 15);
        System.out.println(javaReleaseAlsCalendar1.getTime());
        //LocalDate
        LocalDate javaReleaseAlsLocalDate = LocalDate.of(2018,3,15);
        System.out.println(javaReleaseAlsLocalDate);
        javaReleaseAlsLocalDate = LocalDate.of(2014,Month.MARCH,18 );
        System.out.println(javaReleaseAlsLocalDate);
        // LocalDate heute
        LocalDate heute = LocalDate.now();
        System.out.println(heute);
        LocalDate neujahr2000 = LocalDate.parse("2000-01-01");
        System.out.println(neujahr2000);
        neujahr2000 = LocalDate.parse("01.01.2000", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(neujahr2000);
        
        heute.getDayOfMonth();
        heute.getMonthValue();
        heute.getYear();
        
        heute = heute.plusDays(1);
        heute = heute.plusMonths(1);
        heute = heute.plusYears(1);
        
        heute = heute.minusDays(1);
        heute = heute.minusMonths(1);
        heute = heute.minusYears(1);
        
        System.out.println(heute);
        boolean istHeuteVorNeujahr2000 = heute.isBefore(neujahr2000);
        System.out.println(istHeuteVorNeujahr2000);
        boolean istHeuteNachNeuJahr2000 = heute.isAfter(neujahr2000);
        System.out.println(istHeuteNachNeuJahr2000);
        
        boolean istHeuteheute = heute.isEqual(LocalDate.now());
        System.out.println(istHeuteheute);
        
        Person p1 = new Person();
        p1.geburtstag = LocalDate.of(1960, 1, 1);
        System.out.println(p1.getAlter());
    }
}
    
    class Person{
     
        LocalDate geburtstag;
        public int getAlter(){
            LocalDate heute = LocalDate.now();
            int alter = geburtstag.until(heute).getYears();
            return alter;
        }
    }

