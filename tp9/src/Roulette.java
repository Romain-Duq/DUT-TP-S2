import java.util.ArrayList;
import java.util.Random;

public class Roulette {
	private Random r = new Random();
	private int bille;
	
	public Roulette() {
		this.bille=this.r.nextInt(37);
	}
	
	public String lancer(){
		String res = "Rien ne va plus : "+bille;
		
		if(bille!=0){
			if(estRouge(bille)){
				res+=" -Rouge";
			}else{
				res+=" -Noire";
			}
		}else{
			res+=" -Vert";
		}
		
		if(bille%2==0){
			res+=" -Paire";
		}else{
			res+=" -Impaire";
		}
		
		if(bille>=1 && bille<=18){
			res+=" -Manque";
		}else if(bille !=0){
			res+=" -Pass";
		}
		
		return res;
	}
	
	private boolean estRouge(int i){
		int[]rouge=new int[]{1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
		for(int cpt=0; cpt<rouge.length; cpt++){
			if(i==rouge[cpt]){
				return true;
			}
		}
		return false;
	}
	
	
	
	

}
