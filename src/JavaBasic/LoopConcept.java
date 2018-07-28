package JavaBasic;

public class LoopConcept {

	public static void main(String[] args) {
		
		//While loop
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i=i+1;  //should break the logic here otherwise it will go into continuous loop. Also called as incremental and decrimental
		}
		
		System.out.println("===========");
		//int j = 1;
		//For loop
		for(int j=1;j<=10;j++)
		{
			System.out.println(j);
		}
	}

}
