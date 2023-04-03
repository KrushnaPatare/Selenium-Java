package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		
//		Hash Set:-
//		• Hashset stores the elements by using a mechanism called hashirw.
//		• Hashset contains unique elements only.
//		• HashSet class is non synchronized.
//		HashSet allows null value.
//		• HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//		HashSet<String> h = new HashSet<String>();	
//      Set doesn't save duplicate data.
//		insertion order is not maintained.
		
		HashSet hs = new HashSet();
		
		hs.add("VimanNagar");
		hs.add(100);
		hs.add('%');
		hs.add(99.99);
		hs.add(null);
		hs.add(100);
		
		Iterator i = hs.iterator();
	
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
