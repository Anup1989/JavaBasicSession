package JavaBasic;

public class IfelseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=40;
		int b=20;
		
		if(b>a)
		{
			System.out.println("B is greater than a");
		}
		else{
			System.out.println("A is greater than a");
		}
		
		//Comparision operaters
		//< > >== <== !=
		
		int c=50;
		int d=50;
		if(c==d){
			System.out.println("c and d are equal");
		}else
		{
			System.out.println("c and d are not equal");
		}
		
		//Write a programe to find highest number
		//nested if else
		int a1=100;
		int b1=200;
		int c1=300;
		if(a1>b1 & a1>c1)
		{
			System.out.println("A is greatest");
		}
		else if (b1>c1){
			System.out.println("b1 is greatest");
		}else{
			System.out.println("c1 is greatest");
		}
		
	}

}
