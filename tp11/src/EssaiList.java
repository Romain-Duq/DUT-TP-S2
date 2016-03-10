import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class EssaiList {

	public static void main(String[] args) {
		List<String> liste = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			liste.add(""+i);
		}
		
		for (Iterator<String> ite = liste.iterator(); ite.hasNext();) {
			System.out.println(ite.next());
		}
	}
}
