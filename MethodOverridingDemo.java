package NikhilMain;

import Nikhil.Batsmen;// child
import Nikhil.Bowler; // child
import Nikhil.Cricket; // parents

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Cricket obj2 = new Cricket();
		System.out.println(" <------ " + obj2.Cricketer()+"------->");
		
		
		Cricket obj = new Batsmen();
		System.out.println("My Batsmen Is =" + obj.Cricketer());
		
		
		Cricket obj1 = new Bowler();
		System.out.println("My Bowller Is =" + obj1.Cricketer());		
	}

}
