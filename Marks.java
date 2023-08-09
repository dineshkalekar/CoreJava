package code;

public class Marks {
	protected int m1, m2, m3;

	public void getdata(int a, int b, int c) {
		m1 = a;
		m2 = b;
		m3 = c;
	}

	public void showMarks() {
		System.out.println("Sub1=" + m1 + "\n" + "Sub2=" + m2 + "\n" + "Sub3=" + m3 + "\n");
	}
}
