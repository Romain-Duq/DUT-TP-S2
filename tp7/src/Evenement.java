import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Evenement {
	String intitule = "", lieu = "";
	GregorianCalendar debut, fin;
	ArrayList<Contact> contact = new ArrayList<>();

	public Evenement() {
		this.debut = new GregorianCalendar();
		this.fin = new GregorianCalendar();
		this.contact.add(new Contact(null, null));
	}

	public Evenement(String[] c, String[] e, String i, String l, GregorianCalendar d,
			GregorianCalendar f) {
		
		this.intitule = i;
		this.lieu = l;
		this.debut = d;
		if (d.before(f)) {
			this.fin = f;
		} else {
			this.fin = d;
		}
	}

	public String toString() {
		return this.intitule + " : " + this.lieu + " : "
				+ this.debut.get(Calendar.DAY_OF_MONTH) + "/"
				+ (this.debut.get(Calendar.MONTH) + 1) + "/"
				+ this.debut.get(Calendar.YEAR) + " - "
				+ +this.fin.get(Calendar.DAY_OF_MONTH) + "/"
				+ this.fin.get(Calendar.MONTH) + "/"
				+ this.fin.get(Calendar.YEAR);
	}

	boolean equals(Evenement e) {
		return this.intitule.equals(e.intitule) && this.lieu.equals(e.lieu)
				&& this.debut.equals(e.debut) && this.fin.equals(e.fin);
	}
	
	boolean chevauchement(Evenement e){
		boolean flag = false;
		if(this.fin.after(e.debut)){
			flag=true;
		}else if(this.debut.before(e.fin) && this.fin.after(e.debut)){
			flag=true;
		}
		return flag;
	}
}
