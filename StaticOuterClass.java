package code;

public class StaticOuterClass {
	private static int x=200;
	private static int y=300;
	public void getdata()
	{
		System.out.println("Static outer data"+x+y);
	}
	public static class STinner
	{
		private int m=500;
		
		public void getStaticData()
		{
			System.out.println("m="+m);
			System.out.println("Data from inner class="+"\nx= "+x+"\ny=" +y);
		}
	
	}

}
