
public class SuperStock {
	private Stock s;
	
	public SuperStock(int i) {
		this.s = new Stock(i);
	}
	
	void ajoutArticle(ArticlesEnStock a){
		s.ajoutArticle(a);
	}
	
	public ArticlesEnStock getArticleByPosition(int num){
		return s.getArticleByPosition(num);
	}
	
	int nbReferences(){
		return s.nbReferences();
	}
	
	public String toString(){
		return s.toString();
	}
	
	public ArticlesEnStock getByNom(String nom){
		for(int i=1; i<=s.nbReferences(); i++){
			if(nom.equals(s.getArticleByPosition(i).getNom())){
				return s.getArticleByPosition(i);
			}
		}
		return null;
	}
	
	public ArticlesEnStock getByCode(String code){
		for(int i=1; i<=s.nbReferences(); i++){
			if(code.equals(s.getArticleByPosition(i).getCode())){
				return s.getArticleByPosition(i);
			}
		}
		return null;
	}
}
