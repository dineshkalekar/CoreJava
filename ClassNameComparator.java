package CollectionCode;

import java.util.Comparator;

import code.Employee;

public class ClassNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee obj1, Employee obj2) {
		
		
		return (obj1.getEname().compareTo(obj2.getEname()));
		
		
	}
	 

}
