package fileHandling;

import java.io.FileInputStream;

public class FileHandlingEx3 {

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin=new FileInputStream("C:\\Users\\priya\\OneDrive\\Desktop\\Gupta.txt");
			try
			{
				int i=fin.read();
				while(i!=-1)
				{
					System.out.println((char)i);
					i=fin.read();
				}
				
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
