package oops.classandobj;

import java.util.Scanner;

// Increase Data Security
//      |
//------------------
// Pure Encapsulation = 1. Dm's(private) + 2. Mf's(public)

public class Employee 
{
	private int id;
	private String name;
	private int salary;
	private String dsgn,orgName;
	
	// 1. Default Constructor
	public Employee() 
	{
		System.out.println("=====START : Default Constructor=====");
		
		id = 1;
		name = "Ganesh";
		salary = 10000;
		dsgn = "SE";
		orgName = "Google";
		
		System.out.println("=====EXIT : Default Constructor=====");
	}
	
	// 2. Para + Copy Constructor
	public Employee(int id,String name,int salary,String dsgn) 
	{
		System.out.println("=====START : PARA Constructor=====");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
		System.out.println("=====EXIT : PARA Constructor=====");
	}
	public Employee(int id,String name,int salary,String dsgn,String orgName) 
	{
		System.out.println("=====START : PARA Constructor=====");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
		this.orgName = orgName;
		System.out.println("=====EXIT : PARA Constructor=====");
	}
	// Para--->Copy Constructor
	public Employee(Employee e) 
	{
		System.out.println("=====START : COPY Constructor=====");
		this.id = e.id;
		this.name = e.name;
		this.salary = e.salary;
		this.dsgn = e.dsgn;
		this.orgName = e.orgName;
		System.out.println("=====EXIT : COPY Constructor=====");
	}
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Designation : ");
		dsgn = sc.nextLine();
		System.out.println("Enter Employee OrgName : ");
		orgName = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name + " " + salary + " " + dsgn + " " + orgName+"---"+this);
	}
}
