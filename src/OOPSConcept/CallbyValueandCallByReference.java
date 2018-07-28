package OOPSConcept;

public class CallbyValueandCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallbyValueandCallByReference obj =new CallbyValueandCallByReference();
		int x=10;
		int y=20;
		
		obj.testSum(x, y); //call by value OR pass by value.
		
		obj.p=30;
		obj.q=40;
		
		obj.swap(obj);
	}
	public int testSum(int a, int b)
	{
		int c= a+b;
		return c;
	}
	//Called by reference
	public void swap(CallbyValueandCallByReference t)
	{
		int temp;
		temp =t.p;
		t.p=t.q;
		t.q=temp;
		
		System.out.println(temp);
	}
}
