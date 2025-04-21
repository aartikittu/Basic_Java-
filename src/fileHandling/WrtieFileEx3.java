package fileHandling;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WrtieFileEx3 {

	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("C:\\Users\\priya\\OneDrive\\Desktop\\aarti.txt");
			PrintWriter pw=new PrintWriter(fos);
			pw.print("Hi HEllooooo");
			pw.flush();
			System.out.println("File written successfully!!!!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
