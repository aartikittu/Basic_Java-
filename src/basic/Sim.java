package basic;

public class Sim 
{
	int simNo;
	String service_provider;
	Sim(int simNo, String service_provider)
	{
		this.simNo=simNo;
		this.service_provider=service_provider;
	}
	public void simDetails()
	{
		System.out.println("Sim Details");
		System.out.println("Sim no--"+simNo);
		System.out.println("Service Provider--"+service_provider);
	}
}
