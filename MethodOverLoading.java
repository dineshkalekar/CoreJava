package code;

public class MethodOverLoading {
	private int res;
	public void add(int a,int b) 
	{
		System.out.println("Addition="+(a+b));
	}
	public void add(int a,int b,int c) 
	{
		System.out.println("Addition="+(a+b+c));
	}
	public void add(int a,int b,int c,float d) 
	{
		System.out.println("Addition="+(a+b+c+d));
	}

}
