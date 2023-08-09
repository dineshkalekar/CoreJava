package NikhilMain;

import Nikhil.EmployeeClass;
import Nikhil.ManagerClass;
import Nikhil.SalesPersonClass;

public class InheritanceMainHierachicalType {

	public static void main(String[] args) {
		EmployeeClass emp=new EmployeeClass(101,"Nikhil Kontham",240000);
		System.out.println(" "+emp);
		
		ManagerClass mng=new ManagerClass(202,"Appu Bandgar",450000,"Marketing Dept.",6);
		System.out.println(" "+mng);
		
		SalesPersonClass sp=new SalesPersonClass(303,"Sachin Bandgar",360000,450000);
		System.out.println(" "+sp);

	}

}
