import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class EssaieCalendar {
	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		System.out.println(date.getTime());

		Random r = new Random();
		int jour = r.nextInt(32);
		GregorianCalendar date2 = new GregorianCalendar(1990, 11, jour);
		System.out.println(date2.get(Calendar.DAY_OF_MONTH) + "/"+ (date2.get(Calendar.MONTH) + 1) + "/"+ date2.get(Calendar.YEAR));

		jour = r.nextInt(32);
		GregorianCalendar date3 = new GregorianCalendar(2010, 0, jour);
		System.out.println(date3.get(Calendar.DAY_OF_MONTH) + "/"+ (date3.get(Calendar.MONTH) + 1) + "/"+ date3.get(Calendar.YEAR));

		int mois = r.nextInt(12);
		GregorianCalendar date4 = new GregorianCalendar(1, mois, 2);
		jour = r.nextInt(date4.getActualMaximum(date4.DAY_OF_YEAR));
		date4.set(date4.DAY_OF_YEAR, jour);
		date4.set(date4.YEAR, 2016);
		System.out.println(date4.get(Calendar.DAY_OF_MONTH) + "/"+ (date4.get(Calendar.MONTH) + 1) + "/"+ date4.get(Calendar.YEAR));

		mois = r.nextInt(12);
		GregorianCalendar date5 = new GregorianCalendar(1, mois, 2);
		jour = r.nextInt(date5.getActualMaximum(date4.DAY_OF_YEAR));
		date5.set(date5.DAY_OF_YEAR, jour);
		date5.set(date5.YEAR, 2016);
		System.out.println(date5.get(Calendar.DAY_OF_MONTH) + "/"+ (date5.get(Calendar.MONTH) + 1) + "/"+ date5.get(Calendar.YEAR));

	}

}
