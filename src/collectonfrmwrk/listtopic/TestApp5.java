package collectonfrmwrk.listtopic;

import java.util.ArrayList;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mainList = new ArrayList<String>();
		
		mainList.add("rahul");//0
		mainList.add("ankur");//1
		mainList.add("kunal");//2
		mainList.add("sagar");//3
		mainList.add("ankur");//4


//		Object obj [] =	mainList.toArray();
		
//		for (int i = 0; i < obj.length; i++) 
//		{
//			if (obj[i] instanceof String) 
//			{
//				String a = (String)obj[i];
//				System.out.println(obj[i]);
//			}
//		}
		
		String values[] = mainList.toArray(new String[2]);
		
		for (int i = 0; i < values.length; i++) 
		{
			System.out.println("values["+i+"] : " + values[i]);
		}
//		----------------------------------------------------------
//		ArrayList<String> subList = new ArrayList<String>();
//		subList.add("ankur");//0
//		subList.add("kunal");//1
//		subList.add("ankur");//2
//		subList.add("xyz");//2
//		
//		boolean flag = mainList.containsAll(subList);
//		
//		System.out.println("flag : " + flag);

	}
}
