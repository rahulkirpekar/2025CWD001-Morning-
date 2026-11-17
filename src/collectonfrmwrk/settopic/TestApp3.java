package collectonfrmwrk.settopic;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Ascending Order Sorting 
		TreeSet<String> setObj = new TreeSet<String>();
		
		setObj.add("ganesh");
		setObj.add("ankur");
		setObj.add("sagar");
		setObj.add("ramesh");
		setObj.add("kunal");
		setObj.add("ankur");
		setObj.add("sagar");
		setObj.add("ramesh");
		setObj.add("kunal");
		setObj.add("rahul");
		setObj.add("rahul");
		
		Iterator<String> itr = 	setObj.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
