package code;

public class Manager extends Employee{
	
	private String dname; 
	private int subOrd;
	
	public Manager(int id,String name,float salary,String dname,int subOrd) 
	{
		super(id,name,salary);
		this.dname=dname;
		this.subOrd=subOrd;
	}
	public String toString() 
	{
		return(super.toString()+""+dname+""+subOrd);
	}

}
