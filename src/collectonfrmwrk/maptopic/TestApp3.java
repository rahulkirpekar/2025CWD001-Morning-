package collectonfrmwrk.maptopic;

import java.util.Map;
import java.util.TreeMap;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Ascending order Soring By Key
		TreeMap<Integer, String> map = new TreeMap<>();
		
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
