import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        int day = 17;
        int month = 4;
        int year = 1994;
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE");
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,Calendar.APRIL,day); // Если задавать через int month - будет хуйня. можно обойти, сделав month -1, но как-то это тупо.
        int i = 0;
        while (calendar.before(Calendar.getInstance())) {
            System.out.println(i + " - " + dateFormat.format(calendar.getTime()));
            calendar.add(Calendar.YEAR, 1);
            i++;
        }
    }
}
