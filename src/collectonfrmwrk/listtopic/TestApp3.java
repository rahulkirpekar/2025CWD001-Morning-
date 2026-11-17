package collectonfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(90);//0
		list.add(80);//1
		list.add(70);//2
		list.add(60);//3
		list.add(50);//4
		list.add(49);//5
		
		Iterator<Integer> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Integer value = itr.next();
			System.out.println(value);
		}
		System.out.println("----------------------------");
		
		
		Integer v[] = list.toArray(new Integer[0]);
		
		for (int i = 0; i < v.length; i++) 
		{
			System.out.println("v["+ i +"] : " +v[i]);
		}
		
//		list.remove(3);// index
//		list.remove(Integer.valueOf(60));// 60 as value
		
//		itr =	list.iterator();
//		while (itr.hasNext()) 
//		{
//			Integer value = itr.next();
//			System.out.println(value);
//		}
	}
}
