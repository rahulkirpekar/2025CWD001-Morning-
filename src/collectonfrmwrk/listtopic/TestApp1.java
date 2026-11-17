package collectonfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(true);// 0 --boolean---Boolean		Auto-Boxing - [primitive convert into object]
		list.add('r');// 1--char-------Character
		list.add("royal");// 2<--itr--String
		list.add(12);// 3--int---------Integer
		list.add(6543L);// 4--long-----Long
		list.add(654.6543);// 5--double--Double
		list.add(543.6543f);// 6--float---Float
		
		Student s1= new Student(1,"rahul",12,100);
		list.add(s1);// 7--UDC objects
		
		System.out.println("list.size() : " + list.size());

//		Object obj = list.get(7);
//		System.out.println("obj  : " + obj );// UnBoxing = [object convert into value]
/*
		// 1. Standard for Loop --[Forward + Backward Direction]
		for(int i = 0 ; i < list.size(); i++) 
		{
			Object obj = list.get(i);
			
			if(obj instanceof Student) 
			{
				Student s = (Student)obj;
				System.out.println("list.get("+ i +") : " + s.getRno()+" "+ s.getName()+" "+s.getStd()+" " + s.getMarks());
			}else 
			{
				System.out.println("list.get("+ i +") : " + obj);
			}
		}
		-------------------------------------------------------
		// 2. Enhanced for Loop / Advanced for Loop / ForEach Loop --- [Forward Direction]
		for(Object obj : list) 
		{
			if (obj instanceof Student) 
			{
				Student s= (Student)obj;
				System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " +s.getMarks());
			}
			else 
			{
				System.out.println(obj);
			}
		}
//		-------------------------------------------------------
		// 3. Traditional Way - By Iterator -[Forward Direction]
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student) 
			{
				Student s= (Student)obj;
				System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " +s.getMarks());
			}
			else 
			{
				System.out.println(obj);
			}
		}
 */		
		// 4. Traditional Way - By ListIterator -[Forward Direction + Backward Direction]
		//-------------------------------------------------------------------------------
		ListIterator itr = list.listIterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student) 
			{
				Student s= (Student)obj;
				System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " +s.getMarks());
			}
			else 
			{
				System.out.println(obj);
			}
		}
		System.out.println("-----------------------------");
	
		while(itr.hasPrevious()) 
		{
			Object obj = itr.previous();
			
			if (obj instanceof Student) 
			{
				Student s= (Student)obj;
				System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " +s.getMarks());
			}
			else 
			{
				System.out.println(obj);
			}
		}
		
		
		
	}
}