package JGoogle;

import entities.concretes.User;

public class googleAuthManager {

	public void register(User user) {
		
		System.out.println("Kay�t yap�ld�: "+ user.getFirstName() );
	}
	
	public void logIn(User user) {
		
		System.out.println("Giri� yap�ld�: "+ user.getFirstName());
	}
	
	
	
	
	
}
