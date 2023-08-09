import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aar[] = new int[10];
		
		System.out.println("Enter Array Elements ");

		for (int i = 0; i < 10; i++) {
			
			aar[i] = sc.nextInt();
		}
	}

}
