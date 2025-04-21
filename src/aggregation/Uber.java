package aggregation;

public class Uber 
{
	String area;
	String reg_no;
	
	Uber(String area, String reg_no)
	{
		this.area=area;
		this.reg_no=reg_no;
	}
	
	public void uberDetails()
	{
		System.out.println("Area: "+area);
		System.out.println("Cab no: "+reg_no);

	}
	
}
