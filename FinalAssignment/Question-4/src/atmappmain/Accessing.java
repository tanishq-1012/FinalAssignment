package atmappmain;

import java.util.ArrayList;

class NotMatchingException extends Exception{
	
	public NotMatchingException() {
		System.out.println("Exception Occurs");
	}
}

 class Accessing {
	 
	 void permit(Server s)throws Exception{
		 
		 try {
			 s.input();
			 
			 s.verify();
		 }
		 
		 catch(InterruptedException | NotMatchingException nme) {
			 System.out.println("Invalid Credentials");
			 
			 try {
				 s.input();
				 s.verify();
			 }
			 
			 catch(NotMatchingException e) {
				 System.out.println("Again Invalid Credentials");
				 
				 try {
					 s.input();
					 s.verify();
				 }
				 
				 catch(NotMatchingException ae) {
					 System.out.println("Not anymore to access. Your Account is BLOCKED for 24 hours");
				 }
				 
			 }
			 finally {
				 System.out.println("Contact your nearest branch for more information");
			 }
		 }
	 }

}
