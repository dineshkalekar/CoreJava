package NikhilMain;

import Nikhil.ConstractorDemo;

public class ConstractorMain {

	public static void main(String[] args) {
//		ConstractorDemo cd=new ConstractorDemo();
//		System.out.println(cd.mcity);
//		ConstractorDemo obj1= new ConstractorDemo(101);
//		System.out.println(obj1.mid);
//		ConstractorDemo obj2=new ConstractorDemo("Dinesh",45000);
//		String tst = obj2.mname + String.valueOf(obj2.msalary);
//		System.out.println(tst);
//		System.out.println(obj2.mname);
//		
		ConstractorDemo obj=new ConstractorDemo();
		obj.Display();
		ConstractorDemo obj1=new ConstractorDemo(101);
		obj1.Display();
		ConstractorDemo obj2=new ConstractorDemo("sagar",60000);
		obj2.Display();
		ConstractorDemo obj3=new ConstractorDemo();
		obj3.Display();
	
	}

}
