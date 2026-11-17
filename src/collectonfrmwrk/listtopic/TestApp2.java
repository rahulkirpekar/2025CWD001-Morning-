package collectonfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Typesafe---String
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("rahul");
		list.add("ankur");
		list.add("kunal");
		list.add("jayant");
		list.add("sujal");
		list.add("sagar");

		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
