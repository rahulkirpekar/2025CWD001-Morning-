package collectonfrmwrk.sortingtechbiques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		List --> -
//		Set  --> TreeSet
//      Queue--> PriorityQueue
//      Map  --> TreeMap		
		
		ArrayList<Integer> list= new ArrayList<>();
		
		list.add(10);
		list.add(45);
		list.add(21);
		list.add(87);
		list.add(34);
		list.add(12);
		
		Iterator<Integer> itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			Integer value = (Integer) itr.next();
			System.out.println(value);
		}
		System.out.println("-----------------------------------");
		
		// sorting ---Ascending order
		
//		Collection -- Interface
//		Collections--Utility class
		
		Collections.sort(list);
		
		itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			Integer value = (Integer) itr.next();
			System.out.println(value);
		}
	}
}
