package iotopic.byteorientedway;

import java.io.FileInputStream;

// Byte OrientedWay--Read from File
public class TestApp3 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		
		// read from File --FileInputStream
		
		FileInputStream fin = null;
		
		int temp;
		
		try 
		{
			// 1. Open File Connection
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2025CWD001(Morning)\\royal.txt");

			// 2. read from File
			
			while( (temp = fin.read())  != -1) 
			{	
				sb.append((char)temp);
			}

			// File connnection close
			fin.close();
		
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb);
	}
}