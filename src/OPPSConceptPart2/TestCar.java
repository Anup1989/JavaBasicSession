package OPPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		//Static polimorphism or compile time polimorphisym.
		BMW obj= new BMW();
		obj.start();
		obj.stop();
		obj.refuel();
		obj.theftsefty();
		obj.engine();
		
		System.out.println("==========");
		
		Car c =new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("==========");
		//Top casting
		Car c1= new BMW();  //child class object can be refered by perent class reference veriable : dynamic polimorphism.
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down casting is not allowed
		BMW b1=(BMW)new Car();  //Exception in thread "main" java.lang.ClassCastException: OPPSConceptPart2.Car cannot be cast to OPPSConceptPart2.BMW
		

	}

}
