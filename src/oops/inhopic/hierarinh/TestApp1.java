package oops.inhopic.hierarinh;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TechEmployee techEmp = new TechEmployee();
		techEmp.scanData();
		techEmp.dispData();
		
		ManagementEmployee manageEmp = new ManagementEmployee();
		manageEmp.scanData();
		manageEmp.dispData();
	}
}
