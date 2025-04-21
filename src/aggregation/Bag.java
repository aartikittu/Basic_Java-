package aggregation;

public class Bag 
{
	String color;
	int bag_price;
	Book b;
	public Bag(String color, int bag_price)
	{
		this.color=color;
		this.bag_price=bag_price;
	}
	public String getBookName()
	{
		return b.book_name; 
	}
	public void addBook(Book b)
	{
		this.b=b;
	}
	public void removeBook()
	{
		b=null;
	}
	public void bagDetails()
	{
		System.out.println("\nBag details are as follow----->\n ");
		System.out.println("Color: "+color);
		System.out.println("Bag price: "+ bag_price);
	}
}
