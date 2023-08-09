package Main;

import code.Manager;
import code.SalesPerson;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mng=new Manager(101,"Dinesh",25000.00f,"Account",78);
		System.out.println(mng);
		SalesPerson SP=new SalesPerson(102,"Dinesh",25000,7000);
		System.out.println(SP);

	}

}
