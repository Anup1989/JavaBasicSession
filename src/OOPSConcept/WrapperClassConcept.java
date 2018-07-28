package OOPSConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20); //string concatination
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Classes for wrapper: interger, boolean
		
		String y ="12.13";
	double d=	Double.parseDouble(y);
	System.out.println(d+20);
	
	//String to boolean
	String a="true";
	boolean b= Boolean.parseBoolean(a);	
	System.out.println(b);
	
	//int to string
	int j=200;
	System.out.println(j+20);
	System.out.println(j);
	String s= String.valueOf(j);
	System.out.println(s+20);
	
	String u ="100A";
	Integer.parseInt(u); //Exception in thread "main" java.lang.NumberFormatException: For input string: "100A"
	
	}

}
