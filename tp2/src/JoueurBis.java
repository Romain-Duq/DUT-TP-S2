public class JoueurBis {
    String nom;
    int cumul;
    int nbLancers;
    java.util.Random r=new java.util.Random();
    
    JoueurBis(String n){
	nom=n;
	cumul=20;
    }
    void jouer() {
	cumul -= r.nextInt(5)+1;
	nbLancers++;
    }

    int bat(Joueur j){
	return nbLancers+j.nbLancers;
    }
    public String toString() {
	return "Joueur [nom=" + nom + ", nbLancers=" + nbLancers + ", "
		    + "cumul=" + cumul + "]";
    }
}

