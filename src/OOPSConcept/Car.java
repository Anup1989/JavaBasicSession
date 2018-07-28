package OOPSConcept;

public class Car {
	
	int model;
	int wheel;
	
	

	public static void main(String[] args) {
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model=2016;
		a.wheel=4;
		
		b.model=2015;
		b.wheel=2;
		
		c.model=2014;
		c.wheel=3;
		
		System.out.println(a.model);

	}

}
