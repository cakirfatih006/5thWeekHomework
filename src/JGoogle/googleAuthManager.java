package JGoogle;

import entities.concretes.User;

public class googleAuthManager {

	public void register(User user) {
		
		System.out.println("Kayýt yapýldý: "+ user.getFirstName() );
	}
	
	public void logIn(User user) {
		
		System.out.println("Giriþ yapýldý: "+ user.getFirstName());
	}
	
	
	
	
	
}
