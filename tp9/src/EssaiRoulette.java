import javax.swing.JOptionPane;


public class EssaiRoulette {

	public static void main(String[] args) {
		Roulette r;
		JOptionPane p = new JOptionPane();
		
		for(int i=0; i<10; i++){
			r = new Roulette();
			JOptionPane.showMessageDialog(p,r.lancer());
		}
	}
}
