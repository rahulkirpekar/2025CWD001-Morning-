package oops.consttopic;


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
		
		id = 0;
		name = "NONAME";
		salary = 0;
		dsgn = "NODSGN";
		orgName = "NOORG";
		
		System.out.println("=====EXIT : Default Constructor=====");
	}

	// TWO--Para
	public Employee(int id,String name) 
	{
		this();
		System.out.println("=====START : TWO--PARA Constructor=====");
		this.id = id;
		this.name = name;
		System.out.println("=====EXIT : TWO--PARA Constructor=====");
	}

	// THREE--Para
	public Employee(int id,String name,int salary) 
	{
		this(id, name);
		System.out.println("=====START : THREE--PARA Constructor=====");
		this.salary = salary;
		System.out.println("=====EXIT : THREE--PARA Constructor=====");
	}
		
	// FOUR--Para
	public Employee(int id,String name,int salary,String dsgn) 
	{
		this(id, name, salary);
		System.out.println("=====START : FOUR--PARA Constructor=====");
		this.dsgn = dsgn;
		System.out.println("=====EXIT : FOUR--PARA Constructor=====");
	}
	// FIVE---PARA
	public Employee(int id,String name,int salary,String dsgn,String orgName) 
	{
		this(id,name,salary,dsgn);
		System.out.println("=====START : FIVE--PARA Constructor=====");
		this.orgName = orgName;
		System.out.println("=====EXIT : FIVE--PARA Constructor=====");
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
	public void dispData() 
	{
		System.out.println(id+" " + name + " " + salary + " " + dsgn + " " + orgName+"---"+this);
	}
}
