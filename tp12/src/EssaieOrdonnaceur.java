
public class EssaieOrdonnaceur {
	public static void main(String[] args) {
		Tache t1 = new Tache("a", 1);
		Tache t2 = new Tache("b", 1);
		Tache t3 = new Tache("c", 0);
		Tache t4 = new Tache("d", 2);
		Tache t5 = new Tache("e", 3);
		Tache t6 = new Tache("f", 0);
		 
		OrdoFile file = new OrdoFile();
		
		file.ajouteObjet(t1);
		file.ajouteObjet(t2);
		file.ajouteObjet(t3);
		file.ajouteObjet(t4);
		file.ajouteObjet(t5);
		file.ajouteObjet(t6);
		
		//sans priorite
		while(!file.estVide()) {
			System.out.println(file.plusPrioritaire().toString());
		}
		
		System.out.println("\n");
		//avec priorite
		OrdoAvecPriorite file2 = new OrdoAvecPriorite();
		file2.ajout(t1);
		file2.ajout(t2);
		file2.ajout(t3);
		file2.ajout(t4);
		file2.ajout(t5);
		file2.ajout(t6);
		
		for(int i=0; i<6; i++){
			System.out.println(file2.envoie().toString());
		}
	}
}
