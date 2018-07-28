package OPPSConceptPart2;

public interface USBank {

	int min_bal = 100;

	public void credit();

	public void debit();

	public void transfermoney();

	// Only method declaration.
	// no method body (can not write {})
	// in intrface we can declare the veriables, adn veriables are bydefult
	// static in nature (can be call from anywhere)
	// var value an not be changed.
	// no static methods are allowed in intrface.
	// no main method in interface.
	// we can not create obj of interface means interface in abstract in nature.
}
