public class JeuAPlusieur{
    public static void main(String[] args){
	Saisie s =new Saisie();
	int nbJoueur=s.saisieEntier("Bonjour combien de joueurs etes vous ?");
	int voulu=s.saisieEntier("Combien vaut le total ?"), total;
	Joueur[] listJoueur=new Joueur[nbJoueur];
	for(int i=0; i<nbJoueur; i++){
	    listJoueur[i]=new Joueur(s.saisieChaine("Nom du joueur"));
	}
	for(int i=0; i<nbJoueur; i++){
	    total=voulu;
	    while (listJoueur[i].cumul<total) {
		listJoueur[i].jouer();
	    }
	}
	Joueur gagnant = listJoueur[0];

	for(int i=1; i<nbJoueur; i++){
	    if(gagnant.bat(listJoueur[i])>0){
		gagnant=listJoueur[i];
	    }
	}
	for(int i=0; i<nbJoueur; i++){
	    if(gagnant.bat(listJoueur[i])==0 && gagnant.cumul< listJoueur[i].cumul){
		gagnant=listJoueur[i];
	    }
	}
	for(int i=0; i<nbJoueur; i++){
	    if(gagnant.bat(listJoueur[i])==0 && gagnant.cumul==listJoueur[i].cumul){
		System.out.println("Gagnant : "+listJoueur[i].toString());
	    }
	}
    }
} 
