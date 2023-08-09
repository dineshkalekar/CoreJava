package CollectionMain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(300);
		list.add(3);
		list.add(60); 
		list.add(50);
		List li=list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(li);
	}

}
