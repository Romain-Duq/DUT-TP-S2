import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Etudiant {
	String nom;
	HashMap<String, String> list = new HashMap<>();
	
	public Etudiant(String s, String[] module, String[] note){
		this.nom = s;
		for(int i=0; i<module.length; i++){
			this.list.put(module[i], note[i]);
		}
	}
	
	public String toString(){
		String s=this.nom+"\n";
		Set listKeys=list.keySet();
		Iterator iterateur=listKeys.iterator();
		
		while(iterateur.hasNext())
		{
			Object key= iterateur.next();
			s+=key+" "+list.get(key)+"\n";
		}
		return s;
	}
}
