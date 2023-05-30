package atmappmain;

public class Withdrawl extends Server {
	
	
	void verify() throws InterruptedException, NotMatchingException{
		if(uid==id && upw==pw) {
			
			System.out.println("Enter the amount to be withdrawl");
			amount=s.nextDouble();
			System.out.println("Loading.........");
			Thread.sleep(4000);
			System.out.println("Your amount has been WITHDRAWL SUCCESSFULLY");
			Thread.sleep(2000);
			Balance.afterWithdraw(amount);
			System.out.println("THANK YOU");
			System.out.println("Your bank balance is");
			System.out.println(bankBalance);
		}
		
		else {
			
			NotMatchingException ne = new NotMatchingException();
			throw ne;
		}
	}

}
