package polymorphism.runtime.upcastinganddowncasting;

import java.util.Scanner;

public class TestApp1 
{		
											  // Upcasting
	public static void getResultBasedOnPlace(Person person) 
	{
		person.getBehave();
		
		if(person instanceof School) 
		{
			// Downcasting
			School student = (School)person;
			student.getExamResult();
		}
		else if(person instanceof PublicPlace) 
		{
			// Downcasting
			PublicPlace citizen = (PublicPlace)person;
			citizen.getPublicEvent();
		}
		else if(person instanceof Home) 
		{
			// Downcasting
			Home child = (Home)person;
			child.getMoviewOnTime();
		}
		else if(person instanceof Org) 
		{
			// Downcasting
			Org employee = (Org)person;
			employee.getSalary();
		}
	}
/*	
	public static void getResultBasedOnPlace(School school) 
	{
		school.getBehave();
		school.getExamResult();
	}
	
	public void getResultBasedOnPlace(PublicPlace pobj) 
	{
		pobj.getBehave();
		pobj.getPublicEvent();
	}
	public void getResultBasedOnPlace(Home home) 
	{
		home.getBehave();
		home.getMoviewOnTime();
	}
	public void getResultBasedOnPlace(Org org) 
	{
		org.getBehave();
		org.getSalary();
	}
*/	
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For PublicPlace");
		System.out.println("4) For Home");
		int choice = sc.nextInt();

		Person person = null;
		
		switch(choice) 
		{
			case 1: School school = new School();
					getResultBasedOnPlace(school);
					break;
	
			case 2: Org org = new Org();
					getResultBasedOnPlace(org);
					break;
	
			case 3: PublicPlace pobj = new PublicPlace();
					getResultBasedOnPlace(pobj);
					break;
	
			case 4: Home home = new Home();
					getResultBasedOnPlace(home);
					break;
		}
	}
}