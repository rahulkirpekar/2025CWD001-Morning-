package collectonfrmwrk.maptopic;

import java.util.HashMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// HashMap - Notmaintain Insertion Order -- key
		// LinkedHashMap - Maintain Insertion Order -- key
		// TreeMap - Ascending order wise Sorting -- key
		
		HashMap<Integer,String> map = new  HashMap<Integer,String>();
		
		map.put(11, "Ganesh"); // Entry[Key,Value]
		map.put(3, "Ankur");
		map.put(87, "Sagar");
		map.put(12, "Kunal");
		map.put(90, "Rahul");
		map.put(23, "Rakesh");
		
		// ForEach/ Enhanced / Advanced for loop
		for(	 Map.Entry<Integer, String> e : map.entrySet()) 
		{
			System.out.println(e.getKey()+"---"+e.getValue());
		}
	}
}
