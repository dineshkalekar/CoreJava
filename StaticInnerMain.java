package Main;
import code.StaticOuterClass;

public class StaticInnerMain {

	public static void main(String[] args) {
		StaticOuterClass.STinner obj=new StaticOuterClass.STinner();
		obj.getClass();
		obj.getStaticData();
	}

}
