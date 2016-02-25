import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JOptionPane;

public class Notes {
	public static void main(String[] args) {
		HashMap<String, String> list = new HashMap<>();
		String[] nom = new String[] { "Pierre", "Paul", "Jacques", "Vincent",
				"Francois" };
		Random rdm = new Random();

		for (int i = 0; i < nom.length; i++) {
			list.put(nom[i], (rdm.nextInt(11) + 10) + " "
					+ (rdm.nextInt(11) + 10) + " " + (rdm.nextInt(11) + 10)
					+ " " + (rdm.nextInt(11) + 10) + " "
					+ (rdm.nextInt(11) + 10));
		}

		JOptionPane pan = new JOptionPane();

		for (int i = 0; i < 2; i++) {
			String s = pan.showInputDialog("Entrez un nom d'étudiant:");
			if (list.get(s) != null) {
				pan.showMessageDialog(pan, "Notes de " + s + " " + list.get(s));
			} else {
				pan.showMessageDialog(pan, "L'étudiant " + s + " n'existe pas");
			}
		}

		// utilisant étudiant

		ArrayList<Etudiant> list2 = new ArrayList<>();

		list2.add(new Etudiant("François", new String[] { "Algo", "Maths" },
				new String[] { "20", "10" }));

		list2.add(new Etudiant("Sophie", new String[] { "Economie", "POO" },
				new String[] { "15", "18" }));

		for (int i = 0; i < 2; i++) {
			String s = pan.showInputDialog("Entrez un nom d'étudiant:");
			boolean trouver = false;
			for (Etudiant e : list2) {
				if (e.nom.equals(s)) {
					pan.showMessageDialog(pan, "Note de : \n" + e.toString());
					trouver = true;
					break;
				}
			}
			if (!trouver) {
				pan.showMessageDialog(pan, "L'étudiant " + s + " n'existe pas");
			}
		}
	}
}
