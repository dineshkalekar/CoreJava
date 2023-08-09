package Main;

import code.OuterClass;

public class SimpleInnerDemo {

	public static void main(String[] args) {
		OuterClass obj=new OuterClass();
		OuterClass.Inner iobj=obj.new Inner();
		obj.ShowOuter();
		iobj.ShowAllData();
	}
}
