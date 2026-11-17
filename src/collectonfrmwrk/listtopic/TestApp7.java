package collectonfrmwrk.listtopic;

import java.util.Iterator;
import java.util.Vector;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		Vector<String> list = new Vector<String>();
				
		// synchronized--Threadsafe---At a a only one Thread can acceess.
		
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
