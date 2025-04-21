package Polymorphism;

public class VehicleDriver 
{
	public static void main(String[] args) 
	{
		Vehicle v=new Vehicle();
		v.ccEngine();
		
		Car c=new Car();
		c.ccEngine();
		
		Vehicle v1=c;
		v1.ccEngine();
	}
}
