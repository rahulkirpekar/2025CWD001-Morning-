package collectonfrmwrk.maptopic;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Maintain Insertion Order -- Key
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		
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
