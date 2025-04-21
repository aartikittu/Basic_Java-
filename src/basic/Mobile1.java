package basic;

public class Mobile1 
{
	String brand;
	int ram;
	double price;
	Sim s;
	public Mobile1(String brand, int ram, double price)
	{
		this.brand=brand;
		this.ram=ram;
		this.price=price;

	}
	public void insertSim(Sim s)
	{
		this.s=s;
	}
	public void removeSim()
	{
		this.s=null;
	}
	public void mobileDetails()
	{
		System.out.println("Mobile brand--"+brand);
		System.out.println("Mobile ram--"+ram);
		System.out.println("Mobile price--"+price);
	}

}
