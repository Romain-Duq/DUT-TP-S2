import java.util.Random;
public class EssaiTelephone{
    public static void main(String[] args){
	for(int i=0; i<45; i=i+11){
	    Telephone tel = new Telephone(i,i,i,i,i);
	    System.out.println(tel.toString());
	}

	System.out.println("\nQuestion 2\n");

	Random rdm = new Random();

	for(int i=0;i<5; i++){
	    Telephone tel = new Telephone(rdm.nextInt(9)+1,rdm.nextInt(100),rdm.nextInt(100),rdm.nextInt(100),rdm.nextInt(100));
	    System.out.println(tel.toString());
	}
	
    }
}
