package Main;

 enum CoffeePrize {
	SMALL(30), MEDIUM(50), HUGE(60);
	int price;
	 CoffeePrize(int i) {
		price = i;
	}
	public int getprize() {
		return price;
	}
}
public class CoffeeSzie {
	public static void main(String[] args) {
		CoffeePrize Size = CoffeePrize.HUGE;
		{
		System.out.println("prize of Medium CoffeePrize="+Size.getprize());
		}
	}
}
