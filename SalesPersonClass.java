package Nikhil;

public class SalesPersonClass extends EmployeeClass{
	private int incentive;

	public SalesPersonClass(int id, String name, float salary,int incentive) {
		super(id, name, salary);
		this.incentive=incentive;
	}

	@Override
	public String toString() {
		return "SalesPersonClass [incentive=" + incentive + "]";
	}
	

}
