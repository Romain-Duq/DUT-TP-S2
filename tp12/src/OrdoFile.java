import java.util.List;
import java.util.ArrayList;


public class OrdoFile implements Ordonnanceur {
	private List<Prioritaire> list;
	
	public OrdoFile(){
		this.list= new ArrayList<>();
	}
	
	public void ajouteObjet(Prioritaire p) {
		this.list.add(p);
	}

	public Prioritaire plusPrioritaire() {
		Prioritaire res=this.list.get(0);
		this.list.remove(0);
		return res;
	}
	
	public boolean estVide() {
		if(list.size()==0) return true;
		else return false;
	}
}
