package atmappmain;

class Deposit extends Server {
	
	@Override
	void verify() throws Exception, NotMatchingException{
		
		if(uid==id && upw==pw) {
			
			System.out.println("Enter the amount to be deposited");
			amount=s.nextDouble();
			System.out.println("Loading.........");
			Thread.sleep(4000);
			System.out.println("Your amount has been DEPOSITED SUCCESSFULLY");
			Balance.afterDeposite(amount);
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
