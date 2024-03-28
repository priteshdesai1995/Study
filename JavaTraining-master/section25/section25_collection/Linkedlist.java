package section25_collection;

import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(0, 5);
		ll.addFirst(50);
		ll.addLast(100);
		
		ll.descendingIterator();	//return in decending order
		System.out.println("First: "+ll.getFirst());

		System.out.println("First: "+ll.getLast());
		
		System.out.println("peek"+ll.peek());
		
		System.out.println("pool"+ll.poll());	//ll.remove();
		
		LinkedList <Integer> clone = new LinkedList<>();
		clone= (LinkedList)ll.clone();
		

		
		
		//System.out.println(al1);
		
		for (int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		for (int i=0;i<clone.size();i++)
		{
			System.out.println(ll.get(i));
		}
 
	}

}
