package code;

public class MultipleInheritance implements Printable,Massagable {

	@Override
	public void massage() {
		System.out.println("Multiple Inheritance Message call ");
		
	}

	@Override
	public void print() {
		System.out.println("Multiple Inheritance print call");
		
	}

	@Override
	public void show() {
		System.out.println("Multiple Inheritance show call");
	}

	@Override
	public void display() {
		System.out.println("Multiple Inheritance display call");
	}

}
