package coreJava;


public class DateMain extends Dinesh {
	
	public void SwapDate(Dinesh []arr) 
	{
		Dinesh temp;
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dinesh dt1=new Dinesh();
		dt1.Accept(2, 5, 2022);
		System.out.println(dt1);
		Dinesh dt2=new Dinesh();
		
		

	}

}
