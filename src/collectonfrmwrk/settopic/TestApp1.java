package collectonfrmwrk.settopic;

import java.util.HashSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Not Maintain Insertion Order
		HashSet<String> setObj = new HashSet<>();

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
