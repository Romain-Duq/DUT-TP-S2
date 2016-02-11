import java.util.Random;
public class EssaiCarte{
    public static void main(String[] args){
	for(int i=0; i<4; i++){
	    for(int j=0; j<8; j++){
		Carte ct = new Carte(i,j);
		System.out.println(ct.toString());
	    }
	}

	System.out.println("\nQuestion 2\n");

	Random rdm = new Random();

	Carte Cune = new Carte(rdm.nextInt(4),rdm.nextInt(8));
	Carte Cdeux  = new Carte(rdm.nextInt(4),rdm.nextInt(8));

	while(Cdeux.getValeur()==Cune.getValeur() && Cdeux.getCouleur()==Cune.getCouleur()){
	    Cdeux = new Carte(rdm.nextInt(4),rdm.nextInt(8));
	}

	if(Cune.compareTo(Cdeux)<0){
	    System.out.println(Cune.toString()+"\n"+Cdeux.toString());
	}else{
	    System.out.println(Cdeux.toString()+"\n"+Cune.toString());
	}

	System.out.println("\nQuestion 3\n");

	Carte Ctrois = new Carte(rdm.nextInt(4),rdm.nextInt(8));

	for(int i=0; i<10; i++){
	    Carte ct =  new Carte(rdm.nextInt(4),rdm.nextInt(8));
	    if(ct.compareTo(Ctrois)>0){
		Ctrois=ct;
	    }
	}

	System.out.println(Ctrois.toString());
    }
}
