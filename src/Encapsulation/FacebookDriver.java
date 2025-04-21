package Encapsulation;

import java.util.Scanner;

public class FacebookDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a user ID");
		String userId=sc.next();
		Facebook fb=new Facebook();
		fb.set_userName(userId);
		System.out.println("User name is "+fb.get_userName());
		System.out.println("user Id is "+fb.get_userId());
		System.out.println("Enter passsword");
		String pass=sc.next();
		fb.set_password(pass);
		
	}

}
