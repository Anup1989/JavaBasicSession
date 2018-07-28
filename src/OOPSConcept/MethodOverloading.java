package OOPSConcept;

public class MethodOverloading {
	//Method name is same with diferent aragument/parameters within the same class.
	//Can not create method inside the method
	//Same method with same input parameters are not allowed.
	public static void main(String[] args) {
		MethodOverloading obj =new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);

	}
	//We can overlad main method with differnt parameters
	public static void main(int p) {
	}
	
	
	public void sum()
	{
		System.out.println("this method");
	}
	
	public void sum(int i)
	{
		System.out.println("1 input parameter");
		System.out.println(i);
	}
	
	public void sum(int x, int y)
	{
		System.out.println("2 input parameter");
		System.out.println(x+y);
	}
}
