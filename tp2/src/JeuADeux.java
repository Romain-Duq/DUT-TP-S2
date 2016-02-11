public class JeuADeux{
    public static void main(String[] args){
	int total = 20;
	Joueur cesar= new Joueur("Cesar");
	Joueur bob= new Joueur("Bob");
	while (cesar.cumul<total) {
	    cesar.jouer();
	}
	total=20;
	while (bob.cumul<total) {
	    bob.jouer();
	}
	if(cesar.bat(bob)>0){
	    System.out.println("Le gagnant est "+bob.toString());
	}else if(cesar.bat(bob)!=0) {
	    System.out.println("Le gagnant est "+cesar.toString());
	}else{
	    System.out.println("Egalite");
	}
    }
}
