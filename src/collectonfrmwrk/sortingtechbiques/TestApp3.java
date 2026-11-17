package collectonfrmwrk.sortingtechbiques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
//		List --> -
//		Set  --> TreeSet
//      Queue--> PriorityQueue
//      Map  --> TreeMap		
		
		ArrayList list= new ArrayList();

		list.add(12);
		list.add(true);
		list.add(12.543);
		list.add(412.543f);
		list.add("rahul");
		list.add("vishu");
		list.add("kunal");
		
		Iterator itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
		System.out.println("-----------------------------------");
		
		// sorting ---Ascending order
		
//		Collection -- Interface
//		Collections--Utility class
		
		Collections.sort(list);// ClassCastException
		
		itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
	}
}
