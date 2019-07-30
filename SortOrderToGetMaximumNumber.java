package ari;
import java.util.*;

class SortByOwnMeans implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
	
		String p = s1+s2;
		String q = s2+s1;
		return (p.compareTo(q)>0?-1: 1);
	}
}


public class SortOrderToGetMaximumNumber {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String output = "";
		ArrayList<String> ar = new ArrayList<String>();
		for(int i=0; i<num ; i++) {
			
			ar.add(scan.next());
			
		}
		scan.close();
		Collections.sort(ar, new SortByOwnMeans()); 
		 
		for(int i=0; i<num; i++) {
			
			output += ar.get(i);
			
		}
		
		System.out.println(output);
	}

}
