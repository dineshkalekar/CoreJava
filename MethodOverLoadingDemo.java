package NikhilMain;

public class MethodOverLoadingDemo {
	int a, b, c;

	public void add(int a, int b) {
		int res = (a + b);

		System.out.println("Addition=" + res);

	}

	public void add(int a, int b, int c) {
		int res = (a + b + c);

		System.out.println("Addition=" + res);

	}

	public static void main(String[] args) {
		// System.out.println("Enter numbers");
		MethodOverLoadingDemo obj = new MethodOverLoadingDemo(); 
		obj.add(100, 600);
		obj.add(60, 40, 50);

	}

}
