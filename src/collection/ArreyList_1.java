package collection;

import java.util.ArrayList;

public class ArreyList_1 {

	public static void main(String[] args) {
		
//		Array List:-
//		Array List is not synchronized(no insertion order).
//	    ArrayList is not thread safe.
//		ArrayList is high on performance
//		ArrayList li = 'new ArrayList();
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Velocity");
		a.add("Batch");
		a.add(null);
		a.add("Katraj");
		a.add(null);
		a.add("");     //this will not show null word in console.
		a.add("Katraj");
		
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		System.out.println(a.get(4));
		System.out.println(a.get(5));
		System.out.println(a.get(6));
		System.out.println(a.size());
		
		System.out.println();
		
		
		
		
		ArrayList al = new ArrayList();
		
		al.add(108);
		al.add("Maharashtra");
		al.add(105.25);
		al.add('A');
		al.add('A');
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.size());


	}

}
