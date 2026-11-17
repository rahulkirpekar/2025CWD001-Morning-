package collectonfrmwrk.listtopic;

import java.util.ArrayList;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mainList = new ArrayList<String>();
		
		mainList.add("rahul");//0
		mainList.add("ankur");//1
		mainList.add("kunal");//2
		mainList.add("sagar");//3
		mainList.add("ankur");//4
		
		for (int i = 0; i < mainList.size(); i++) 
		{
			System.out.println("mainList.get("+ i +") : " + mainList.get(i));
		}
		System.out.println("---------------------------------------");
		
//		boolean flag = mainList.contains("abc");
//		System.out.println("flag : " + flag);
		
//		int index = mainList.indexOf("abc");
//		System.out.println("index : " + index);
		
//		int index= mainList.lastIndexOf("ankur");
//		System.out.println("lastIndexOf : " + index);
		
//		mainList.clear();
		
//		System.out.println("mainList.size() : "  +mainList.size());
//		boolean flag = mainList.isEmpty();
//		System.out.println("flag : "  +flag);
		
		
		
//		mainList.add(1, "XYZ");/ add
//		mainList.set(1, "XYZ");//update
//		mainList.remove(3);// // remove 3 index
		
//		for (int i = 0; i < mainList.size(); i++) 
//		{
//			System.out.println("mainList.get("+ i +") : " + mainList.get(i));
//		}
		
		ArrayList<String> subList = new ArrayList<String>();
		subList.add("sujal");
		subList.add("jayant");
		subList.add("abhi");
		
		
//		mainList.addAll(subList);
		mainList.addAll(2, subList);
		
		for (int i = 0; i < mainList.size(); i++) 
		{
			System.out.println("mainList.get("+ i +") : " + mainList.get(i));
		}
	}
}
