import java.util.Random;


public class Traversee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SuperPlateau plateau = new SuperPlateau(10);
		int[][] tab = new int[10][10];
		Random r = new Random();
		
		for (int i = 0;i<10;i++) {
			for (int j = 0;j<10;j++) {
				tab[i][j] = r.nextInt(5); 
			}
		}
		tab[0][0] = 1;
		tab[9][9] = 0;
		plateau.setJeu(tab);
		
		plateau.affichage();
		try{Thread.sleep(2000);}catch(Exception ie){}
		plateau.deplacer(0, 0, 9, 9);
		
		plateau.affichage();

	}

}
