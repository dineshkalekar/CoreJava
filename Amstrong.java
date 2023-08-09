package coreJava;

public class Amstrong {

	private int a=1634;
	private int tempt=a;
	private int n;
	private int sum;

	public void dinesh() {
		while (a > 0) {
			n = a % 10;
			sum=n*n*n*n+sum;
			a = a/10;
		}
		if (sum == tempt) {
			System.out.println("It is a Amstrong Number");
		} else
			System.out.println("It is Not a Amstrong Number");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Amstrong amst=new Amstrong();
		amst.dinesh();
	}

}
