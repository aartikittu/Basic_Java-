package Composiition;

public class Page
{
	private String page_title;
	private int page_no;
	
	public Page(String page_title, int page_no) 
	{
		super();
		this.page_title = page_title;
		this.page_no = page_no;
	}

	public String getPage_title() 
	{
		return page_title;
	}

	public int getPage_no() 
	{
		return page_no;
	}
	
	public void pageDetails()
	{
		System.out.println("Page Title: "+page_title);
		System.out.println("Page number: "+page_no);
	}
	
}
