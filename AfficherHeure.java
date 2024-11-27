import java.util.Calendar;
import java.util.GregorianCalendar;

public class AfficherHeure {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        System.out.print("Il est " + cal.get(Calendar.HOUR_OF_DAY) + " h ");
        System.out.print(cal.get(Calendar.MINUTE) + " m ");
        System.out.println(cal.get(Calendar.SECOND) + " s");
    }
}
