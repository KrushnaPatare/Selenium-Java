package collection;

import java.util.LinkedList;

public class LinkedList_2 {

	public static void main(String[] args) {
		
//		Linked List:-
//		LinkedList implements List interface.
//		LinkedList is better for manipulating data.
//		LinkedList internally uses a doubly linked list to store the elements.
//		that is (saves data in collection of 10 deta size
//		if deta size =11 then 10x2=20)
		
//		LinkedList is not synchronized(no insertion order)
//		LinkedList 11 = new LinkedList<>();
				
		
		LinkedList ll = new LinkedList<>();
		
		ll.add("Velocity");
		ll.add("Pune");
		ll.add(2022);
		ll.add(3.14);
		ll.add(null);
		ll.add(true);
		ll.add(null);
		
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));
		System.out.println(ll.get(4));
		System.out.println(ll.get(5));
		System.out.println(ll.get(6));
		System.out.println(ll.size());
		
		System.out.println();
		
		
		LinkedList<String> lt = new LinkedList<String>();
		
		lt.add("Speed");
		lt.add("Apple");
		lt.add("green");
		lt.add("Apple");
		
		System.out.println(lt.get(0));
		System.out.println(lt.get(1));
		System.out.println(lt.get(2));
		System.out.println(lt.get(3));
		System.out.println(lt.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
