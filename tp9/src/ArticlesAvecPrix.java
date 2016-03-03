
public class ArticlesAvecPrix {
	private ArticlesEnStock art;
	int prix, total;
	
	public ArticlesAvecPrix(int p, String n, String c) {
		this.art=new ArticlesEnStock(n, c);
		this.prix=p;
		this.total=0;
	}
	
	void ajouter(int n){
		total+=n*prix;
		art.ajouter(n);
	}
	
	void setPrix(int i){
		this.prix=i;
	}
	
	double prixMoyen(){
		return total/art.getQuantite();
	}
	
	public String getCode(){
		return art.getCode();
	}
	
	public String getNom(){
		return art.getNom();
	}
	
	int getQuantite(){
		return art.getQuantite();
	}
	
	void retirer(int n){
		art.retirer(n);
		total-=n*prix;
	}
	
	

}
