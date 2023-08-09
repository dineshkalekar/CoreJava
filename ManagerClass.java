package Nikhil;

public class ManagerClass extends EmployeeClass{
	private String dname;
	private int SubOrd;
	

	public ManagerClass(int id, String name, float salary,String dname,int SubOrd) {
		super(id, name, salary);
		this.dname=dname;
		this.SubOrd=SubOrd;
	}


	@Override
	public String toString() {
		return "ManagerClass [dname=" + dname + ", SubOrd=" + SubOrd + "]";
	}

}
