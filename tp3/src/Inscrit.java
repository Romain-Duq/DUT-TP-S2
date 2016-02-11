public class Inscrit {
	String dossard;
	int score;
	int temps;
	
	public Inscrit(int dossard, int score, int min, int sec ){
		if(dossard<1 || dossard>100 || score<0 || score>50 || min<0 || min>60 || sec<0 || sec>60){
			this.dossard=null;
			this.score=score;
			this.temps=(min/60)+sec;
		}else{
			this.dossard="N° "+String.valueOf(dossard);
			this.score=score;
			this.temps=(min/60)+sec;
		}
	}
	
	public String toString(){
		return "["+this.dossard+","+this.score+" points"+this.temps+"s]";
	}
}
