package code;

public class OuterAccountClass {
	private int aid=100;
	private String aname="Dinesh";
	private int balance=25000;
	
	public void getAcData()
	{
		
		System.out.println("Accoount Info ="+" "+aid+" "+aname+" "+balance);
	}	
	public class Inner
	{
		private String locker= "lock";
		
		public void getLocker()
		{
			System.out.println("Get Locker Info="+locker);
			System.out.println("Accoount inner side Info ="+" "+aid+" "+aname+" "+balance);
		}
	}
	
}
