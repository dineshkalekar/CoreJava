package CollectionCode;

import java.util.Comparator;

import code.Employee;

public class ClassSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee obj3, Employee obj4) {
	if(obj3.getSalary()==obj4.getSalary())
		return 0;
	else if(obj3.getSalary()<obj4.getSalary())
		return 1;
		else return 1;
	}

	

}
