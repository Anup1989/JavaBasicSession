package OPPSConceptPart2;

public class HSBCBank implements USBank , BrazilBank{ //achieving multiple inheritance

	public void credit() {
		System.out.println("HSBC credit");
	}

	public void debit() {
		System.out.println("HSBC debit");
	}

	public void transfermoney() {
		System.out.println("transfer  money");
	}
	
	public void Educationloan() {
		System.out.println("education  loan");
	}

	public void carloan() {
		System.out.println("car loan");
	}
	
	//brazil bank method
	public void mutualfund() {
		System.out.println("Mutual fund");
	}
}
