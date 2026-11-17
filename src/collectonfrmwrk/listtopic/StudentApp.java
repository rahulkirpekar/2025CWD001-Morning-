package collectonfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp 
{
	public static int searchStudentByRno(ArrayList<Student> list , int rno) 
	{
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			
			if (s.getRno() == rno) 
			{
				return i;// i as index return 
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Student s= null;
		int choice = 0;
		Scanner sc= new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		do 
		{
			System.out.println("Enter below choice :  ");
			System.out.println("1) For Add Student");
			System.out.println("2) For Update Student By Rno");
			System.out.println("3) For Delete Student By Rno");
			System.out.println("4) For Search Student By Rno");
			System.out.println("5) For Display All Student Records");
			System.out.println("6) For Exit Student App");
			choice = sc.nextInt();

			switch (choice) 
			{
				case 1: 
						System.out.println("Enter Rno : ");
						int rno = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Name : ");
						String name = sc.nextLine();
						System.out.println("Enter Std : ");
						int std = sc.nextInt();
						System.out.println("Enter Marks : ");
						int marks = sc.nextInt();
						s = new Student(rno, name, std, marks);
						list.add(s);
						System.out.println("Student record succssfully added.");
						break;
				case 2:
						System.out.println("Enter Rno which you want to Update in Database : ");
						rno = sc.nextInt();
					
						int index = searchStudentByRno(list, rno);
						
						if (index != -1) 
						{
							s = list.get(index);
							
							s.updateStudent();
							
							list.set(index, s);
							
							System.out.println("Student Rno : " + rno+" is succssfully updated.");
						} 
						else 
						{
							System.out.println("Student Rno :  "+rno+" is not found in Database.");
						}
					
						break;
				case 3:
						System.out.println("Enter Rno which you want to Delete in Database : ");
						rno = sc.nextInt();
					
						index = searchStudentByRno(list, rno);
						
						if (index != -1) 
						{
							list.remove(index);
							System.out.println("Student Rno : " + rno+" is succssfully deleted.");
						} 
						else 
						{
							System.out.println("Student Rno :  "+rno+" is not found in Database.");
						}
						break;
						
				case 4: System.out.println("Enter Rno which you want to Search in Database : ");
						rno = sc.nextInt();
						
						index = searchStudentByRno(list, rno);
						
						if (index != -1) 
						{
							Student s1 = list.get(index);
							
							System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd()+" " + s1.getMarks());
							
						} 
						else 
						{
							System.out.println("Student Rno :  "+rno+" is not found in Database.");
						}
						break;
				case 5:
						for (int i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							System.out.println(s.getRno()+" "  +s.getName()+" "  +s.getStd()+" "+s.getMarks() );
						}
						break;
				case 6:
						System.out.println("Student Appl will be Exit");
						try 
						{
							Thread.sleep(500);
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
						System.exit(1);
						break;
				default:
						break;
			}
		}while(choice!=6);
	}
}