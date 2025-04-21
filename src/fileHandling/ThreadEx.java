package fileHandling;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ThreadEx 
{

	public static void main(String[] args) 
	{
		try
		{
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\priya\\OneDrive\\Desktop\\Gupta.txt");
			PrintWriter pw=new PrintWriter(fos);
			pw.print("Hi!!!");
			pw.print(" My Name is Aarti");
			pw.flush();
			System.out.println("File written successfully!!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
