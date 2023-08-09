package CollectionMain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapDemo {

	public static void main(String[] args) {
		Map<Integer,String> mp= new HashMap<>();
		mp.put(10, "Sagar");
		mp.put(30, "Sachin");
		mp.put(60, "Dinesh");
		mp.put(20, "Nikhil");
		System.out.println("Map Data"+mp);
		
		Set st=mp.keySet();
		System.out.println("Displaying data in key Value Pair");
		Iterator<Integer> itr=st.iterator();
		while (itr.hasNext()) 
		{
			Integer key=itr.next();
			System.out.println("key="+key+"Value="+mp.get(key));
		}
		
	}

}
