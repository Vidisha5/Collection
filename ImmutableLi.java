import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableLi {

	
	public static void main(String[] args) {
		List<Integer> newList = new ArrayList<>();
		newList.add(2);
		newList.add(1);
		System.out.println(newList);
		
		newList= Collections.unmodifiableList(newList);
		newList.add(1, 5);
		System.out.println(newList);
	}
}
