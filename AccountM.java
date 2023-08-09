package Main;

import code.AccountClass;
import code.InsufficuintBalanceExcepation;

public class AccountM {

	public static void main(String[] args){
		AccountClass Ac=new AccountClass(449,"Amit IT learning",10000);
		
		try 
		{
			Ac.withdrow(2000);
		} catch(InsufficuintBalanceExcepation e)
		{
			System.out.println(""+e.getMessage());
		}

	}

}
