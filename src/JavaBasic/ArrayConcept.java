package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {

		//Array: To store the same data types value in array veriable.
		//dis-advangate
		//1) fix array 2) store only similar values
		
		//int array
		int i []= new int [5];		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		//System.out.println(i[4]);
		
		//System.out.println(i[5]);  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		//at JavaBasic.ArrayConcept.main(ArrayConcept.java:16)
		
		System.out.println(i.length);
		//System.out.println(i.toString());
		  //print all the size of array
		for(int j =0;j<i.length;j++){
			System.out.println(i[j]);
		}
		
		//double array
		double d[]=new double[3];
		d[0]=10.12;
		d[1]=12.12;
		d[2]=16.12;
		
		System.out.println(d[1]);
		
		//char array
		char c[]= new char[3];
		c[0]='s';
		c[1]='r';
		c[2]='u';
		System.out.println(c[1]);
		
		//boolean array
		
		boolean b[]=new boolean[4];
		b[0]=true;
		b[1]=true;
		b[2]=false;
		b[3]=true;
		
		System.out.println(b[1]);
		
		//String array
		
		String  s[]= new String[3];
		s[0]="00";
		s[1]="Hello";
		s[2]="test";
		
		System.out.println(s[1]);
		
		System.out.println(s.length);
		
		//Object array (object is a class) : used to store different data types.
		Object ob[]= new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]= 12.34;
		ob[3]="01/02/1990";
		ob[4]='M';
		ob[5]="London";
		
		System.out.println(ob[3]);
		//Double dimension array (also called as Dynamic array)
	}

}
