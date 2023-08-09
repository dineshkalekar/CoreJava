package coreJava;

public class Book 
{
	private int bid;
	private String bname;
	private int bprice;

	public void accept (int id,String name,int price)
	{
		bid=id;
		bname=name;
		bprice=price;
	}
	public void display() 
	{
		System.out.println("Book Info");
		System.out.println("ID="+bid);
		System.out.println("BookName="+bname);
		System.out.println("BookPrice="+bprice);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk=new Book();
		bk.accept(100, "Java", 5000);
		bk.display();
	}
}
