package code;

@FunctionalInterface
public interface MyInterface {
	void display();
	
	default void showdata() 
	{
		System.out.println("Default showdata Method called");
	}
	default void getdata() 
	{ 
		System.out.println("defualt getdata method called");
	}
}
