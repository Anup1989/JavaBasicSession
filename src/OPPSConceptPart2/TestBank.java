package OPPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs =new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.Educationloan();
		hs.carloan();
		hs.mutualfund();
		
		//Dynamic polimorphism
	USBank us=	new HSBCBank();
	us.credit();
	us.debit();
	us.transfermoney();
	
	
	
	

	}

}
