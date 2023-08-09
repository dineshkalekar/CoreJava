package Main;
import java.util.Scanner;
public class AdditionDemo {
	private int a,b;
	AdditionDemo(int a,int b)
	{
		a=a;
		b=b;
	}
	public void getdata()
	{
		int res=(a+b);
		System.out.println("Addition="+res);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AdditionDemo obj= new AdditionDemo(10,20);
		AdditionDemo obj2=new AdditionDemo(50,30);
		obj.getdata();
		obj2.getdata();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a\n");
		int x = sc.nextInt();
		System.out.println("Enter value b\n");
		int y = sc.nextInt();
		int z = (x + y);
		System.out.println("Addition=" + z);
	}
}
