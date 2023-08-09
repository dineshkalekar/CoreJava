package NikhilMain;

import Nikhil.A;
import Nikhil.B;
import Nikhil.CommanClassAbstract;

public class AbstractDemo {

	public static void main(String[] args) {
	//	CommanClassAbstract ab=new CommanClassAbstract();// we can not create obj of Abstract Class 
		
		A a= new A();
		a.show();
		a.display();
		
		B b=new B();
		b.show();
		b.display();
		
		CommanClassAbstract obj=new A();// We can create reference of Abstract Class 
		obj.show();
		obj.display();

	}

}
