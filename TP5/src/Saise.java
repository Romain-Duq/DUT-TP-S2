import javax.swing.JOptionPane;

public class Saise {
	public static void main(String[] args) {
		int min=0, max=0;
		if (args[0].matches(".*\\d") && args[1].matches(".*\\d")) {
			min = Integer.parseInt(args[0]);
			max = Integer.parseInt(args[1]);
		}
		JOptionPane p = new JOptionPane();
		int i = 0;
		boolean incorect = false;
		while (i < min || i > max) {
			String s = p.showInputDialog("Entree un nombre entre " + min+ " et " + max);
			if (s.matches(".*\\d")) {
				i = Integer.parseInt(s);
			} else {
				p.showMessageDialog(p, "Saisie incorect");
				incorect = true;
			}
			if ((i < min || i > max) && !incorect) {
				p.showMessageDialog(p, "Saisie incorect");
			}
			incorect = false;
		}
		p.showMessageDialog(p, "Vous avez saisie "+i);
	}

}
