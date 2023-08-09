package Main;

import code.OuterAccountClass;

public class AccountMain {

	public static void main(String[] args) {
		OuterAccountClass obj=new OuterAccountClass();
		OuterAccountClass.Inner iobj=obj.new Inner();
		obj.getAcData();
		iobj.getLocker();
	}
}
