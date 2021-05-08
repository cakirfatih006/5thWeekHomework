package core;

import JGoogle.googleAuthManager;
import entities.concretes.User;

public class GoogleAuthAdaptor implements AuthService{

	@Override
	public void register(User user) {
		
		googleAuthManager authManager = new googleAuthManager();
		authManager.register(user);
		
	}

	@Override
	public void logIn(User user) {
		
		
		googleAuthManager authManager = new googleAuthManager();
		authManager.logIn(user);
		
	}

}
