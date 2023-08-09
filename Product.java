package Main;

public class Product {
	private int did;
	private String dname;
	private float salary;

	Product() {
		did = 101;
		dname = "Swapnil";
		salary = 100;
	}

	Product(int id, String name, float salary) {
		did = id;
		dname = name;
		this.salary = salary;
	}
	public int getdid() // get method
	{
		return did;
	}
	public String getdname() 
	{
		return dname;
	}
	public float getsalary() 
	{
		return salary;
	}
	public void setdid(int id) //setter method
	{
		did=id;
	}
	public void setdname(String name) 
	{
		dname=name;
	}
	public void setsalary(float salary) 
	{
		this.salary=salary;
	}
	

	public String toString() {
		return ("Prpduct=" + did + " " + dname + " " + salary + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prod1 = new Product(); // Default contractor
		System.out.println(prod1);
		Product prod2 = new Product(102, "Amit", 5600); // parameter contractor
		System.out.println(prod2);
		Product prod3=new Product(103,"Dinesh",4000); // get method
		System.out.println(prod3);
		prod3.setdname("Suresh");
		System.out.println(prod3);
	}

}
