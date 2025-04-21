package fileHandling;

import java.io.FileInputStream;

public class FileHandlingEx {

	public static void main(String[] args) 
	{
		try	
		{
			FileInputStream fin=new FileInputStream("C:\\Users\\priya\\OneDrive\\Desktop\\Aarto.txt");
			int i=fin.read();
			System.out.println((char)i);
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
