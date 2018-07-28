package OOPSConcept;

public class LocalandGlobalveriable {
	//global veriable
	String s="anup";
	int a=28;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalandGlobalveriable lg =new LocalandGlobalveriable();
		System.out.println(lg.s);
		System.out.println(lg.a);
		lg.sum();

	}
	
	public void sum()
	{
		int i=10;
		int j=20;
		int a=28;
		System.out.println(a);
		
	}

}
