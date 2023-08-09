package code;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String ename;
	private float salary;
	
	public Employee()
	{
		
	}
	public Employee(int id,String name,float salary)
	{
		eid=id;
		ename=name;
		this.salary=salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String toString() 
	{
		return(" "+eid+" "+ename+" "+salary);
	}
	@Override
	public int compareTo(Employee obj) {
		if(this.eid==obj.eid)
		
		return 0;
		else
			if(this.eid>obj.eid)
				return 1;
		else 
			return -1;
		
	}
	
}
