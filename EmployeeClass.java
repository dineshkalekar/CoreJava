package Nikhil;

public class EmployeeClass {
	private int id;
	private String name;
	private float salary;
	public EmployeeClass(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeClass [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
