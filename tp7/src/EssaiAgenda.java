import java.util.GregorianCalendar;

public class EssaiAgenda {
	public static void main(String[] args) {
		Agenda a = new Agenda();
		a.entreeEvenement(new Evenement("test", "bidon",
				new GregorianCalendar(), new GregorianCalendar(2016, 3, 12)));
		System.out.println(a.list.get(0).toString());

		a.entreeEvenement(new Evenement("test", "bidon",
				new GregorianCalendar(), new GregorianCalendar(2016, 3, 11)));	
		try {
			System.out.println(a.list.get(1).toString());	
		} catch (Exception e) {
			e.getStackTrace();
		}

		a.entreeEvenement(new Evenement("test2", "bidon",
				new GregorianCalendar(2016,8,12), new GregorianCalendar(2017, 4, 12)));
		System.out.println(a.list.get(1).toString());

		
		a.supprimerEvent(0);
		try {
			System.out.println(a.list.get(1).toString());	
		} catch (Exception e) {
			e.getStackTrace();
		}
	
	}
}
