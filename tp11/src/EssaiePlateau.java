import java.util.Random;

public class EssaiePlateau {
	public static void main(String[] args) {
		int[][] tableau = new int[10][10];
		SuperPlateau pl = new SuperPlateau(10);
		Random rdm = new Random();
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[0].length; j++) {
				tableau[i][j] = rdm.nextInt(5);
			}
		}

		pl.setJeu(tableau);
		pl.affichage();

		int rouge = 0, bleu = 0, vert = 0, jaune = 0;
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[0].length; j++) {
				if(tableau[i][j]==1){
					rouge++;
				}else if(tableau[i][j]==2){
					bleu++;
				}else if(tableau[i][j]==3){
					vert++;
				}else if(tableau[i][j]==4){
					jaune++;
				}
			}
		}
		System.out.println("rouge " + rouge); 
		System.out.println("bleu " + bleu); 
		System.out.println("vert "+ vert);
		System.out.println("jaune " + jaune);
	}
}
