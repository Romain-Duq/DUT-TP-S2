import java.awt.Graphics;


public class SuperPlateau {

	private Plateau plateau;
		
	public SuperPlateau(int taille) {
		String[] gifs={"images/un.gif","images/deux.gif","images/trois.gif","images/quatre.gif"};
		plateau = new Plateau(gifs, taille);
	}
	
	public void affichage() {
		plateau.affichage();
	}
	
	public int[][] getJeu() {
		return plateau.getJeu();
	}
	
	public void paintComponent(Graphics g) {
		plateau.paintComponent(g);
	}
	
	public void setJeu(int[][] jeu) {
		plateau.setJeu(jeu);
	}
	
	public  boolean deplacer (int x, int y, int a, int b) {
		int[][] jeu = plateau.getJeu();
		if (jeu[a][b] == 0) {
			jeu[a][b] = jeu[x][y];
			jeu[x][y] = 0;
			setJeu(jeu);
			return true;
		}
		return false;
	}

}
