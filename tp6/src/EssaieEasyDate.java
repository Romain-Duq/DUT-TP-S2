import java.util.Random;

public class EssaieEasyDate {
	public static void main(String[] args) {
		EasyDate d1 = new EasyDate();
		System.out.println(d1.toString() + "\n");

		d1 = new EasyDate(12, 2);
		System.out.println(d1.toString() + "\n");

		d1 = new EasyDate(12, 2, 2016);
		System.out.println(d1.toString() + "\n");

		EasyDate d2 = new EasyDate("12/02/2016");
		System.out.println(d2.toString() + "\n");

		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(new EasyDate(13, 2, 2014)) + "\n");

		// initialise tableau
		EasyDate[] list = new EasyDate[10];
		Random rdm = new Random();
		int j, m, a;
		for (int i = 0; i < list.length; i++) {
			j = rdm.nextInt(32);
			m = rdm.nextInt(12);
			a = rdm.nextInt(118) + 1900;
			list[i] = new EasyDate(j, m, a);
		}

		// trie sur le tableau
		boolean permut;
		do {
			permut = false;
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i].compareTo(list[i + 1]) < 0) {
					permut = true;
					EasyDate tmp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = tmp;
				}
			}
		} while (permut);

		affichage(list);
	}

	static void affichage(EasyDate[] tab) {
		// affichage du tableau
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i].toString());
		}
	}

}
