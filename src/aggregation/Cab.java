package aggregation;

public class Cab 
{
	String cab_no;
	String driver_name;
	String dl_no;
	Uber u;
	
	public Cab(String cab_no, String driver_name, String dl_no)
	{
		this.cab_no=cab_no;
		this.driver_name=driver_name;
		this.dl_no=dl_no;
	}
	
	public void regCab(Uber u)
	{
		this.u=u;
	}
	public void deregCab()
	{
		this.u=null;
	}
	
	public void cabDetails()
	{
		System.out.println("Cab no: "+cab_no);
		System.out.println("Driver name: "+driver_name);
		System.out.println("Dl number: "+dl_no);
	}
	
}
