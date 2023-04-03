package collection;

import java.util.Vector;

public class Vector_3 {

	public static void main(String[] args) {
		
//		Vectors:-
//		• Vectbrs is synchronized.
//		• Vector is thread safe.
//		• Vector is legacy class.
//		• Vector is slower than Array list.
//		• Data structure is doubling.
//		Vector<String> v =new Vector<>();
		
		Vector v = new Vector();
		
		v.add("Velocity");
		v.add(200);
		v.add(null);
		v.add("Katraj");
		v.add(null);
		v.add(250.555);     
		v.add('A');
		
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
		System.out.println(v.get(4));
		System.out.println(v.get(5));
		System.out.println(v.get(6));
		System.out.println(v.size());
		
		System.out.println();
		

	
	}

}
