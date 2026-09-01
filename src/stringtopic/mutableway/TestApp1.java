package stringtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Mutable Behaviour
		//-------------------
		// 1. StringBuilder
		// 2. StringBuffer
		
		StringBuffer sb1 = new StringBuffer("royal");
		StringBuffer sb2 = new StringBuffer("technosoft");

		System.out.println(sb1+"---"+sb1.hashCode());

		// Mutable Behaviour
		sb1.append(sb2);// sb1--// royaltechnosoft
		
		System.out.println(sb1+"---"+sb1.hashCode());
		
/*		
		String name1 = "royal";
		String name2 = "tehcnosoft";
		
		System.out.println(name1+"-----"+name1.hashCode());
		
		// Immutable Behaviour
		name1 = name1.concat(name2);// royaltechnosoft
				
		System.out.println(name1+"-----"+name1.hashCode());
*/
	}
}
