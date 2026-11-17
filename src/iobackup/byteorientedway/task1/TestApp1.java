package iobackup.byteorientedway.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


//					  FileOutpuStream
//							|
// 1. Byte orientedway --- write---String(Data)
public class TestApp1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Name : ");
		String name = new Scanner(System.in).nextLine();
		
		// Data -- name
		FileOutputStream  fout  = null;
		try 
		{
			// 1. Open File Connection
			fout = new FileOutputStream("backup1.txt");
			
			// String convert into byte array
			byte b[] = name.getBytes();
			
			// 2. write operation
			fout.write(b);// String---->char array--->byte Array
			
			System.out.println("success");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				// 3. Close  File Connection
				fout.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}