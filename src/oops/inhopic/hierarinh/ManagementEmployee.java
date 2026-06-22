package oops.inhopic.hierarinh;

import java.util.Scanner;

// HIerarchical Inheritance
public class ManagementEmployee extends Employee
{
	String managementTask;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter Employee OrgName : ");
		orgName = sc.nextLine();
		System.out.println("Enter Employee ManagementTask : ");
		managementTask = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " +orgName+" " + managementTask);
	}
}
