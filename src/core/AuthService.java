package core;

import entities.concretes.User;

public interface AuthService {
	void register(User user);
	void logIn(User user);
}
