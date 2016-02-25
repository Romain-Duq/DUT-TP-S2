import java.util.ArrayList;


public class Agenda extends Evenement{
	ArrayList<Evenement> list = new ArrayList<>();
	
	public Agenda() {}
	
	boolean entrable(Evenement e){
		for(Evenement ev : list){
			if(e.chevauchement(ev)) return false;
		}
		return true;
	}
	
	void entreeEvenement(Evenement e){
		if(entrable(e)) list.add(e);
	}
	
	void supprimerEvenement(Evenement e){
		list.remove(list.lastIndexOf(e));
	}
	
	void supprimerEvent(int i){
		list.remove(i);
	}
	
	void supprimerChevauchement(Evenement e){
		for(Evenement ev : list){
			if(e.chevauchement(ev)) supprimerEvenement(ev);
		}
		entreeEvenement(e);
	}
}
