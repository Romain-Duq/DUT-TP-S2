public class Joueur {
    String nom ;
    int cumul ;
    int nbLancers ;
    java.util.Random r=new java.util.Random();
    
    Joueur(String n){
	nom=n;
    }
	
    void jouer() {
	cumul += r.nextInt(6)+1;
	nbLancers++;
    }
	
    /**
     * Compare le nombre de lancers de deux joueurs
     * @param j le joueur à comparer
     * @return positif si le score du joueur est plus grand que celui de j
     * 		   négatif si le score du joueur est plus petit que celui de j
     * 		   nul en cas d'égalité
     */
    int bat(Joueur j){
	return nbLancers-j.nbLancers;

    }
    public String toString() {
	return "Joueur [nom=" + nom + ", nbLancers=" + nbLancers + ", "
	    + "cumul=" + cumul + "]";
    }
    
}
