package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {

	void register(User user);
	void logIn(User user);
	void delete(User user);
	 
	List<User> getAll();
	
}
