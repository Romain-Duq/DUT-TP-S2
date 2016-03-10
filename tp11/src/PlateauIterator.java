import java.util.Iterator;

public class PlateauIterator implements Iterator<Integer>{
	private Integer[][] tableau;
	private int x=0, y=0;
	
	public PlateauIterator(Integer[][] tab) {
		this.tableau=tab;
	}
	
	public boolean hasNext(){
		return x!=tableau.length;
	}
	
	public Integer next(){
		 Integer res = tableau[x][y];
		 if(y<tableau[0].length-1){
			 y++;
		 }else{
			 y=0;
			 x++;
		 }
		 return res;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		Integer[][] tab = new Integer[2][2];
		tab[0][0]= new Integer(1);
		tab[0][1]= new Integer(2);
		tab[1][0]= new Integer(3);
		tab[1][1]= new Integer(4);
		
		
		
		for (Iterator<Integer> ite =new PlateauIterator(tab); ite.hasNext();){
			System.out.println(ite.next());
		}
	}
	
}
