import java.util.Random;
public class Paquet{
    public static void main(String[] args){
	Carte[] cartes = new Carte[32];
	int index=0;
	for(int i=0; i<4; i++){
	    for(int j=0; j<8; j++){
		cartes[index]= new Carte(i,j);
		index++;
	    }
	}

	for(int i=0; i<cartes.length; i++){
	    System.out.println(cartes[i]);
	}

	System.out.println("\nMelange\n");

	Random rdm1 = new Random();
	Random rdm2 = new Random();
	Carte tampon = new Carte(0,0);
	
	for(int i=0; i<500; i++){
	    int index1 = rdm1.nextInt(32);
	    int index2 = rdm2.nextInt(32);
	    tampon=cartes[index1];
	    cartes[index1]=cartes[index2];
	    cartes[index2]=tampon;
	}

	for(int i=0; i<cartes.length; i++){
	    System.out.println(cartes[i]);
	}

	

    }
}
