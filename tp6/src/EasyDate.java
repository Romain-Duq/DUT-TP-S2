import java.util.Calendar;
import java.util.GregorianCalendar;

public class EasyDate {
	GregorianCalendar d;

	EasyDate() {
		this.d = new GregorianCalendar();
	}

	EasyDate(int j, int m) {
		this.d = new GregorianCalendar();
		this.d.set(Calendar.MONTH, m - 1);
		this.d.set(Calendar.DAY_OF_MONTH, j);
	}

	EasyDate(int j, int m, int a) {
		this.d = new GregorianCalendar(a, m - 1, j);
	}

	EasyDate(String s) {
		if (s.matches("\\d\\d/\\d\\d/\\d\\d\\d\\d")) {
			this.d = new GregorianCalendar(
					Integer.parseInt(s.substring(6, 10)), Integer.parseInt(s
							.substring(3, 5)) - 1, Integer.parseInt(s
							.substring(0, 2)));
		}
	}

	public String toString() {
		if (this.d == null) {
			return "Date incorect";
		} else {
			return this.d.get(Calendar.DAY_OF_MONTH) + "/"
					+ (this.d.get(Calendar.MONTH) + 1) + "/"
					+ this.d.get(Calendar.YEAR);
		}
	}

	boolean equals(EasyDate d2) {
		if (this.d.get(Calendar.DAY_OF_MONTH) == d2.d
				.get(Calendar.DAY_OF_MONTH)
				&& this.d.get(Calendar.MONTH) == d2.d.get(Calendar.MONTH)
				&& this.d.get(Calendar.YEAR) == d2.d
						.get(Calendar.YEAR)) {
			return true;
		} else {
			return false;
		}
	}

	int compareTo(EasyDate d2) {
		if (this.d.get(Calendar.YEAR)>d2.d.get(Calendar.YEAR)){
			return 1;
		}else if(this.d.get(Calendar.YEAR)<d2.d.get(Calendar.YEAR)){
			return -1;
		}else if (this.d.get(Calendar.MONTH)>d2.d.get(Calendar.MONTH)){
			return 1;
		}else if (this.d.get(Calendar.MONTH)<d2.d.get(Calendar.MONTH)){
			return -1;
		}else if (this.d.get(Calendar.DAY_OF_MONTH)>d2.d.get(Calendar.DAY_OF_MONTH)){
			return 1;
		}else if (this.d.get(Calendar.DAY_OF_MONTH)<d2.d.get(Calendar.DAY_OF_MONTH)){
			return -1;
		}else return 0;
	}

}
