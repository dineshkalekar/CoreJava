package CollectionMain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import CollectionCode.ClassNameComparator;
import CollectionCode.ClassSalaryComparator;
import code.Employee;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Employee> list1= new ArrayList<>();
		list1.add(new Employee (101,"Dinesh",9000));
		list1.add(new Employee (102,"Suresh",4800));
		list1.add(new Employee (100,"Ramesh",6000));
		list1.add(new Employee (99,"Mukesh",7800));
		
		
		System.out.println(list1);
		System.out.println("See Account Details");
		for(Employee emp:list1) {
			System.out.println(emp);
		}
		Collections.sort(list1);
		System.out.println("Data After Sorting According  to ID");
		for(Employee emp:list1) 
		{
			 
			System.out.println(emp);
		}
		System.out.println("Sorting data According to Name");
		Collections.sort(list1,new ClassNameComparator());
		for(Employee emp:list1) 
		{
			System.out.println(emp);
		}
		System.out.println("Sorting Data Accorind to Salary");
		Collections.sort(list1,new ClassSalaryComparator());
		for(Employee emp:list1) 
		{
			System.out.println(emp);
		}		
	}
}
