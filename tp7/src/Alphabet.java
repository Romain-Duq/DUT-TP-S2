import java.util.ArrayList;

public class Alphabet {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < 26; i++) {
			list.add(i, "" + (char) (i + 97));
		}

		System.out.println(list.size());
		System.out.println(list.get(5));

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("s")) {
				System.out.println(i);
				break;
			}
		}
		// seconde possibiliter
		System.out.println(list.indexOf("s"));

		for (int i = 4; i <= 6; i++) {
			list.remove(i);
		}
		System.out.println(list.size());

		// affiche sans boucle
		System.out.println(list.toString());

		//affiche avec boucle
		for (String mot : list) {
			System.out.print(mot +",");
		}
		
		//list.add(100,"?"); impossible car taille = 23
		
		list.removeAll(list);
		System.out.println("\n"+list.size());

	}

}
