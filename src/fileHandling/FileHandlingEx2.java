package fileHandling;

import java.io.FileInputStream;

public class FileHandlingEx2 {

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin=new FileInputStream("C:\\Users\\priya\\OneDrive\\Desktop\\Aarti.txt");			
		
		try
		{
			int ch=fin.read();
			while(ch!=-1)
			{
				System.out.println((char)ch);
				ch=fin.read();
			}
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);

			
		}
	}
}
