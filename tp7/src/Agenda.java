import java.util.ArrayList;


public class Agenda extends Evenement{
	ArrayList<Evenement> list = new ArrayList<>();
	
	public Agenda() {}
	
	boolean entrable(Evenement e){
		for(Evenement ev : this.list){
			if(e.chevauchement(ev)) return false;
		}
		return true;
	}
	
	void entreeEvenement(Evenement e){
		if(entrable(e)) this.list.add(e);
	}
	
	void supprimerEvenement(Evenement e){
		this.list.remove(this.list.lastIndexOf(e));
	}
	
	void supprimerEvent(int i){
		this.list.remove(i);
	}
	
	void supprimerChevauchement(Evenement e){
		int i=0;
		for(Evenement ev : this.list){
			if(e.chevauchement(ev)) supprimerEvent(i);
			i++;
		}
		entreeEvenement(e);
	}
}
