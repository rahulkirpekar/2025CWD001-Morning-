package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		FileInputStream fin  = null;
		FileOutputStream  fout = null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2025CWD001(Morning)\\src\\iotopic\\byteorientedway\\TeestApp2.java");

			fout = new FileOutputStream("C:\\Users\\Royal\\eclipse-workspace\\2025CWD001(Morning)\\src\\iotopic\\byteorientedway\\DupTeestApp2.java");
			
			int temp;
			
			while( (temp = fin.read()) != -1) 
			{
				System.out.print((char)temp);
				
				fout.write(temp);
			}
			
			fin.close();
			fout.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}