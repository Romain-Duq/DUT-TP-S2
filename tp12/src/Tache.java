
public class Tache implements Prioritaire{
	private String nom=null;
	private int priorite=0;
	
	public Tache(String s, int i){
		this.nom = s;
		this.priorite = i;
	}

	public int getPriorite() {
		return this.priorite;
	}
	
	public String toString(){
		return nom+" : "+priorite;
	}
	
	
}
