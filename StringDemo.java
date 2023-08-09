package Main;

public class StringDemo {

	public static void main(String[] args) {
		String str1 ="seed";
		String str2= new String ("seed");
		String str3="Seed";
		String str4="    Infotech";
		 
		System.out.println("compare string using equel ,method");
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.equals(str2));
		
		System.out.println("compare string using == opertor ,method");
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		
		System.out.println("compare string using compareTo method");
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str1));
		
	    System.out.println("concatination using +="+(str1+str3));
	    System.out.println("concatination using concat method =+"+str1.concat(str2));
	    
	    System.out.println("Substring of Infotech="+str4.substring(0,8));
	    System.out.println("uppercase="+str1.toUpperCase());
	    System.out.println("lowercase="+str4.toLowerCase());
	    System.out.println(str1.endsWith("Seed"));
	    System.out.println(str1.replace('s','$'));
		

	}

}
