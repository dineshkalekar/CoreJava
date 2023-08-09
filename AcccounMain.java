package Main;

import java.util.ArrayList;
import java.util.Scanner;

import code.Employee;
import coreJava.AccountClass;

public class AcccounMain {

	public static void main(String[] args) {
		AccountClass Ac = new AccountClass(101, "Amit", 95000);
		//Ac.display();
		Scanner sc = new Scanner(System.in);
	
		ArrayList<AccountClass> list=new ArrayList<>();
		list.add(new AccountClass (101,"Dinesh",70000) ) ;
		list.add(new AccountClass (102,"Amit",65000) ) ;
		list.add(new AccountClass (103,"Pooja",75000) ) ;
		list.add(new AccountClass (104,"Anuradha",11500) ) ;
		list.add(new AccountClass (105,"Swapnil",30000) ) ;
		System.out.println("1 Display all Details");
		System.out.println("2 Eneter New Record");
		System.out.println("3 Display Selected ID Details");
		
		System.out.println("Select Above  the Choice");
		int n=sc.nextInt();
		
		
		
		switch(n) 
		{
		case 1: 	System.out.println("All Customer Details ");
			for(AccountClass val :list) 
		{
			System.out.println(val);
		}
		break; 
		case 2:System.out.println("Enter the Account ID , Name , Balance");
			list.add(new AccountClass(sc.nextInt(),sc.next(),sc.nextDouble()));
		
		break;
		case 3: if() 
		{
			
		}
		
		
		}	
	}

}
