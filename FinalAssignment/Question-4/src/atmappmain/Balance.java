package atmappmain;

public class Balance extends Server {
	
	static void afterWithdraw(double amount) {
		bankBalance = (bankBalance)-(amount);
		
	}
	
	static void afterDeposite(double amount) {
		bankBalance = bankBalance+amount;
	}
	
	void verify() throws NotMatchingException{
		
		if(uid==id && upw==pw) {
			System.out.println("your Bank Balance Fetched Scucessfully ");
			System.out.println(bankBalance);
		}
		
		else {
			NotMatchingException ne = new NotMatchingException();
			throw ne;
		}
	}
}
