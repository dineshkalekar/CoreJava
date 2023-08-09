package CollectionMain;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> cricketer=new Vector<>();
		
		System.out.println("capacity="+cricketer.capacity());
		cricketer.add("1.MSDhoni");
		cricketer.add("2.Virat");
		cricketer.add("3.Sachin");
		cricketer.add("4.Smith");
		System.out.println(cricketer);
		
		for (String val:cricketer) {
			System.out.println(val);
		}
		System.out.println("capacity="+cricketer.capacity());
		System.out.println("check cricketers contains MsDhoni=="+cricketer.contains("1.MSDhoni"));
		
	
	}

}
