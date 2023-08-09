package CollectionMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Seed");
		list.add("Sachin");
		list.add("Ramesh");
		list.add("Mahesh");
		list.add("ztw");
		
		System.out.println(list);
//		
//		for(String val:list) 
//		{
//			System.out.println(val);
//		}
//		
//		Collections.sort(list);
//		System.out.println(list);
//		for(String val:list) 
//		{
//			System.out.println(val);
//		}
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	    for(String val:list) {
		System.out.println(""+val);
	    }
	    
	    list.add(2,"Sagar");
	    list.add(3,"Sagar");
	    list.add(0,"hiiiii");
	    
	    System.out.println("List Elements After Adding the Object");
	    for(String val:list) {
	    	System.out.println(val);
	    }
	    
	    list.set(0, "New Data");//repleace it zeroIndex
	    ArrayList<String> list2=new ArrayList<>();
	    list2.add("Virat");
	    list2.add("Sunny");
	    
	    
	    
	    System.out.println("List 2 Element");
	    Iterator itr2=list2.iterator();
	    
	    while(itr2.hasNext()) 
	    {
	    	System.out.println(itr2.next());
	    }
	    
	} 

}
