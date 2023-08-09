package NikhilMain;

import java.util.Scanner;

public class Table {


public static void main(String[] args) {
		
		//1. take Input From User
		//2. check number is Divisible by Self or not
		//3. if divisible print it is Prime Number
		//4. if not divisible print is number is not prime
		
		System.out.println("Enter The Number");
		 int n;
		 
		 Scanner sc=new Scanner(System.in);
		 n = sc.nextInt();
		 
		 System.out.println("Entered Number : " + n);
		
		 
		boolean isPrime = true;
		
		for(int i=2;i<n;i++) 
		{
			if(n%i == 0)
			{
				isPrime = false;
				
			}
		}
		
		if(isPrime)
		{
			System.out.print("Prime Number");
		}else
		{  
			System.out.print("Not Prime Number");
		}
	
	}
	
}


