public class JeuToutSeulBis {
    public static void main(String[] args) {
	int total = 0; 
	JoueurBis cesar= new JoueurBis("Cesar");
	while (cesar.cumul>total) {
	    cesar.jouer();
	}
	
	System.out.println(cesar.nbLancers);		
			
    }
    
}
