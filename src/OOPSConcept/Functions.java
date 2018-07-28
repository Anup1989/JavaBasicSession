package OOPSConcept;

public class Functions {

	public static void main(String[] args) {
		Functions f =new Functions();
		f.test();
		int i= f.test1();
		System.out.println(i);
		String s= f.test2();
		System.out.println(s);
		int dd=f.divisionmethod(2, 6);
		System.out.println(dd);
		
		}
	
	//non-static method
	
	//void : does not return a value
	public void test()
	{
		System.out.println("test method");
	}
	//return type: int
	public int test1()
	{
		int a=10;
		int b=20;
		int  c =a+b;
		return c;
		
	}
	//return type: String
	public String test2()
	{
		System.out.println("test2 method");
		String s="Selenium";
		return s;
	}
	//return type: int
	//x,y : input parameters/arguments 
	public int divisionmethod(int x, int y)
	{
		
		int d=x/y;
		return d;
	
	}
	
}
