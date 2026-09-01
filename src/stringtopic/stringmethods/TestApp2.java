package stringtopic.stringmethods;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		boolean flag = true;
		
		for (int i = 0, j = (name.length()-1); i < name.length(); i++,j--) 
		{
			System.out.println("name.charAt("+i+") : "+name.charAt(i)+"-----name.charAt("+j+") : "+name.charAt(j));
			
			if(name.charAt(i)!=name.charAt(j)) 
			{
				flag = false;
				break;
			}
		}
		if (flag) 
		{
			System.out.println(name+" is palindrome.");
		} else 
		{
			System.out.println(name+" is not palindrome.");
		}
	}
}
