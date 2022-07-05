import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {

	
	public static void main(String[] args) {
		ArrayList<String> coll=new ArrayList<>();
		coll.add("Aspen");
		coll.add("Denver");
		coll.add("Boulder");
		coll.add("Telluride");
		Collections.sort(coll);
		System.out.println(coll);
	}
}
