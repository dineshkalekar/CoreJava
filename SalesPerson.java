package code;

public class SalesPerson extends Employee{
	private int incentive;
	
	public SalesPerson(int id,String name,float salary,int incentive) 
	{
		super(id,name,salary);
		this.incentive=incentive;
	}
	public String toString() 
	
	{
		return(super.toString()+""+incentive);
	}

}
