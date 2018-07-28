package OOPSConcept;

public class StaticandNonstatic {
	//global veriabls
	String name="Tom";
	static 	int age=25;
	public static void main(String[] args) {
		//direct calling
		sum();
		//calling by calssname
		StaticandNonstatic.sum();
		
		//Calling variables
		System.out.println(age);
		System.out.println(StaticandNonstatic.age);
		
		//calling non satic method.
		StaticandNonstatic sc = new StaticandNonstatic();
		sc.sendmail();
		System.out.println(sc.name);

		//can we access static methods by object referene? yes.
		
		sc.sum(); //warnig will be given.
	}
	
	public void sendmail()
	{
	System.out.println("send mailer");	
	}
	public static void sum()
	{
		System.out.println("fetch the sum");
	}

}
