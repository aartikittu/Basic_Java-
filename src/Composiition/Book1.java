package Composiition;

public class Book1
{
	String bname;
	int bid;
	int price;
	String author;
	Page p;
	public Book1(String bname, int bid, int price, String author, Page p)
	{
		this.bname=bname;
		this.bid=bid;
		this.price=price;
		this.author=author;
		this.p=p;
	}

	public void bookDetails()
	{
		System.out.println("Book name: "+bname);
		System.out.println("Book id: "+bid);
		System.out.println("Book price: "+price);
		System.out.println("Book author: "+author);
		
	}
}
