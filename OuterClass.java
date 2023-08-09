package code;

public class OuterClass {
	private int x=10,y=20;
	
	public void ShowOuter() 
	{
		System.out.println("OuterData \nx="+x+"\ny"+y);
	}
	public class Inner
	{
		private int val =100;
		public void ShowAllData() 
		{
			System.out.println("val="+val);
			System.out.println("InnerClass ="+"\nx="+x+"\ny="+y);
		}		
	}
}
