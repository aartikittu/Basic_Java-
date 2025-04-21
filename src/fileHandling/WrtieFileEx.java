package fileHandling;

import java.io.FileOutputStream;

public class WrtieFileEx {

	public static void main(String[] args) 
	{
		try
		{	
			FileOutputStream fos=new FileOutputStream("C:\\Users\\priya\\OneDrive\\Desktop\\Gupta.txt");
			fos.write(72);
			fos.close();
			System.out.println("File written successfully!!!!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
