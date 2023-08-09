package Main;
    class BankAccount
  {
	  private double bal=15000;
	  public synchronized void Withdraw(int amt) throws InterruptedException
	  {
		  if(amt>bal) 
		  {
			  System.out.println("Insuffient Balance ");
			  wait();  
		  }
		  bal=bal-amt;
		  System.out.println("Remaining Balance after Withdraw..."+bal);
	  }
	  public synchronized void deposit(int amt) 
	  {
		   
		  {
			  System.out.println("Balance Before Deposit .."+bal); 
			  bal=bal+amt;
			  notify();
			  System.out.println(" Balance after Deposit..."+bal);
			  
		  }
		  
	  }
	  
  }

public class ThreadSynchronization {

	public static void main(String[] args) {
		
		BankAccount bk=new BankAccount();
		new Thread()
		{
			public void run()
			{
				try {
					bk.Withdraw(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}.start();
		new Thread()
		{
			public void run()
			{
//				try {
//					Thread.currentThread().sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				bk.deposit(15000);		
			}
		}.start();

	}

}
