public class EssaiRoller {
	public static void main(String[] args) {
		Inscrit[] list=new Inscrit[6];
		int index=0; 
	
		//list des inscrits
		Inscrit n1 = new Inscrit(1,45,15,20);
		if(n1.dossard!=null){
			list[index]=n1;
			index=index+1;
		}
		Inscrit n2 = new Inscrit(2,32,12,45);
		if(n2.dossard!=null){
			list[index]=n2;
			index=index+1;
		}
		Inscrit n3 = new Inscrit(5,12,13,59);
		if(n3.dossard!=null){
			list[index]=n3;
			index=index+1;
		}
		Inscrit n4 = new Inscrit(12,12,15,70);
		if(n4.dossard!=null){
			list[index]=n4;
			index=index+1;
		}
		Inscrit n5 = new Inscrit(32,75,15,20);
		if(n5.dossard!=null){
			list[index]=n5;
			index=index+1;
		}
		Inscrit n6 = new Inscrit(112,75,15,20);
		if(n6.dossard!=null){
			list[index]=n6;
			index=index+1;
		}
		
		for(int i=0; i<index; i++){
			System.out.println(list[i].toString());
		}
		
	}
}
