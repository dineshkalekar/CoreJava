package CollectionMain;

import java.util.Collections;
import java.util.LinkedList;

public class ArrayList {

	public static void main(String[] args) {
		//ArrayList<String> list1=new ArrayList<>();
		
		LinkedList<String> d1=new LinkedList<>();
		
		d1.add("Sunny");
		d1.add("XXX");
		d1.add("Dinesh");
		d1.add("QQdinesh");
		
		System.out.println(d1);
		
		Collections.sort(d1);
		
		System.out.println(d1);
		
		d1.remove(2);
		
		System.out.println(d1);
		
		d1.clear();
		System.out.println(d1);
		d1.add("you");
		d1.add("you");
		d1.add("You");
		d1.add("I");
		d1.add("Bestie");
		
		System.out.println(d1);
		
		d1.remove(3);
		System.out.println(d1);
		
//		d1.clear();
//		System.out.println(d1);
		
		
		d1.size();
		System.out.println(d1); 
		
		d1.size();
		System.out.println(d1);

	}

}
