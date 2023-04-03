package collection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapAndHashTable {

	public static void main(String[] args) {
		
//		HashMap:-
//		•Java HashMap contains values based on the key.
//		•Java HashMap contains only unique keys.
//		•Java HashMap may have one null key and multiple null values.
//		•Java HashMap is not synchronized.
//		•Java HashMap maintains no order.
//		HashMap<lnteger, String> hmap = new HashMap<lnteger, String>();
//		
//		HashTable:-
//	
//		Java Hashtable contains values based on the key.
//		Java Hashtable contains only unique keys.
//		Java Hashtable does not accept any null key or value.
//		Java Hashtable is synchronized.
//		Java Hashtable maintains no order.
//		Hashtable <String, String> htable = new Hashtable <String, String>();

		
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>(); 
		
		hmap.put(1,"Valuetainment");
		hmap.put(5, "Dollar");
		hmap.put(10, "India");
		hmap.put(15, null);
		
		System.out.println(hmap.get(10));
		
		System.out.println(hmap.size());
		
		System.out.println();
		System.out.println();
		
		HashMap hs= new HashMap();
		
		hmap.put(1, "251");
		
		
		
		Hashtable <String,String> ht = new Hashtable<String,String>();
		
		
		
		ht.put("Maharashtra","Mumbai");
		ht.put("Madhyapradesh", "Bhopal");
		ht.put("Karnatak","Banglore");
		ht.put("Gujrat","Ahmedabad");
		
		
		System.out.println(ht.get(1));
		System.out.println(ht.get("Gujarat"));
		System.out.println(ht.size());
		System.out.println();
		System.out.println();
		

		Hashtable  hst = new Hashtable();
		
		hst.put("Maharashtra","Mumbai");
		hst.put(1, "Bhopal");
		hst.put('K',"Banglore");
		hst.put("Gujrat",20);
		
		System.out.println(hst.get(1));
		System.out.println(hst.get("Gujrat"));
		System.out.println(hst.get("Maharashtra"));
		System.out.println(hst.get('K'));
		
		System.out.println(hst.size());
	}

}
