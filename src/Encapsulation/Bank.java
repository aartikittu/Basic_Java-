package Encapsulation;

public class Bank 
{
	private String bankName; //r
	private String managerName; //r,w
	private String branch;	//r,w
	private String headOffice; //r
	
	public String get_bankName()
	{
		return bankName; 
	}
	public String get_managerName()
	{
		return managerName;
	}
	public void set_managerName(String managerName)
	{
		this.managerName=managerName;
	}
	public String get_branch()
	{
		return branch; 
	}
	public void set_branch(String branch)
	{
		this.branch=branch; 
	}
	public String get_headOffice()
	{
		return headOffice; 
	}
}
