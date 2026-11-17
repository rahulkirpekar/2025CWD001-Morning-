package collectonfrmwrk.listtopic;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("rahul");//0
		list.add("ankur");//1
		list.add("kunal");//2
		list.add("sagar");//3
		list.add("ankur");//4

		Iterator<String> itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
