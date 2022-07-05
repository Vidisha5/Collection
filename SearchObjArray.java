import java.util.Arrays;
import java.util.Comparator;

public class SearchObjArray {

	
	public static void main(String[] args) {
		String[] sa= {"one","two","three","four"};
		
		Arrays.sort(sa);
		
		for(String s:sa) {
			System.out.println(s);
		}
		
		
		System.out.println(Arrays.binarySearch(sa, "one"));
		
		ResortComparator rs=new ResortComparator();
		
		Arrays.sort(sa,rs);
		
		for(String s:sa) {
			System.out.println(s);
		}
		
		System.out.println(Arrays.binarySearch(sa, "one",rs));
	}
	static class ResortComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			
			return o2.compareTo(o1);
		}
		
	}
}
