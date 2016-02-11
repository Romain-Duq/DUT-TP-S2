public class EssaiStock {
	public static void main(String[] args) {
		Stock stock = new Stock(20);
		System.out.print(stock.toString());
		
		ArticlesEnStock ordi = new ArticlesEnStock("PC","xdf10");
		stock.ajoutArticle(ordi);
		System.out.print(stock.toString());
		ordi.ajouter(20);
		System.out.print(stock.toString());
		
		ArticlesEnStock ecran = new ArticlesEnStock("Ecran","koz106");
		stock.ajoutArticle(ecran);
		ecran.ajouter(30);
		System.out.print(stock.toString());
		
		ecran.retirer(10);
		System.out.print(stock.toString());
		
		System.out.println("Ecran en stock : "+ecran.getQuantite());
		System.out.print("Article en stock : "+(ecran.getQuantite()+ordi.getQuantite()));
	}
}
