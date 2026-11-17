package collectonfrmwrk.sortingtechbiques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		List --> -
//		Set  --> TreeSet
//      Queue--> PriorityQueue
//      Map  --> TreeMap		
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("rahul");
		list.add("ankur");
		list.add("sagar");
		list.add("jay");
		list.add("vishu");
		list.add("kunal");
		
		Iterator<String> itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
		System.out.println("-----------------------------------");
		
		// sorting ---Ascending order
		
//		Collection -- Interface
//		Collections--Utility class
		
		Collections.sort(list);
		
		itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
