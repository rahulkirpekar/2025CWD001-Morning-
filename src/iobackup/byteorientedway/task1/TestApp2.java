package iobackup.byteorientedway.task1;

import java.io.FileInputStream;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		FileInputStream fin = null;
		
		try 
		{
			// 1. Open File Connection
			fin =  new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2025CWD001(Morning)\\backup1.txt");
			
			// 2. read operation

			int temp;
			
			// byte value--->Asci value--int
			
			while(	(temp = fin.read())	!= -1) 
			{
				sb.append((char)temp);
			}

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			// 3. Close Fil Connection
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("Final String : " + sb);
	}
}